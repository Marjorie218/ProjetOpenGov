package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.inti.formation.entity.Survey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ISurveyRepository extends JpaRepository<Survey, Integer>{

}
