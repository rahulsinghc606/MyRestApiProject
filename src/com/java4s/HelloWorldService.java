package com.java4s;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;





 
@Path("/customers")
public class HelloWorldService {
 
	@GET
	@Produces("text/html")
	public Response getLocalCust() { 
		
		String output = "<font face='verdana' size='2'> I am from 'getLocalCust' method </font>"; 
		return Response.status(200).entity(output).build();
 
	}
	
	@GET
	@Path("/nri")
	@Produces("text/html")
	public Response getNriCust() {
 
		String output = "<font face='verdana' size='2'> I am from 'getNriCust' method </font>"; 
		return Response.status(200).entity(output).build();
 
	} 
	
}