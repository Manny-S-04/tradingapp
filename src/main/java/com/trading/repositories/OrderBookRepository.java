package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trading.entities.OrderBook;
import com.trading.entities.User;
@Repository
public interface OrderBookRepository extends JpaRepository<OrderBook, Integer>{

}
