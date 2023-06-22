package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.entities.OrderBook;
import com.trading.entities.User;

public interface OrderBookRepository extends JpaRepository<OrderBook, Integer>{

}
