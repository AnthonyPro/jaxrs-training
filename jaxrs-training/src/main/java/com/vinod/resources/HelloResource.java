package com.vinod.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {
	
	@GET
	@Produces ({"text/plain"})
	public String greet() {
		return "Hello, from Veedjay!"; 
	}
	
	@GET
	@Produces ({"application/xml"})
	public String greetAsXml() {
		return "<?xml version=\"1.0\"?>\r\n" + 
				"<greeting>\r\n" + 
				"<message>Hello, World</message>\r\n" + 
				"<from>Veedjay</from>\r\n" + 
				"</greeting> ";
	}
	
	@GET
	@Produces ({"application/json"})
	public String greetAsJson() {
		return "{\r\n" + 
				"    \"message\": \"Hello, World\",\r\n" + 
				"    \"from\" : \"Veedjay\"\r\n" + 
				"}";
	}
	
	

}
