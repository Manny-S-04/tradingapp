package com.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trading.entities.Sort;
import com.trading.entities.User;

@Repository
public interface SortRepository extends JpaRepository<Sort, Integer> {

}
