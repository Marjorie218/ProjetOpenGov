package com.inti.formation.idEntity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Citizen_ProposalId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int citizenId;
	private int proposalId;

}
