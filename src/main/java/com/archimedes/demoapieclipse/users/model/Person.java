package com.archimedes.demoapieclipse.users.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(length = 127, nullable = false)
	private String name;

	@Column(length = 255, nullable = false)
	private String email;

	@Column(length = 63, nullable = false)
	private String password;
}
