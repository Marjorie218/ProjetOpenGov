package com.inti.formation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.inti.formation.crossedEntity.Citizen_Proposal;
import com.inti.formation.crossedEntity.Citizen_Survey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="CitizenTable") 
public class Citizen implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int citizenId;
	@Column(unique = true)
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
