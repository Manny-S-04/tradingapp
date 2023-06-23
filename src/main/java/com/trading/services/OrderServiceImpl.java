package com.trading.services;

import java.util.List;

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




	@Override
	public List<Order> partialOrders(int userid) {
		return orderRepository.partialOrders(userid);
	}

	
	



	@Override
	public List<Order> filledOrders(int userid) {
		return orderRepository.filledOrders(userid);
	}




	@Override
	public void deleteOrder(int userid) {
		orderRepository.deleteOrder(userid);
		
	}




	
	
	

}
