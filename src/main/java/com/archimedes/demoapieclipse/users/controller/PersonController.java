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

import com.archimedes.demoapieclipse.users.model.Person;
import com.archimedes.demoapieclipse.users.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	@GetMapping
	public List<Person> getAll() {
		return personRepository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Person getOne(@PathVariable Long id) {
		if (personRepository.existsById(id)) {
			return personRepository.findById(id).get();
		}
		return null;
	}

	@PostMapping
	public Person post(@RequestBody Person person) {
		return personRepository.save(person);
	}

	@DeleteMapping(path = "/{id}", produces = "application/json")
	public String delete(@PathVariable Long id) {
		if (personRepository.existsById(id)) {
			personRepository.deleteById(id);
			return "{\"status\" : \"deleted\" }";
		}
		return "{\"status\" : \"error\" }";
	}
	
	@PutMapping(path = "{id}")
	public Person put(@PathVariable Long id, @RequestBody Person person) {
		return null;
	}
	
	@PatchMapping(path = "{id}")
	public Person patch(@PathVariable Long id, @RequestBody Person person) {
		return null;
	}
}
