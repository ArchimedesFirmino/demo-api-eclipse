package com.archimedes.demoapieclipse.treco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archimedes.demoapieclipse.treco.model.Treco;

public interface TrecoRepository extends JpaRepository<Treco, Long> {
}
