package com.inti.formation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen_SurveyCitizenFullDto {

	// Attributes
	private int vote;
	
	// Relations
	private SurveyCredentialDto survey;

}
