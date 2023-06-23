package com.trading.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.trading.entities.Order;

public interface OrderService {
	
	public Order saveOrder(Order order);
	
	public List<Order> partialOrders(int userid);
	public List<Order> filledOrders(int userid);
	
	public void deleteOrder(int userid);

}
