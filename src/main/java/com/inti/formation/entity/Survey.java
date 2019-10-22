package com.inti.formation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.inti.formation.CrossedEntity.Citizen_Survey;

import lombok.Data;

@Data
@Entity
public class Survey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int surveyId;
	private String question;
	private String possibleAnswers;

	private String result;
	private int numberRespondents;
	
	// Relations
	@OneToMany(mappedBy = "survey")
	private List<Citizen_Survey> citizenSurveys;
	


}
