package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entity.Survey;

@Repository
public interface ISurveyRepository extends JpaRepository<Survey, Integer>{

}
