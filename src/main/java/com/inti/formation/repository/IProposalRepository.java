package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entity.Proposal;

@Repository
public interface IProposalRepository extends JpaRepository<Proposal, Integer>{

}
