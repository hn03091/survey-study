package com.lcomsurvey.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lcomsurvey.example.domain.Item;
import com.lcomsurvey.example.domain.Question;
import com.lcomsurvey.example.domain.Survey;

@Mapper
public interface SurveyMapper {
	public void surveyWrite(Survey survey);

	public void questionWrite(Survey survey);
	
	public void items(Question question);
	
	public List<Survey> selectSurvey(Survey survey);
	
	public Survey detailSurvey(Survey survey);
}
