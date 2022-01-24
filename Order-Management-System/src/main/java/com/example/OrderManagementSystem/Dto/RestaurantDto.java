package com.example.OrderManagementSystem.Dto;

import javax.persistence.OneToOne;

import com.example.OrderManagementSystem.Pojo.Location;

public class RestaurantDto {
	
	private Long restaurantId;
	private String restaurantName;

	
	private Location location;
	
	private Double minimumBudget;

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Double getMinimumBudget() {
		return minimumBudget;
	}

	public void setMinimumBudget(Double minimumBudget) {
		this.minimumBudget = minimumBudget;
	}

	public RestaurantDto(Long restaurantId, String restaurantName, Location location, Double minimumBudget) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.location = location;
		this.minimumBudget = minimumBudget;
	}
	
	

}
