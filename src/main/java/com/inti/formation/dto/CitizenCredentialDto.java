package com.inti.formation.dto;

import java.util.List;

import com.inti.formation.crossedEntity.Citizen_Survey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CitizenCredentialDto {
	
	private int citizenId;
	private String login;
	private String password;

}
