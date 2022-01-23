package com.example.OrderManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrderManagementSystem.Dto.Response;
import com.example.OrderManagementSystem.Pojo.Restaurant;
import com.example.OrderManagementSystem.Service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private  OrderService orderService ;
	
	@GetMapping("search/{col}/{val}")
	
	
	public   ResponseEntity<List<Response>> search(
	    @PathVariable(value="col") String col,@PathVariable(value="val") String val)
	{
		
		 List<Response> restaurant = orderService.search(col,val);
	return new ResponseEntity<>(restaurant,HttpStatus.OK) ;
		 
		 
		 
	}
	
	

}
