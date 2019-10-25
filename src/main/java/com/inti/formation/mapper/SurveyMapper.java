package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.inti.formation.dto.SurveyCredentialDto;
import com.inti.formation.entity.Survey;

@Component
public class SurveyMapper {
	
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
		surveyList.parallelStream().forEach((surv) -> {
			surveyCredentialDtoList.add(this.surveyToSurveyCredentialDto(surv));
		});
		return surveyCredentialDtoList;
	}

}
