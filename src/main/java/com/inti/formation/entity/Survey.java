package com.inti.formation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Survey {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int surveyId;
	private String question;
	private List<String> possibleAnswers;
	private String result;
	private int numberRespondents;
	
	// Relations
	


}
