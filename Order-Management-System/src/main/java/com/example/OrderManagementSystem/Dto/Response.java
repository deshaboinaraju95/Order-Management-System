package com.example.OrderManagementSystem.Dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@ToString
@Setter
@Getter
@JsonAutoDetect(fieldVisibility=Visibility.ANY)
public class Response {
	
	private Long id;
	private String name;
	public Response(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
