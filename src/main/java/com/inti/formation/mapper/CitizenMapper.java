package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inti.formation.dto.CitizenCredentialDto;
import com.inti.formation.dto.CitizenFullDto;
import com.inti.formation.entity.Citizen;

@Component
public class CitizenMapper {
	
	@Autowired
	ProposalMapper proposalMapper;
	@Autowired
	Citizen_SurveyMapper citizen_SurveyMapper;
	@Autowired
	Citizen_ProposalMapper citizen_ProposalMapper;
	
	public Citizen citizenCredentialDtoToCitizen(CitizenCredentialDto citizenCredentialDto) {
		return Citizen.builder()
				.citizenId(citizenCredentialDto.getCitizenId())
				.login(citizenCredentialDto.getLogin())
				.password(citizenCredentialDto.getPassword()).build();
	}
	
	public CitizenCredentialDto citizenToCitizenCredentialDto(Citizen citizen) {
		return CitizenCredentialDto.builder()
				.citizenId(citizen.getCitizenId())
				.login(citizen.getLogin())
				.password(citizen.getPassword()).build();
	}
	
	public CitizenFullDto citizenToCitizenFullDto(Citizen citizen) {
		return CitizenFullDto.builder()
				.citizenId(citizen.getCitizenId())
				.login(citizen.getLogin())
				.password(citizen.getPassword())
				.proposals(proposalMapper.proposalListToProposalCredentialDtoList(citizen.getProposals()))
				.citizenSurveys(citizen_SurveyMapper.citizen_SurveyListToCitizen_SurveyWithSurveyDtoList(citizen.getCitizenSurveys()))
				.citizenProposals(citizen_ProposalMapper.citizen_ProposalListToCitizen_ProposalCitizenFullDtoList(citizen.getCitizenProposals()))
				.build();
	}
	
	public List<CitizenFullDto> citizenListToCitizenFullDtoList(List<Citizen> citizenList) {
		List<CitizenFullDto> CitizenFullDtoList = new ArrayList<CitizenFullDto>();
		citizenList.parallelStream().forEach((citizen) -> {
			CitizenFullDtoList.add(this.citizenToCitizenFullDto(citizen));
		});
		return CitizenFullDtoList;
	}

}
