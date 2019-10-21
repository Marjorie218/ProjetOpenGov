package com.inti.formation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Citizen {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCitizen;
	private String login;
	private String password;
	
	// Relations
	

}
