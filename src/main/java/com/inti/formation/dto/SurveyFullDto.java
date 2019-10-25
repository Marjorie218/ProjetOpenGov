package com.inti.formation.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SurveyFullDto {
	
	// Attributes
	private int surveyId;
	private String question;
	private String possibleAnswers;

	private String result;
	private int numberRespondents;
	
	// Relations
	private List<Citizen_SurveyWithCitizenDto> citizenSurveys;

}
