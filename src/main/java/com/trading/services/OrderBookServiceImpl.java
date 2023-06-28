package com.trading.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trading.entities.OrderBook;
import com.trading.repositories.OrderBookRepository;


@Service
public class OrderBookServiceImpl implements OrderBookService {
	
	@Autowired
	private OrderBookRepository orderBookRepository;

	@Override
	public OrderBook allorderBooks() {
		
		return (OrderBook) orderBookRepository.findAll();
	}

	@Override
	public int findOrderBookId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
