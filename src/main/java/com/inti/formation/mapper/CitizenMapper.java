package com.inti.formation.mapper;

import org.springframework.stereotype.Component;

import com.inti.formation.dto.CitizenCredentialDto;
import com.inti.formation.entity.Citizen;

@Component
public class CitizenMapper {
	
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

}
