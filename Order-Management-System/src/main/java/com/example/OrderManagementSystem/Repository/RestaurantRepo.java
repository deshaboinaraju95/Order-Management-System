package com.example.OrderManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OrderManagementSystem.Dto.Response;
import com.example.OrderManagementSystem.Pojo.Restaurant;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {

	
	@Query("SELECT DISTINCT new com.example.OrderManagementSystem.Dto.Response(r.restaurantId,r.restaurantName) from Restaurant r INNER JOIN r.menu as i INNER JOIN i.items as m where m.name = ?1 ") 

	List<Response> searchByCuisine(String val);                                                                                                                  
                                                                                                                                                                 
     

	@Query("SELECT DISTINCT new com.example.OrderManagementSystem.Dto.Response(r.restaurantId,r.restaurantName) from Restaurant r INNER JOIN r.menu as i where UPPER(i.type) LIKE UPPER('?1%')") 
	
	List<Response> searchByMenu(String val);
	
	@Query("SELECT DISTINCT new com.example.OrderManagementSystem.Dto.Response(r.restaurantId,r.restaurantName) from Restaurant r where UPPER (r.restaurantName) LIKE UPPER('?1%') ") 
	List<Response> searchByName(String val);

}
