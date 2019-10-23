package com.inti.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.crossedEntity.Citizen_Survey;
import com.inti.formation.metier.Citizen_SurveyMetier;
import lombok.Data;

@RestController
@RequestMapping("/citizen_Surveys")
@CrossOrigin("http://localhost:4200")
@Data
public class Citizen_SurveyController {
	
	@Autowired
	private Citizen_SurveyMetier citizen_SurveyMetier;

	@RequestMapping(value="/findAll", method = RequestMethod.GET)
	public List<Citizen_Survey> findAll() {
		return citizen_SurveyMetier.getAll();
	}
}