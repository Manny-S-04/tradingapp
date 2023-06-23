package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trading.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	

}
