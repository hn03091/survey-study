package com.lcomsurvey.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcomsurvey.example.domain.Survey;
import com.lcomsurvey.example.mapper.SurveyMapper;


@Service("SurveyServiceImpl")
public class SurveyServiceImpl implements SurveyService {
	
	@Autowired SurveyMapper surveymapper;
	
	@Override
	public void surveyWrite(Survey survey) {
		surveymapper.surveyWrite(survey);
	}

}
