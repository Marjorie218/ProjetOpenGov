package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entity.Citizen;
import com.inti.formation.iMetier.ICitizenMetier;
import com.inti.formation.iMetier.IGenericMetier;
import com.inti.formation.repository.ICitizenRepository;

import lombok.Data;

@Data
@Service
public class CitizenMetier implements ICitizenMetier {
	
	@Autowired
	private ICitizenRepository repo;

	public Citizen save(Citizen c) {
		if(repo.findByLogin(c.getLogin()) == null) {
			return repo.save(c);
		}
		return null;
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

	public Citizen authenticate(String login, String password) {
		return repo.findByLoginAndPassword(login, password);
	}

}