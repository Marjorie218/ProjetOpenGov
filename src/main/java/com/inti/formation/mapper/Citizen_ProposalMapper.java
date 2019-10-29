package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inti.formation.crossedEntity.Citizen_Proposal;
import com.inti.formation.dto.Citizen_ProposalWithCitizenDto;
import com.inti.formation.dto.Citizen_ProposalWithProposalDto;

@Component
public class Citizen_ProposalMapper {
	
	@Autowired
	ProposalMapper proposalMapper;
	@Autowired
	CitizenMapper citizenMapper;
	
	public Citizen_ProposalWithProposalDto citizen_ProposalTocitizen_ProposalCitizenFullDto(Citizen_Proposal cit_prop) {
		return Citizen_ProposalWithProposalDto.builder()
				.rate(cit_prop.getRate())
				.comment(cit_prop.getComment())
				.proposal(proposalMapper.proposalToProposalWithCreatorDto(cit_prop.getProposal()))
				.build();
	}

	public List<Citizen_ProposalWithProposalDto> citizen_ProposalListToCitizen_ProposalCitizenFullDtoList(List<Citizen_Proposal> citizen_ProposalList) {
		List<Citizen_ProposalWithProposalDto> citizen_ProposalCitizenFullDto = new ArrayList<Citizen_ProposalWithProposalDto>();
		citizen_ProposalList.stream().forEach((cit_prop) -> {
			citizen_ProposalCitizenFullDto.add(this.citizen_ProposalTocitizen_ProposalCitizenFullDto(cit_prop));
		});
		return citizen_ProposalCitizenFullDto;
	}
	
	public Citizen_ProposalWithCitizenDto citizen_ProposalToCitizen_ProposalWithCitizenDto(Citizen_Proposal cit_prop) {
		return Citizen_ProposalWithCitizenDto.builder()
				.rate(cit_prop.getRate())
				.comment(cit_prop.getComment())
				.citizen(citizenMapper.citizenToCitizenCredentialDto(cit_prop.getCitizen()))
				.build();
	}

	public List<Citizen_ProposalWithCitizenDto> citizen_ProposalListToCitizen_ProposalWithCitizenDtoList(List<Citizen_Proposal> citizen_ProposalList) {
		List<Citizen_ProposalWithCitizenDto> citizen_ProposalCitizenFullDto = new ArrayList<Citizen_ProposalWithCitizenDto>();
		citizen_ProposalList.stream().forEach((cit_prop) -> {
			citizen_ProposalCitizenFullDto.add(this.citizen_ProposalToCitizen_ProposalWithCitizenDto(cit_prop));
		});
		return citizen_ProposalCitizenFullDto;
	}

}
