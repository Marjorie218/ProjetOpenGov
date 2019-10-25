package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inti.formation.crossedEntity.Citizen_Survey;
import com.inti.formation.dto.Citizen_SurveyCredentialDto;
import com.inti.formation.dto.Citizen_SurveyWithCitizenDto;
import com.inti.formation.dto.Citizen_SurveyWithSurveyDto;

@Component
public class Citizen_SurveyMapper {
	
	@Autowired
	SurveyMapper surveyMapper;
	@Autowired
	CitizenMapper citizenMapper;
	
	public Citizen_SurveyCredentialDto citizenSurveyCitizenFullDtoToCitizenSurveyCredentialDto(Citizen_SurveyWithSurveyDto cit_surv) {
		return Citizen_SurveyCredentialDto.builder()
				.vote(cit_surv.getVote())
				.build();
	}

	public List<Citizen_SurveyCredentialDto> citizen_SurveyCitizenFullDtoListToCitizen_SurveyCredentialDtoList(List<Citizen_SurveyWithSurveyDto> citizen_SurveyList) {
		List<Citizen_SurveyCredentialDto> citizen_SurveyCredentialDto = new ArrayList<Citizen_SurveyCredentialDto>();
		citizen_SurveyList.parallelStream().forEach((cit_surv) -> {
			citizen_SurveyCredentialDto.add(this.citizenSurveyCitizenFullDtoToCitizenSurveyCredentialDto(cit_surv));
		});
		return citizen_SurveyCredentialDto;
	}
	
	public Citizen_SurveyWithSurveyDto citizen_SurveyToCitizen_SurveyWithSurveyDto(Citizen_Survey cit_surv) {
		return Citizen_SurveyWithSurveyDto.builder()
				.vote(cit_surv.getVote())
				.survey(surveyMapper.surveyToSurveyCredentialDto(cit_surv.getSurvey()))
				.build();
	}

	public List<Citizen_SurveyWithSurveyDto> citizen_SurveyListToCitizen_SurveyWithSurveyDtoList(List<Citizen_Survey> citizen_SurveyList) {
		List<Citizen_SurveyWithSurveyDto> citizen_SurveyWithSurveyDtoList = new ArrayList<Citizen_SurveyWithSurveyDto>();
		citizen_SurveyList.parallelStream().forEach((cit_surv) -> {
			citizen_SurveyWithSurveyDtoList.add(this.citizen_SurveyToCitizen_SurveyWithSurveyDto(cit_surv));
		});
		return citizen_SurveyWithSurveyDtoList;
	}
	
	public Citizen_SurveyWithCitizenDto citizen_SurveyToCitizen_SurveyWithCitizenDto(Citizen_Survey cit_surv) {
		return Citizen_SurveyWithCitizenDto.builder()
				.vote(cit_surv.getVote())
				.citizen(citizenMapper.citizenToCitizenCredentialDto(cit_surv.getCitizen()))
				.build();
	}

	public List<Citizen_SurveyWithCitizenDto> citizen_SurveyListToCitizen_SurveyWithCitizenDtoList(List<Citizen_Survey> citizen_SurveyList) {
		List<Citizen_SurveyWithCitizenDto> citizen_SurveyWithCitizenDtoList = new ArrayList<Citizen_SurveyWithCitizenDto>();
		citizen_SurveyList.parallelStream().forEach((cit_surv) -> {
			citizen_SurveyWithCitizenDtoList.add(this.citizen_SurveyToCitizen_SurveyWithCitizenDto(cit_surv));
		});
		return citizen_SurveyWithCitizenDtoList;
	}
	
	

}
