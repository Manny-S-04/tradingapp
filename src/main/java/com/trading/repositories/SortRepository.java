package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.entities.Sort;
import com.trading.entities.User;

public interface SortRepository extends JpaRepository<Sort, Integer> {

}
