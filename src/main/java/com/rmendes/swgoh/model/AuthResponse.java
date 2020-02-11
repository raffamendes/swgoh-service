package com.rmendes.swgoh.model;

import javax.json.bind.annotation.JsonbProperty;


public class AuthResponse {
	
	@JsonbProperty("token_type")
	private String tokenType;
	
	@JsonbProperty("access_token")
	private String token;
	
	@JsonbProperty("expires_in")
	private Long expiration;

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getExpiration() {
		return expiration;
	}

	public void setExpiration(Long expiration) {
		this.expiration = expiration;
	}
	
	@Override
	public String toString() {
		return token+"-"+tokenType+"-"+expiration;
	}

}
