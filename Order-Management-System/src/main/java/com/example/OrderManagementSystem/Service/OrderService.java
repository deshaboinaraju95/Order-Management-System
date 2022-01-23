package com.example.OrderManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.OrderManagementSystem.Dto.Response;
import com.example.OrderManagementSystem.Pojo.Restaurant;
import com.example.OrderManagementSystem.Repository.RestaurantRepo;

@Service
public class OrderService {

	@Autowired
	private RestaurantRepo restaurantrepo;

	public List<Response> search(String col, String val) {

		/*
		 * if(col.equalsIgnoreCase("location")) { restaurantrepo.searchByLocation(val);
		 * } else if(col.equalsIgnoreCase("distance")) {
		 * restaurantrepo.searchByDistance(val); }
		 * 
		 * 
		 * 
		 */if (col.equalsIgnoreCase("cuisine")) {

			List<Response> searchByCuisine = restaurantrepo.searchByCuisine(val);

			return searchByCuisine;

		} else if (col.equalsIgnoreCase("food_menu")) {
			return restaurantrepo.searchByMenu(val);
		} else if (col.equalsIgnoreCase("restaurant_name")) {
			return restaurantrepo.searchByName(val);
		}

		return null;

	}

}
