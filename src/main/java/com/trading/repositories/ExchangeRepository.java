package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.entities.Exchange;
import com.trading.entities.User;

public interface ExchangeRepository extends JpaRepository<Exchange, Integer>{

}
