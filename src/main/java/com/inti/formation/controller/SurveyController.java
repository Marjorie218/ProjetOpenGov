package com.inti.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entity.Survey;
import com.inti.formation.metier.SurveyMetier;

import lombok.Data;

@RestController
@RequestMapping("/surveys")
@CrossOrigin("http://localhost:4200")
@Data
public class SurveyController {
	
	@Autowired
	private SurveyMetier surveyMetier;

	@RequestMapping(value="/findAll", method = RequestMethod.GET)
	public List<Survey> findAll() {
		return surveyMetier.getAll();
	}
}
