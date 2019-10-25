package com.inti.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.dto.CitizenFullDto;
import com.inti.formation.dto.ProposalFullDto;
import com.inti.formation.entity.Proposal;
import com.inti.formation.mapper.ProposalMapper;
import com.inti.formation.metier.ProposalMetier;
import lombok.Data;

@RestController
@RequestMapping("/proposals")
@CrossOrigin("http://localhost:4200")
@Data
public class ProposalController {
	
	@Autowired
	private ProposalMetier proposalMetier;
	@Autowired
	ProposalMapper proposalMapper;

	@RequestMapping(value="/findAll", method = RequestMethod.GET)
	public List<ProposalFullDto> findAll() {
		return proposalMapper.proposalListToProposalFullDtoList(proposalMetier.getAll());
	}

	@RequestMapping(value="/findOne/{id}", method = RequestMethod.GET)
	public ProposalFullDto find(@PathVariable int id) {
		return proposalMapper.proposalToProposalFullDto(proposalMetier.getOne(id));
	}
	
	@PostMapping(value = "/add")
	public Proposal addMyProps(@RequestBody Proposal proposal) {
		return proposalMetier.saveMe(proposal);
	}
}