package com.inti.formation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.inti.formation.CrossedEntity.Citizen_Proposal;
import com.inti.formation.CrossedEntity.Citizen_Survey;

import lombok.Data;

@Data
@Entity
public class Citizen implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCitizen;
	private String login;
	private String password;
	
	// Relations
	@OneToMany(mappedBy = "creatorProposal")
	private List<Proposal> proposals;
	@OneToMany(mappedBy = "citizen")
	private List<Citizen_Survey> citizenSurveys;
	@OneToMany(mappedBy = "citizen")
	private List<Citizen_Proposal> citizenProposals;
	
	
	
}
