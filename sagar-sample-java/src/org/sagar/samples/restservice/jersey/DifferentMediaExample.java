package org.sagar.samples.restservice.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sagar.samples.domain.UserXML;


@Path("/message")
public class DifferentMediaExample {
	// This method is called if XMLis request
	@GET
	@Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public UserXML getXML() {
		UserXML user = new UserXML();
		user.setName("Sagar Prasad");
		user.setDescription("Some Description");
		return user;
	}
	
	// This can be used to test the integration with the browser
	@GET
	@Produces( { MediaType.TEXT_XML })
	public UserXML getHTML() {
		UserXML user = new UserXML();
		user.setName("Sagar Prasad");
		user.setDescription("Some Description");
		return user;
	}

}
