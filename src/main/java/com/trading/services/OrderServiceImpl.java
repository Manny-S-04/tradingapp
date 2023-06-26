package com.trading.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trading.entities.Order;
import com.trading.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired 
	private OrderRepository orderRepository;

	@Override
	public List<Order> findOrders(int userid) {
		// TODO Auto-generated method stub
		return orderRepository.findOrders(userid);
	}

	
	@Override
	public Order saveOrder(Order order) {
		
		return orderRepository.save(order);
	}
	
	

}
