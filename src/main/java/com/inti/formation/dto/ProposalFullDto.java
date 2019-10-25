package com.inti.formation.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProposalFullDto {
	
	// Attributes
	private int proposalId;
	private String title;
	private String description;
	
	// Relations
	private CitizenCredentialDto creatorProposal;
	private List<Citizen_ProposalWithCitizenDto> citizenProposals;
	
}
