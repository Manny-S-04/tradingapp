package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.trading.entities.User;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
