package com.trading.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.trading.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	
@Query("SELECT o FROM Order o JOIN User u ON o.userid = u.userid WHERE o.status = 'partial' AND u.userid = :userid")
public List<Order> partialOrders(@Param("userid") int userid);


@Query("SELECT o FROM Order o JOIN User u ON o.userid = u.userid WHERE o.status = 'filled' AND u.userid = :userid")
public List<Order> filledOrders(@Param("userid") int userid);

@Query("DELETE FROM Order o JOIN User u ON o.userid = u.userid WHERE o.status = 'partial' AND u.userid = :userid")
public void deleteOrder(@Param("userid") int userid);



 

}
