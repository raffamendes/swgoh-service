package com.rmendes.swgoh;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.rmendes.swgoh.client.SwgohClient;
import com.rmendes.swgoh.model.AuthRequest;
import com.rmendes.swgoh.model.AuthResponse;
import com.rmendes.swgoh.model.Event;
import com.rmendes.swgoh.model.EventFilter;

@Path("/event")
public class EventService {
	
	@Inject
	@RestClient
	SwgohClient client;
	
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
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Event> events() {
    	return client.getEvents(getBearerToken(), new EventFilter());
    }
    
    
    
    private String getBearerToken() {
    	AuthRequest request = new AuthRequest(username,password,grantType,clientId,clientSecret);
    	AuthResponse response = client.getAuthInfo(request.toForm());
    	return "Bearer "+response.getToken();
    }
    
}