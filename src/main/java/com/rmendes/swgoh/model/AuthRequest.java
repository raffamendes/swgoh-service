package com.rmendes.swgoh.model;

import javax.ws.rs.core.Form;

import org.eclipse.microprofile.config.inject.ConfigProperty;


public class AuthRequest {
	
	
	@ConfigProperty(name = "request.username")
	private String username;
	
	@ConfigProperty(name = "request.password")
	private String password;
	
	@ConfigProperty(name = "request.grant_type")
	private String grantType;
	
	@ConfigProperty(name = "request.client_id")
	private String clientId;
	
	@ConfigProperty(name = "request.client_secret")
	private String clientSecret;
	
	public AuthRequest(String username, String password, String grantType, String clientId, String clientSecret) {
		super();
		this.username = username;
		this.password = password;
		this.grantType = grantType;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}

	public AuthRequest() {
		super();

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	
	
	public Form toForm() {
		return new Form()
				.param("username", this.username)
				.param("password", this.password)
				.param("grant_type", this.grantType)
				.param("client_id", this.clientId)
				.param("client_secret", this.clientSecret);
	}
	
	

}
