package com.rmendes.swgoh.model;

import java.util.List;

public class Event {
	
	
	private String id;
	
	private String nameKey;
	
	private String descriptionKey;
	
	private List<LocalNotification> localNotificationsList;



	public String getNameKey() {
		return nameKey;
	}

	public void setNameKey(String nameKey) {
		this.nameKey = nameKey;
	}

	public String getDescriptionKey() {
		return descriptionKey;
	}

	public void setDescriptionKey(String descriptionKey) {
		this.descriptionKey = descriptionKey;
	}

	public List<LocalNotification> getLocalNotificationsList() {
		return localNotificationsList;
	}

	public void setLocalNotificationsList(List<LocalNotification> localNotificationsList) {
		this.localNotificationsList = localNotificationsList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
