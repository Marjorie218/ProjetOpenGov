package com.inti.formation.idEntity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Citizen_SurveyId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int citizenId;
	private int surveyId;

}
