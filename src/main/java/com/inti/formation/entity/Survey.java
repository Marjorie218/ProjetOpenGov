package com.inti.formation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.inti.formation.crossedEntity.Citizen_Survey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@Table(name="SurveyTable") 
@NoArgsConstructor
@AllArgsConstructor
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
