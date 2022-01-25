package com.example.OrderManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrderManagementSystem.Dto.OrderDto;
import com.example.OrderManagementSystem.Service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private  OrderService orderService;
	
	@PostMapping("createorder")
	
	private String createOrder(@RequestBody OrderDto orderdto)
	
	{
		System.out.println(orderdto);
		return orderService.createOrder(orderdto);
		
		
		

	}
	
	
	

	
}
