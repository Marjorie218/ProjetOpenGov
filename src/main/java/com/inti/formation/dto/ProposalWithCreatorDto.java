package com.inti.formation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProposalWithCreatorDto {
	
	private int proposalId;
	private String title;
	private String description;
	
	private CitizenCredentialDto creatorProposal;

}
