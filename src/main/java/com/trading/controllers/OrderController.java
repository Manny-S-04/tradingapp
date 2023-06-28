package com.trading.controllers;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trading.entities.Order;
import com.trading.entities.User;
import com.trading.services.OrderBookService;
import com.trading.services.OrderService;
import com.trading.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {

	@Autowired
	UserService userService;

	@Autowired
	OrderService orderService;

	@Autowired
	OrderBookService orderBookService;

	@GetMapping("/getorders")
	public String getOrders(HttpSession session) {

		User loggedinUser = (User) session.getAttribute("loggedinuser");

		if (loggedinUser != null) {

			int userid = loggedinUser.getUserid();

			List<Order> orders = orderService.findOrders(userid);

			session.setAttribute("listoforders", orders);

			return "getorders";
		} else {
			return "login";
		}
	}

	@PostMapping("/createorder")
	public String createOrder(HttpSession session, @RequestParam("ordertype") String orderType, @RequestParam("status") String status, @RequestParam("stock") String stock,
			@RequestParam("price") double price) {
		
		User loggedinUser = (User) session.getAttribute("username");
		
		if (loggedinUser != null) {
			
			int userid = loggedinUser.getUserid();
			
			int orderbookid = orderBookService.findOrderBookId(); 
								
			Order order = new Order(userid, orderbookid, orderType, status, stock, price);
		
			orderService.saveOrder(order);
			
			return "redirect:/createorder";
		
		}else {
			
			return "login";
			
		}
	}

	@GetMapping("/createorder")
	public String getCreateOrder(HttpSession session) {

		User loggedinUser = (User) session.getAttribute("username");

		if (loggedinUser != null) {
			
			return "createorder";
		}else {
			
			return "login";
			
		}

	

	}

}