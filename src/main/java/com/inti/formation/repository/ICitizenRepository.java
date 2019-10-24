package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.inti.formation.entity.Citizen;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ICitizenRepository extends JpaRepository<Citizen, Integer> {

	public Citizen findByLoginAndPassword(String login, String password);
	public Citizen findByLogin(String login);
	
}
