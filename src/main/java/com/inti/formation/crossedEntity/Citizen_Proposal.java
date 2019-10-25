package com.inti.formation.crossedEntity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Proposal;
import com.inti.formation.idEntity.Citizen_ProposalId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Citizen_Proposal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// Attributes
	private double rate;
	private String comment;
	
	// Relations
	@EmbeddedId 
	private Citizen_ProposalId citizenProposalId;
	@ManyToOne 
	@JoinColumn(name = "citizenId", referencedColumnName = "citizenId", updatable = false, insertable = false)
	private Citizen citizen;
	@ManyToOne 
	@JoinColumn (name = "proposalId", referencedColumnName = "proposalId", updatable = false, insertable = false)
	private Proposal proposal;
}
