package com.archimedes.demoapieclipse.model;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Treco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp date;
	
	@Column(length = 63, nullable = false)
	private String name;
	
	@Column(length = 127)
	private String description;
}
