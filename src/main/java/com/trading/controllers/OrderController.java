package com.trading.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.trading.entities.Order;
import com.trading.entities.User;
import com.trading.services.OrderService;
import com.trading.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	OrderService orderService;
	
	
	@GetMapping("/getorders")
	public String getOrders(HttpSession session) {		
		
		User loggedinUser = (User) session.getAttribute("username");
		
		if (loggedinUser != null) {
			
			int userid = loggedinUser.getUserid();
			
			List<Order> orders = orderService.findOrders(userid);
			
			session.setAttribute("listoforders", orders);
			
			return "getorders";
		}else {
			return "login";
		}
	}

	
}
