package com.trading.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.trading.entities.Order;
import com.trading.repositories.OrderRepository;

public class OrderServiceImpl implements OrderService {

	@Autowired 
	private OrderRepository orderRepository;
	
	
	
	
	@Override
	public Order saveOrder(Order order) {
		
		return orderRepository.save(order);
	}
	
	
	

}
