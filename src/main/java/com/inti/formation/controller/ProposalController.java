package com.inti.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entity.Proposal;
import com.inti.formation.metier.ProposalMetier;
import lombok.Data;

@RestController
@RequestMapping("/proposals")
@CrossOrigin("http://localhost:4200")
@Data
public class ProposalController {
	
	@Autowired
	private ProposalMetier proposalMetier;

	@RequestMapping(value="/findAll", method = RequestMethod.GET)
	public List<Proposal> findAll() {
		return proposalMetier.getAll();
	}
	
	@PostMapping(value = "/add")
	public Proposal addMyProps(@RequestBody Proposal proposal) {
		return proposalMetier.saveMe(proposal);
	}
}