package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.formation.IMetier.IGenericMetier;
import com.inti.formation.entity.Survey;
import com.inti.formation.repository.ISurveyRepository;

public class SurveyMetier implements IGenericMetier<Survey> {

	@Autowired
	ISurveyRepository surveyRepository;
	
	@Override
	public void save(Survey survey) {
		surveyRepository.save(survey);
	}

	@Override
	public void update(Survey survey) {
		surveyRepository.save(survey);
	}

	@Override
	public void delete(int id) {
		surveyRepository.deleteById(id);
	}

	@Override
	public Survey getOne(int id) {
		return surveyRepository.getOne(id);
	}

	@Override
	public List<Survey> getAll() {
		return surveyRepository.findAll();
	}

}
