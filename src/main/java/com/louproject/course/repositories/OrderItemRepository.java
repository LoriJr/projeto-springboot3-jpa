package com.louproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.louproject.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
