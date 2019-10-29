package com.inti.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.dto.Citizen_SurveyCredentialDto;
import com.inti.formation.dto.Citizen_SurveyInputDto;
import com.inti.formation.mapper.Citizen_SurveyMapper;
import com.inti.formation.metier.Citizen_SurveyMetier;
import lombok.Data;

@RestController
@RequestMapping("/citizenSurveys")
@CrossOrigin("http://localhost:4200")
@Data
public class Citizen_SurveyController {
	
	@Autowired
	private Citizen_SurveyMetier citizen_SurveyMetier;
	@Autowired
	private Citizen_SurveyMapper citizen_SurveyMapper;
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Citizen_SurveyCredentialDto add(@RequestBody Citizen_SurveyInputDto citizen_SurveyInputDto) {
		System.out.println("Méthode appelée");
		return citizen_SurveyMapper.citizen_SurveyToCitizen_SurveyCredentialDto(
				citizen_SurveyMetier.save(citizen_SurveyMapper.citizen_SurveyInputDtoToCitizen_Survey(citizen_SurveyInputDto))
				);
	}
}