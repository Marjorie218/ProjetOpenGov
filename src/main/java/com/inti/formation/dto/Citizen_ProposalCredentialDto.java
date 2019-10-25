package com.inti.formation.dto;

import java.util.List;

import com.inti.formation.crossedEntity.Citizen_Survey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen_ProposalCredentialDto {

	private double rate;
	private String comment;

}
