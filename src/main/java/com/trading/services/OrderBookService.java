package com.trading.services;

import org.springframework.stereotype.Service;

import com.trading.entities.OrderBook;

@Service
public interface OrderBookService {
	
	public OrderBook allorderBooks();

	public int findOrderBookId();

	

}
