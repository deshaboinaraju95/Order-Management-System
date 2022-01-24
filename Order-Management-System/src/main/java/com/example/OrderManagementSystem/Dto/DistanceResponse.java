package com.example.OrderManagementSystem.Dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@JsonAutoDetect(fieldVisibility=Visibility.ANY)
public class DistanceResponse {
	
	
	private Long id;
	private String name;
	private Double latitude;
	private Double logitude;
	public DistanceResponse(Long id, String name, Double latitude, Double logitude) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.logitude = logitude;
	}
	@Override
	public String toString() {
		return "DistanceResponse [id=" + id + ", name=" + name + ", latitude=" + latitude + ", logitude=" + logitude
				+ "]";
	}

}
