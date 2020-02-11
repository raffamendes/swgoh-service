package com.rmendes.swgoh.client;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Form;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.HeaderParam;

import com.rmendes.swgoh.model.AuthResponse;
import com.rmendes.swgoh.model.Event;
import com.rmendes.swgoh.model.EventFilter;

@RegisterRestClient(configKey = "swgoh-client")
public interface SwgohClient {
	
	@POST
	@Path("/auth/signin")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json")
	AuthResponse getAuthInfo(Form request);
	
	@POST
	@Path("/swgoh/event")
	List<Event> getEvents(@HeaderParam("Authorization") String token, EventFilter filter);
	
	

}
