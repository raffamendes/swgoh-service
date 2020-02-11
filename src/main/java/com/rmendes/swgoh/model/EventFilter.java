package com.rmendes.swgoh.model;

public class EventFilter {
	
	private String collection;
	
	private String language;
	
	private ProjectFilter project;
	
	public EventFilter() {
		this.collection = "territoryWarDefinitionList";
		this.language = "eng_us";
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public ProjectFilter getProject() {
		return project;
	}

	public void setProject(ProjectFilter project) {
		this.project = project;
	}

}
