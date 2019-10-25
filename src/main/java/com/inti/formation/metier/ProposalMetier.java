package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entity.Proposal;
import com.inti.formation.iMetier.IGenericMetier;
import com.inti.formation.repository.IProposalRepository;

@Service
public class ProposalMetier implements IGenericMetier<Proposal> {
	@Autowired
	private IProposalRepository repo;

	public IProposalRepository getRepo() {
		return repo;
	}

	public void setRepo(IProposalRepository repo) {
		this.repo = repo;
	}

	@Override
	public Proposal save(Proposal p) {
		return repo.save(p);
	}

	public Proposal saveMe(Proposal p) {

		return repo.save(p);

	}

	@Override
	public void update(Proposal p) {
		repo.save(p);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

	public Proposal getOne(int id) {
		return repo.getOne(id);
	}

	public List<Proposal> getAll() {
		return repo.findAll();
	}

	
}
