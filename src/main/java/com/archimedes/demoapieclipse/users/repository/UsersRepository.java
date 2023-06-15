package com.archimedes.demoapieclipse.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archimedes.demoapieclipse.users.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
