package com.inti.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.dto.SurveyEfficace;
import com.inti.formation.dto.SurveyFullDto;
import com.inti.formation.entity.Survey;
import com.inti.formation.mapper.SurveyEfficaceMapper;
import com.inti.formation.mapper.SurveyMapper;
import com.inti.formation.metier.SurveyMetier;

import lombok.Data;

@RestController
@RequestMapping("/surveys")
@CrossOrigin("http://localhost:4200")
@Data
public class SurveyController {
	
	@Autowired
	private SurveyMetier surveyMetier;
	@Autowired
	private SurveyMapper surveyMapper;
	@Autowired
	private SurveyEfficaceMapper efficaceMapper;

	@RequestMapping(value="/findAll", method = RequestMethod.GET)
	public List<SurveyFullDto> findAll() {
		return surveyMapper.surveyListToSurveyWithVotersDtoList(surveyMetier.getAll());
	}

	@RequestMapping(value="/findOne/{id}", method = RequestMethod.GET)
	public SurveyFullDto find(@PathVariable int id) {
		return surveyMapper.surveyToSurveyWithVotersDto(surveyMetier.getOne(id));
	}
	
	@PostMapping(value = "/add")
	public Survey addMySurv(@RequestBody Survey survey) {
		return surveyMetier.save(survey);
	}

	@RequestMapping(value="/findEff/{id}", method = RequestMethod.GET)
	public SurveyEfficace findEff(@PathVariable int id) {
		return efficaceMapper.surveyToSurveyEfficace(surveyMetier.getOne(id));
	}
	
}
