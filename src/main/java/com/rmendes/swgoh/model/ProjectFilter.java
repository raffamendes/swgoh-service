package com.rmendes.swgoh.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectFilter {

	@JsonProperty
	private Integer id;

	@JsonProperty
	private Integer nameKey;

	@JsonProperty
	private Integer descriptionKey;

	@JsonProperty
	private Integer localNotificationsList;

	public ProjectFilter() {
		this.id = 1;
		this.nameKey = 1;
		this.descriptionKey = 1;
		this.localNotificationsList = 1;
	}

	public Integer getNameKey() {
		return nameKey;
	}

	public void setNameKey(Integer nameKey) {
		this.nameKey = nameKey;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDescriptionKey() {
		return descriptionKey;
	}

	public void setDescriptionKey(Integer descriptionKey) {
		this.descriptionKey = descriptionKey;
	}

	public Integer getLocalNotificationsList() {
		return localNotificationsList;
	}

	public void setLocalNotificationsList(Integer localNotificationsList) {
		this.localNotificationsList = localNotificationsList;
	}

}
