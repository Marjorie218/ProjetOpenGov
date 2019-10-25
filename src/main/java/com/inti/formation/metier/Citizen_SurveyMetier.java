package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.crossedEntity.Citizen_Survey;
import com.inti.formation.iMetier.IGenericMetier;
import com.inti.formation.repository.ICitizen_SurveyRepository;
@Service
public class Citizen_SurveyMetier implements IGenericMetier<Citizen_Survey>{

	@Autowired
	ICitizen_SurveyRepository citizen_SurveyRepository;
	
	@Override
	public Citizen_Survey save(Citizen_Survey citizen_Survey) {
		return citizen_SurveyRepository.save(citizen_Survey);
	}

	@Override
	public void update(Citizen_Survey citizen_Survey) {
		citizen_SurveyRepository.save(citizen_Survey);
	}

	@Override
	public void delete(int id) {
		citizen_SurveyRepository.deleteById(id);
	}

	@Override
	public Citizen_Survey getOne(int id) {
		return citizen_SurveyRepository.getOne(id);
	}

	@Override
	public List<Citizen_Survey> getAll() {
		return citizen_SurveyRepository.findAll();
	}

}
