package com.trading.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.trading.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	@Query(value = "SELECT o.* FROM orders o INNER JOIN user u ON o.userid = u.userid WHERE u.userid = ?", nativeQuery = true)
	public List<Order> findOrders(int userid);


 

}
