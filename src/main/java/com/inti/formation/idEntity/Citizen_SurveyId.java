package com.inti.formation.idEntity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen_SurveyId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int citizenId;
	private int surveyId;

}
