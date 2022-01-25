package com.example.OrderManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrderManagementSystem.Pojo.User;
import com.example.OrderManagementSystem.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("getuser/{userId}")
	private User FindUser(@PathVariable( value="userId") Long userId)
	{
		
		return userService.FindUser(userId);
	}
	
}
