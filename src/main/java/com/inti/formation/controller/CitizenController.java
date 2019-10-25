package com.inti.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.dto.CitizenCredentialDto;
import com.inti.formation.dto.CitizenFullDto;
import com.inti.formation.entity.Citizen;
import com.inti.formation.mapper.CitizenMapper;
import com.inti.formation.metier.CitizenMetier;

import lombok.Data;

@RestController
@RequestMapping("/citizens")
@CrossOrigin("http://localhost:4200")
@Data
public class CitizenController {
	
	@Autowired
	private CitizenMetier citizenMetier;
	@Autowired
	private CitizenMapper citizenMapper;

	@RequestMapping(value="/findAll", method = RequestMethod.GET)
	public List<CitizenFullDto> findAll() {
		return citizenMapper.citizenListToCitizenFullDtoList(citizenMetier.getAll());
	}

	@RequestMapping(value="/findOne/{id}", method = RequestMethod.GET)
	public CitizenFullDto find(@PathVariable int id) {
		return citizenMapper.citizenToCitizenFullDto(citizenMetier.getOne(id));
	}

	@RequestMapping(value="/authenticate", method = RequestMethod.POST)
	public CitizenCredentialDto authenticate(@RequestBody CitizenCredentialDto citizenCredentialDto) {
		Citizen citizen = citizenMapper.citizenCredentialDtoToCitizen(citizenCredentialDto);
		citizenCredentialDto = citizenMapper.citizenToCitizenCredentialDto(citizenMetier.authenticate(citizen.getLogin(), citizen.getPassword()));
		return citizenCredentialDto;
	}
	
	

}
