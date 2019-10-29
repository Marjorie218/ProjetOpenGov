package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inti.formation.dto.SurveyCredentialDto;
import com.inti.formation.dto.SurveyFullDto;
import com.inti.formation.entity.Survey;

@Component
public class SurveyMapper {
	
	@Autowired
	Citizen_SurveyMapper citizen_SurveyMapper;
	
	public Survey surveyCredentialDtoToSurvey(SurveyCredentialDto surveyCredentialDto) {
		return Survey.builder()
				.surveyId(surveyCredentialDto.getSurveyId())
				.question(surveyCredentialDto.getQuestion())
				.possibleAnswers(surveyCredentialDto.getPossibleAnswers())
				.result(surveyCredentialDto.getResult())
				.numberRespondents(surveyCredentialDto.getNumberRespondents())
				.build();
	}
	
	public SurveyCredentialDto surveyToSurveyCredentialDto(Survey survey) {
		return SurveyCredentialDto.builder()
				.surveyId(survey.getSurveyId())
				.question(survey.getQuestion())
				.possibleAnswers(survey.getPossibleAnswers())
				.result(survey.getResult())
				.numberRespondents(survey.getNumberRespondents())
				.build();
	}

	public List<SurveyCredentialDto> surveyListToSurveyCredentialDtoList(List<Survey> surveyList) {
		List<SurveyCredentialDto> surveyCredentialDtoList = new ArrayList<SurveyCredentialDto>();
		surveyList.stream().forEach((surv) -> {
			surveyCredentialDtoList.add(this.surveyToSurveyCredentialDto(surv));
		});
		return surveyCredentialDtoList;
	}
	
	public SurveyFullDto surveyToSurveyWithVotersDto(Survey survey) {
		return SurveyFullDto.builder()
				.surveyId(survey.getSurveyId())
				.question(survey.getQuestion())
				.possibleAnswers(survey.getPossibleAnswers())
				.result(survey.getResult())
				.numberRespondents(survey.getNumberRespondents())
				.citizenSurveys(citizen_SurveyMapper.citizen_SurveyListToCitizen_SurveyWithCitizenDtoList(survey.getCitizenSurveys()))
				.build();
	}

	public List<SurveyFullDto> surveyListToSurveyWithVotersDtoList(List<Survey> surveyList) {
		List<SurveyFullDto> surveyWithVotersDtoList = new ArrayList<SurveyFullDto>();
		surveyList.parallelStream().forEach((surv) -> {
			surveyWithVotersDtoList.add(this.surveyToSurveyWithVotersDto(surv));
		});
		return surveyWithVotersDtoList;
	}


}
