package com.inti.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.crossedEntity.Citizen_Proposal;
import com.inti.formation.metier.Citizen_ProposalMetier;
import lombok.Data;

@RestController
@RequestMapping("/citizen_Proposals")
@CrossOrigin("http://localhost:4200")
@Data
public class Citizen_ProposalController {
	
	@Autowired
	private Citizen_ProposalMetier citizen_ProposalMetier;

	@RequestMapping(value="/findAll", method = RequestMethod.GET)
	public List<Citizen_Proposal> findAll() {
		return citizen_ProposalMetier.getAll();
	}
}