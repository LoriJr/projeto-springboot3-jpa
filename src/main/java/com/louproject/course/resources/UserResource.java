package com.louproject.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.louproject.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {	

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Lourival", "lou@gmail.com", "11955852578", "123456789");
		return ResponseEntity.ok().body(u);
	}
	
}
