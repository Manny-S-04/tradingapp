package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trading.entities.Exchange;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, Integer>{

}
