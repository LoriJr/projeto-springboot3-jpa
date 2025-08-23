package com.louproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.louproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
