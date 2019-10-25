package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inti.formation.dto.ProposalCredentialDto;
import com.inti.formation.dto.ProposalFullDto;
import com.inti.formation.dto.ProposalWithCreatorDto;
import com.inti.formation.entity.Proposal;

@Component
public class ProposalMapper {
	
	@Autowired
	CitizenMapper citizenMapper;
	@Autowired
	Citizen_ProposalMapper citizen_ProposalMapper;

	public Proposal proposalCredentialDtoToProposal(ProposalCredentialDto proposalCredentialDto) {
		return Proposal.builder()
				.proposalId(proposalCredentialDto.getProposalId())
				.title(proposalCredentialDto.getTitle())
				.description(proposalCredentialDto.getDescription())
				.build();
	}

	public ProposalCredentialDto proposalToProposalCredentialDto(Proposal proposal) {
		return ProposalCredentialDto.builder()
				.proposalId(proposal.getProposalId())
				.title(proposal.getTitle())
				.description(proposal.getDescription())
				.build();
	}

	public ProposalWithCreatorDto proposalToProposalWithCreatorDto(Proposal proposal) {
		return ProposalWithCreatorDto.builder()
				.proposalId(proposal.getProposalId())
				.title(proposal.getTitle())
				.description(proposal.getDescription())
				.creatorProposal(citizenMapper.citizenToCitizenCredentialDto(proposal.getCreatorProposal()))
				.build();
	}

	public List<ProposalCredentialDto> proposalListToProposalCredentialDtoList(List<Proposal> proposalList) {
		List<ProposalCredentialDto> proposalCredentialDtoList = new ArrayList<ProposalCredentialDto>();
		proposalList.parallelStream().forEach((prop) -> {
			proposalCredentialDtoList.add(this.proposalToProposalCredentialDto(prop));
		});
		return proposalCredentialDtoList;
	}

	public ProposalFullDto proposalToProposalFullDto(Proposal proposal) {
		return ProposalFullDto.builder()
				.proposalId(proposal.getProposalId())
				.title(proposal.getTitle())
				.description(proposal.getDescription())
				.creatorProposal(citizenMapper.citizenToCitizenCredentialDto(proposal.getCreatorProposal()))
				.citizenProposals(citizen_ProposalMapper.citizen_ProposalListToCitizen_ProposalWithCitizenDtoList(proposal.getCitizenProposals()))
				.build();
	}

	public List<ProposalFullDto> proposalListToProposalFullDtoList(List<Proposal> proposalList) {
		List<ProposalFullDto> proposalFullDtoList = new ArrayList<ProposalFullDto>();
		proposalList.parallelStream().forEach((prop) -> {
			proposalFullDtoList.add(this.proposalToProposalFullDto(prop));
		});
		return proposalFullDtoList;
	}
	
	

}
