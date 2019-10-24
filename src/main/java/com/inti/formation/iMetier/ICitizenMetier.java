package com.inti.formation.iMetier;

import java.util.List;

import com.inti.formation.entity.Citizen;

public interface ICitizenMetier {

	public Citizen save(Citizen c);
	public void update(Citizen c);
	public void delete(int id);
	public Citizen getOne(int id);
	public List<Citizen> getAll();
	public Citizen authenticate(String login, String password);

}
