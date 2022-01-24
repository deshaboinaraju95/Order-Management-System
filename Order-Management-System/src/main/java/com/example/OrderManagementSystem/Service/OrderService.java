package com.example.OrderManagementSystem.Service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.OrderManagementSystem.Dto.DistanceResponse;
import com.example.OrderManagementSystem.Dto.Response;
import com.example.OrderManagementSystem.Pojo.Restaurant;
import com.example.OrderManagementSystem.Repository.RestaurantRepo;

@Service
public class OrderService {

	@Autowired
	private RestaurantRepo restaurantrepo;

	public List<Response> search(String col, String val) {

	
		    if(col.equalsIgnoreCase("distance")) {
		 List<DistanceResponse> searchByDistance = restaurantrepo.searchByDistance(val);
		 
		 String[] locationValues = val.split(",");
		 Double lot=Double.parseDouble(locationValues[0]) ;
		 Double log=Double.parseDouble(locationValues[1]) ;
		 HashMap<Response, Double> hm = new HashMap<>();
		 
		 for(DistanceResponse r: searchByDistance)
		 {
			 
			 
			 
			 double distFrom = OrderService.distFrom(lot, log,r.getLatitude(), r.getLogitude());
			  hm.put(new Response(r.getId(), r.getName()), distFrom);
			 
		 }
		 
		Stream<Response> map = hm.entrySet().stream().sorted((v1,v2)->v1.getValue().compareTo(v2.getValue())).limit(2).map((v1)-> v1.getKey());
		return (List<Response>) map;
			 
			 
			 
			
		    }
		
		    else if(col.equalsIgnoreCase("location")) { 
			 return restaurantrepo.searchByLocation(val);
		 } 
		if (col.equalsIgnoreCase("cuisine")) {

			List<Response> searchByCuisine = restaurantrepo.searchByCuisine(val);

			return searchByCuisine;

		} else if (col.equalsIgnoreCase("food_menu")) {
			return restaurantrepo.searchByMenu(val);
		} else if (col.equalsIgnoreCase("restaurant_name")) {
			return restaurantrepo.searchByName(val);
		}
		
		

		return null;

	}
	
	 public static double distFrom(double d, double e, double f, double g) {
		    double earthRadius = 6371000; //meters
		    double dLat = Math.toRadians(f-d);
		    double dLng = Math.toRadians(g-e);
		    double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		               Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(f)) *
		               Math.sin(dLng/2) * Math.sin(dLng/2);
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		    double dist =  (earthRadius * c);

		    return  dist;                                   // Math.round(dist*100) / 100.0;
		    }
	

}
