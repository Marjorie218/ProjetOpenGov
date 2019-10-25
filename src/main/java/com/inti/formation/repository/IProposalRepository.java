package com.inti.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.inti.formation.entity.Proposal;

@Repository
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "prop", path = "prop")
public interface IProposalRepository extends JpaRepository<Proposal, Integer>{
	
	@Query(nativeQuery = true, value = "select * from proposal_table")
	@RestResource(rel = "alll", path = "alll")
	public List<Proposal> findAllOverrided() ;
	

}
