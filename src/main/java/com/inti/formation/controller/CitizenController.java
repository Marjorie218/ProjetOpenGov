package com.inti.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entity.Citizen;
import com.inti.formation.metier.CitizenMetier;

import lombok.Data;

@RestController
@RequestMapping("/citizens")
@CrossOrigin("http://localhost:4200")
@Data
public class CitizenController {
	
	@Autowired
	private CitizenMetier citizenMetier;

	@RequestMapping(value="/findAll", method = RequestMethod.GET)
	public List<Citizen> findAll() {
		return citizenMetier.getAll();
	}

}
