package com.inti.formation.dto;

import java.util.List;

import com.inti.formation.crossedEntity.Citizen_Survey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SurveyWithVotersDto {
	
	// Attributes
	private int surveyId;
	private String question;
	private String possibleAnswers;

	private String result;
	private int numberRespondents;
	
	// Relations
	private CitizenCredentialDto citizenCredentialDto;

}
