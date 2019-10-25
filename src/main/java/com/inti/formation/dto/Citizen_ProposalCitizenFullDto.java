package com.inti.formation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen_ProposalCitizenFullDto {
	
	// Attributes
	private double rate;
	private String comment;
	
	// Relations
	private ProposalWithCreatorDto proposal;

}
