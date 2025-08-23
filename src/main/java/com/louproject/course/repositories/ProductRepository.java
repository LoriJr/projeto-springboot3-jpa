package com.louproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.louproject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
