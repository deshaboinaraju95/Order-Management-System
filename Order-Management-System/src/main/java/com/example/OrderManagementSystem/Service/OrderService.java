package com.example.OrderManagementSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.OrderManagementSystem.Dto.MenuItemDto;
import com.example.OrderManagementSystem.Dto.MenuItemQuantityDto;
import com.example.OrderManagementSystem.Dto.OrderDto;
import com.example.OrderManagementSystem.Pojo.MenuItem;
import com.example.OrderManagementSystem.Pojo.Order;
import com.example.OrderManagementSystem.Pojo.OrderStatus;
import com.example.OrderManagementSystem.Pojo.User;
import com.example.OrderManagementSystem.Repository.MenuItemRepository;
import com.example.OrderManagementSystem.Repository.OrderRepo;
import com.example.OrderManagementSystem.Repository.UserRepo;

@Service
public class OrderService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private MenuItemRepository menuItemRepository;
	@Autowired
	private OrderRepo orderRepo;
	@Autowired
	private RestTemplate restTemplate;

	public String  createOrder(OrderDto orderdto) {

		List<MenuItemQuantityDto> menuItemDto = orderdto.getMenuItemQuantityDto();

		Double totalCost = 0.0;
		List<MenuItem> menuItem=new ArrayList<>();
		Order order = new Order(); 

		for (MenuItemQuantityDto m : menuItemDto) {

			MenuItemDto[] menuObject = restTemplate.getForObject(
					"http://localhost:8080/getmenuitem/" + orderdto.getRestaurantId() + "/" + m.getMenuItemId(),
					MenuItemDto[].class);

			totalCost += menuObject[0].getPrice() * m.getQuantity();
			MenuItem menu =new MenuItem();
			menu.setImageUrl(menuObject[0].getImageUrl());menu.setInfo(menuObject[0].getInfo());menu.setName(menuObject[0].getName());menu.setPrice(menuObject[0].getPrice());

			menuItem.add(menu);
			
		}

		            
		order.setTotalCost(totalCost);
		order.setNote(orderdto.getNote());
		order.setOrderStatus(OrderStatus.PENDING);
		order.setUser(restTemplate.getForObject(
					"http://localhost:8080/getuser/" + orderdto.getUserId() ,
					User.class));
	   order.setMitems(menuItem);
		

		orderRepo.save(order);
		
		
		return "Done OK";

	}

}
