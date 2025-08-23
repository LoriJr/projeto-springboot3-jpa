package com.louproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.louproject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
