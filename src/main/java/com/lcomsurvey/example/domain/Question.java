package com.lcomsurvey.example.domain;

import java.util.List;

public class Question {
	private int q_idx;
	private int s_idx;
	private String q_content;
	private String q_title;
	private String q_type;
	private List<Item> items;
	private List<Surveyresult> surveyresults;
	private List<Surveyresult2> surveyresult2s;
	
	
	
	
	public List<Surveyresult2> getAnswers() {
		return surveyresult2s;
	}
	public void setAnswers(List<Surveyresult2> answers) {
		this.surveyresult2s = answers;
	}
	public List<Surveyresult> getSurveyresults() {
		return surveyresults;
	}
	public void setSurveyresults(List<Surveyresult> surveyresults) {
		this.surveyresults = surveyresults;
	}
	public String getQ_content() {
		return q_content;
	}
	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public int getQ_idx() {
		return q_idx;
	}
	public void setQ_idx(int q_idx) {
		this.q_idx = q_idx;
	}
	public int getS_idx() {
		return s_idx;
	}
	public void setS_idx(int s_idx) {
		this.s_idx = s_idx;
	}
	public String getQ_title() {
		return q_title;
	}
	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}
	public String getQ_type() {
		return q_type;
	}
	public void setQ_type(String q_type) {
		this.q_type = q_type;
	}
	

}
