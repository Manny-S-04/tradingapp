package com.trading.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trading.entities.Order;

@Service
public interface OrderService {

	public List<Order> findOrders(int userid);

	public Order saveOrder(Order order);
	
}
