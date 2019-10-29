package com.inti.formation.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.inti.formation.crossedEntity.Citizen_Survey;
import com.inti.formation.dto.Answer;
import com.inti.formation.dto.SurveyEfficace;
import com.inti.formation.entity.Survey;

@Component
public class SurveyEfficaceMapper {
	
	public SurveyEfficace surveyToSurveyEfficace (Survey survey) {
		SurveyEfficace surveyEfficace = new SurveyEfficace();
		surveyEfficace.setSurveyId(survey.getSurveyId());
		surveyEfficace.setQuestion(survey.getQuestion());
		surveyEfficace.setAnswers(extractResult(survey));
		return surveyEfficace;
	}
	
	public List<Answer> extractResult(Survey survey) {

		List<Citizen_Survey> citizenSurveys = survey.getCitizenSurveys();
		
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		for (Citizen_Survey citizen_Survey : citizenSurveys) {
			Integer count = frequencyMap.get(citizen_Survey.getVote());
			if (count == null) {
				count = 0;
			}
			frequencyMap.put(citizen_Survey.getVote(), count +1);
		}
		
		List<Answer> answers = new ArrayList<Answer>();
		for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			Answer answer = new Answer(entry.getKey(), entry.getValue());
			answers.add(answer);
		}
		return answers;
		
	}

}
