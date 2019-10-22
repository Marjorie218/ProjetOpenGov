package com.inti.formation.CrossedEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Proposal;
import lombok.Data;

@Data
@Entity
public class Citizen_Proposal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// Attributes
	private double rate;
	private String comment;
	
	// Relations
	@ManyToOne 
	@JoinColumn (name = "fkCitizen", referencedColumnName = "citizenId")
	private Citizen citizen;
	@ManyToOne 
	@JoinColumn (name = "fkProposal", referencedColumnName = "proposalId")
	private Proposal proposal;
}
