package com.inti.formation.CrossedEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Proposal;
import lombok.Data;

@Data
@Entity
public class Citizen_Proposal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	private int idtable1;
	// Attributes
	private double rate;
	private String comment;
	
	// Relations
	@ManyToOne 
	@PrimaryKeyJoinColumn(name = "fkCitizen", referencedColumnName = "citizenId")
	private Citizen citizen;
	
	@ManyToOne 
	@PrimaryKeyJoinColumn(name = "fkProposal", referencedColumnName = "proposalId")
	private Proposal proposal;
}
