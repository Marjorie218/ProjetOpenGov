package com.inti.formation.dto;

import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Survey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Citizen_SurveyInputDto {

	// Attributes
	private int vote;
	
	// Relations
	private Citizen citizen;
	private Survey survey;
	
}
