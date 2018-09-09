package com.sgic.myleave.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.myleave.entity.User;
import com.sgic.myleave.service.UserService;

@RestController

public class UserController {

	@Autowired
	public UserService userService;

	@GetMapping("/users")
	public List<User> getUser() {
		return userService.getUser();
	}

	@PostMapping("/users")
	public List<User> createUsers(@Valid@RequestBody User user) {
		return userService.createUsers(user);
	}

	@PutMapping("/users/{id}") // update
	public boolean update(@RequestBody User user, @PathVariable("id") Integer id) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/users/{id}") // delete
	public boolean delete(@PathVariable("id") Integer id) {
		return userService.deleteUser(id);
	}

}
