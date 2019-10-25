package com.inti.formation.crossedEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.inti.formation.entity.Citizen;
import com.inti.formation.entity.Survey;
import com.inti.formation.idEntity.Citizen_SurveyId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Citizen_Survey implements Serializable{
	
	private static final long serialVersionUID = 1L;

	// Attributes
	private int vote;
	
	// Relations
	@EmbeddedId
	private Citizen_SurveyId citizenSurveyId;
	@ManyToOne 
	@JoinColumn (name = "citizenId", referencedColumnName = "citizenId", updatable = false, insertable = false)
	private Citizen citizen;
	@ManyToOne 
	@JoinColumn (name = "surveyId", referencedColumnName = "surveyId", updatable = false, insertable = false)
	private Survey survey;

}
