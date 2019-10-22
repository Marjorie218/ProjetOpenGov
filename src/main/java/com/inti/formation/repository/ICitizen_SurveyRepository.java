package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.inti.formation.CrossedEntity.Citizen_Survey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ICitizen_SurveyRepository extends JpaRepository<Citizen_Survey, Integer>{

}