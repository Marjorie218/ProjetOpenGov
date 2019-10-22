package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entity.Citizen;
import com.inti.formation.iMetier.IGenericMetier;
import com.inti.formation.repository.ICitizenRepository;

@Service
public class CitizenMetier implements IGenericMetier<Citizen> {
	@Autowired
	private ICitizenRepository repo;

	public ICitizenRepository getRepo() {
		return repo;
	}

	public void setRepo(ICitizenRepository repo) {
		this.repo = repo;
	}

	public void save(Citizen c) {

		repo.save(c);

	}

	@Override
	public void update(Citizen c) {

		repo.save(c);

	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

	public Citizen getOne(int id) {

		return repo.getOne(id);
	}

	public List<Citizen> getAll() {

		return repo.findAll();
	}

}