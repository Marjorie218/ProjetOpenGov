package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.inti.formation.IMetier.IGenericMetier;
import com.inti.formation.entity.Survey;
import com.inti.formation.repository.ISurveyRepository;

@Service
public class SurveyMetier implements IGenericMetier<Survey>{

	@Autowired
	private ISurveyRepository repo;

	public ISurveyRepository getRepo() {
		return repo;
	}

	public void setRepo(ISurveyRepository repo) {
		this.repo = repo;
	}

	public void save(Survey s) {
		repo.save(s);
	}

	@Override
	public void update(Survey s) {
		repo.save(s);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

	public Survey getOne(int id) {
		return repo.getOne(id);
	}

	public List<Survey> getAll() {
		return repo.findAll();
	}

}
