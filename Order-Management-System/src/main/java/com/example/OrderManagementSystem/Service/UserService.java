package com.example.OrderManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrderManagementSystem.Pojo.User;
import com.example.OrderManagementSystem.Repository.UserRepo;

@Service
public class UserService {
	@Autowired 
	private UserRepo userRepo;

	public User FindUser(Long userId) {
		return userRepo.findById(userId).get();
	}

}
