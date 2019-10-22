package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.inti.formation.entity.Citizen;

@Repository
public interface ICitizenRepository extends JpaRepository<Citizen, Integer> {

	
}
