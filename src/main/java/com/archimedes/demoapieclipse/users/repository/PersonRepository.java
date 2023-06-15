package com.archimedes.demoapieclipse.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archimedes.demoapieclipse.users.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
