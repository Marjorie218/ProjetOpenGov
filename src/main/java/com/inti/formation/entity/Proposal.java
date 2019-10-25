package com.inti.formation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.inti.formation.crossedEntity.Citizen_Proposal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@Table(name="ProposalTable") 
@NoArgsConstructor
@AllArgsConstructor
public class Proposal implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proposalId;
	private String title;
	private String description;
	
	// Relations
	@ManyToOne
	@JoinColumn(name="idCitizen")
	private Citizen creatorProposal;
	@OneToMany(mappedBy = "proposal")
	private List<Citizen_Proposal> citizenProposals;
	
	

}
