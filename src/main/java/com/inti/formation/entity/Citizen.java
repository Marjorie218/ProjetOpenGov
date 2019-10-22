package com.inti.formation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.inti.formation.crossedEntity.Citizen_Proposal;
import com.inti.formation.crossedEntity.Citizen_Survey;

import lombok.Data;

@Data
@Entity
@Table(name="CitizenTable") 
public class Citizen implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int citizenId;
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
