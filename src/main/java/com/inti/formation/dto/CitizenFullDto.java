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
public class CitizenFullDto {
	
	// Attributes
	private int citizenId;
	private String login;
	private String password;
	
	// Relations
	private List<ProposalCredentialDto> proposals;
	private List<Citizen_SurveyWithSurveyDto> citizenSurveys;
	private List<Citizen_ProposalWithProposalDto> citizenProposals;

}
