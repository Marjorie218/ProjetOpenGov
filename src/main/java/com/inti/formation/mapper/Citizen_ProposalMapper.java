package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inti.formation.crossedEntity.Citizen_Proposal;
import com.inti.formation.dto.Citizen_ProposalCitizenFullDto;

@Component
public class Citizen_ProposalMapper {
	
	@Autowired
	ProposalMapper proposalMapper;
	
	public Citizen_ProposalCitizenFullDto citizen_ProposalTocitizen_ProposalCitizenFullDto(Citizen_Proposal cit_prop) {
		return Citizen_ProposalCitizenFullDto.builder()
				.rate(cit_prop.getRate())
				.comment(cit_prop.getComment())
				.proposal(proposalMapper.proposalToProposalWithCreatorDto(cit_prop.getProposal()))
				.build();
	}

	public List<Citizen_ProposalCitizenFullDto> citizen_ProposalListToCitizen_ProposalCitizenFullDtoList(List<Citizen_Proposal> citizen_ProposalList) {
		List<Citizen_ProposalCitizenFullDto> citizen_ProposalCitizenFullDto = new ArrayList<Citizen_ProposalCitizenFullDto>();
		citizen_ProposalList.parallelStream().forEach((cit_prop) -> {
			citizen_ProposalCitizenFullDto.add(this.citizen_ProposalTocitizen_ProposalCitizenFullDto(cit_prop));
		});
		return citizen_ProposalCitizenFullDto;
	}

}
