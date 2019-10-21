package com.inti.formation.CrossedEntity;

import javax.persistence.Entity;

import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Proposal;
import lombok.Data;

@Data
@Entity
public class Citizen_Proposal {
	
	// Attributes
	private double rate;
	private String comment;
	
	// Relations
	private Citizen citizen;
	private Proposal proposal;
}
