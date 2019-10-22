package com.inti.formation.CrossedEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Survey;

import lombok.Data;

@Data
@Entity
public class Citizen_Survey implements Serializable{
	
	private static final long serialVersionUID = 1L;

	// Attributes
	private int vote;
	
	// Relations
	@ManyToOne 
	@JoinColumn (name = "fkCitizen", referencedColumnName = "citizenId")
	private Citizen citizen;
	@ManyToOne 
	@JoinColumn (name = "fkSurvey", referencedColumnName = "surveyId")
	private Survey survey;

}
