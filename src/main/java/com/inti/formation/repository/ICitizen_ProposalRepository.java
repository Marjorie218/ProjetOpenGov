package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.inti.formation.crossedEntity.Citizen_Proposal;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ICitizen_ProposalRepository extends JpaRepository<Citizen_Proposal, Integer>{

}