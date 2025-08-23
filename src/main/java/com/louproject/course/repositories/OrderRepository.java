package com.louproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.louproject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
