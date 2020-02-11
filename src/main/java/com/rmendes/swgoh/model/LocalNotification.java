package com.rmendes.swgoh.model;

public class LocalNotification {
	
	
	private String messageKey;
	
	private String titleKey;
	
	private boolean optedIn;
	
	private Integer phase;
	
	private Long phaseTimeOffsetSeconds;
	
	private boolean finalMatchOnly;

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public String getTitleKey() {
		return titleKey;
	}

	public void setTitleKey(String titleKey) {
		this.titleKey = titleKey;
	}

	public boolean isOptedIn() {
		return optedIn;
	}

	public void setOptedIn(boolean optedIn) {
		this.optedIn = optedIn;
	}

	public Integer getPhase() {
		return phase;
	}

	public void setPhase(Integer phase) {
		this.phase = phase;
	}

	public Long getPhaseTimeOffsetSeconds() {
		return phaseTimeOffsetSeconds;
	}

	public void setPhaseTimeOffsetSeconds(Long phaseTimeOffsetSeconds) {
		this.phaseTimeOffsetSeconds = phaseTimeOffsetSeconds;
	}

	public boolean isFinalMatchOnly() {
		return finalMatchOnly;
	}

	public void setFinalMatchOnly(boolean finalMatchOnly) {
		this.finalMatchOnly = finalMatchOnly;
	}

	
}
