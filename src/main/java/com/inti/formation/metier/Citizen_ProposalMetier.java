package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.crossedEntity.Citizen_Proposal;
import com.inti.formation.iMetier.IGenericMetier;
import com.inti.formation.repository.ICitizen_ProposalRepository;
@Service
public class Citizen_ProposalMetier implements IGenericMetier<Citizen_Proposal>{

	@Autowired
	ICitizen_ProposalRepository citizen_ProposalRepository;
	
	@Override
	public Citizen_Proposal save(Citizen_Proposal citizen_Proposal) {
		return citizen_ProposalRepository.save(citizen_Proposal);
	}

	@Override
	public void update(Citizen_Proposal citizen_Proposal) {
		citizen_ProposalRepository.save(citizen_Proposal);
	}

	@Override
	public void delete(int id) {
		citizen_ProposalRepository.deleteById(id);
	}

	@Override
	public Citizen_Proposal getOne(int id) {
		return citizen_ProposalRepository.getOne(id);
	}

	@Override
	public List<Citizen_Proposal> getAll() {
		return citizen_ProposalRepository.findAll();
	}

}
