package com.yoav.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.yoav.jpa.entity.User;
import com.yoav.jpa.services.UsersService;

@RestController
public class UserController {

	// Annotation
	@Autowired
	private UsersService UserService;

	// Save operation
	@PostMapping("/users")
	public User saveUser(@RequestBody User User) {

		return UserService.saveUser(User);
	}

	// Read operation
	@GetMapping("/users")
	public List<User> fetchUserList() {

		return UserService.fetchUsersList();
	}

	// Update operation
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User User, @PathVariable("id") Long UserId) {

		return UserService.updateUser(User, UserId);
	}

	// Delete operation
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable("id") Long UserId) {

		UserService.deleteUserById(UserId);
		return "Deleted Successfully";
	}
}
