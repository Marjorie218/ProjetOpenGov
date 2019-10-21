package com.inti.formation.CrossedEntity;

import javax.persistence.Entity;

import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Survey;

import lombok.Data;

@Data
@Entity
public class Citizen_Survey {
	
	// Attributes
	private int vote;
	
	// Relations
	private Citizen citizen;
	private Survey survey;

}
