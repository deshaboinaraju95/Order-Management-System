package com.example.OrderManagementSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OrderManagementSystem.Pojo.Restaurant;
@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {

}
