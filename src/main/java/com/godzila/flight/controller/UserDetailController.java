package com.godzila.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.godzila.flight.domain.UserRepository;
import com.godzila.flight.entity.User;

@RestController
@RequestMapping("/api")
public class UserDetailController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/userdetails") 
	public Iterable<User> getUserDetails() {
		return this.userRepository.findAll();
	}
	
	@RequestMapping("/userdetail")
	public User getUserDetailsById(@RequestParam("id") int id) {
		System.out.println(this.userRepository.findById(id).get().getUserName());
		return this.userRepository.findById(id).get();
	}
}
