package com.archimedes.demoapieclipse.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.archimedes.demoapieclipse.users.model.Users;
import com.archimedes.demoapieclipse.users.repository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersRepository usersRepository;

	@GetMapping
	public List<Users> getAll() {
		return usersRepository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Users getOne(@PathVariable Long id) {
		if (usersRepository.existsById(id)) {
			return usersRepository.findById(id).get();
		}
		return null;
	}

	@PostMapping
	public Users post(@RequestBody Users users) {
		return usersRepository.save(users);
	}

	@DeleteMapping(path = "/{id}", produces = "application/json")
	public String delete(@PathVariable Long id) {
		if (usersRepository.existsById(id)) {
			usersRepository.deleteById(id);
			return "{\"status\" : \"deleted\" }";
		}
		return "{\"status\" : \"error\" }";
	}
	
	@PutMapping(path = "{id}")
	public Users put(@PathVariable Long id, @RequestBody Users users) {
		return null;
	}
	
	@PatchMapping(path = "{id}")
	public Users patch(@PathVariable Long id, @RequestBody Users users) {
		return null;
	}
}
