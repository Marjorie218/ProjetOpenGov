package com.inti.formation.CrossedEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Survey;

import lombok.Data;

@Data
@Entity
public class Citizen_Survey implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private int idtable2;
	// Attributes
	private int vote;
	
	// Relations
	@ManyToOne 
	@PrimaryKeyJoinColumn (name = "fkCitizen", referencedColumnName = "citizenId")
	private Citizen citizen;
	@ManyToOne 
	@PrimaryKeyJoinColumn (name = "fkSurvey", referencedColumnName = "surveyId")
	private Survey survey;

}
