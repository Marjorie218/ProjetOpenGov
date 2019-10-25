package com.inti.formation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen_SurveyWithCitizenDto {

	// Attributes
	private int vote;
	
	// Relations
	private CitizenCredentialDto citizen;

}
