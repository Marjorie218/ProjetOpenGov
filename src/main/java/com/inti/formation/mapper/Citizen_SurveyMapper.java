package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inti.formation.crossedEntity.Citizen_Survey;
import com.inti.formation.dto.Citizen_SurveyCitizenFullDto;
import com.inti.formation.dto.Citizen_SurveyCredentialDto;

@Component
public class Citizen_SurveyMapper {
	
	@Autowired
	SurveyMapper surveyMapper;
	
	public Citizen_SurveyCredentialDto citizenSurveyCitizenFullDtoToCitizenSurveyCredentialDto(Citizen_SurveyCitizenFullDto cit_surv) {
		return Citizen_SurveyCredentialDto.builder()
				.vote(cit_surv.getVote())
				.build();
	}

	public List<Citizen_SurveyCredentialDto> citizen_SurveyCitizenFullDtoListToCitizen_SurveyCredentialDtoList(List<Citizen_SurveyCitizenFullDto> citizen_SurveyList) {
		List<Citizen_SurveyCredentialDto> citizen_SurveyCredentialDto = new ArrayList<Citizen_SurveyCredentialDto>();
		citizen_SurveyList.parallelStream().forEach((cit_surv) -> {
			citizen_SurveyCredentialDto.add(this.citizenSurveyCitizenFullDtoToCitizenSurveyCredentialDto(cit_surv));
		});
		return citizen_SurveyCredentialDto;
	}
	
	public Citizen_SurveyCitizenFullDto citizen_SurveyCitizenFullDtoToCitizenSurvey(Citizen_Survey cit_surv) {
		return Citizen_SurveyCitizenFullDto.builder()
				.vote(cit_surv.getVote())
				.survey(surveyMapper.surveyToSurveyCredentialDto(cit_surv.getSurvey()))
				.build();
	}

	public List<Citizen_SurveyCitizenFullDto> citizen_SurveyListToCitizen_SurveyCitizenFullDtoList(List<Citizen_Survey> citizen_SurveyList) {
		List<Citizen_SurveyCitizenFullDto> citizen_SurveyCitizenFullDto = new ArrayList<Citizen_SurveyCitizenFullDto>();
		citizen_SurveyList.parallelStream().forEach((cit_surv) -> {
			citizen_SurveyCitizenFullDto.add(this.citizen_SurveyCitizenFullDtoToCitizenSurvey(cit_surv));
		});
		return citizen_SurveyCitizenFullDto;
	}
	
	

}
