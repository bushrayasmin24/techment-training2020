package com.techment;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response;

//import com.sun.research.ws.wadl.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/student")
public class StudentAPI {
	
	@GET
	@Path("/studentsdetails")
	public String getStudentsDetails() {
		return "hello this is students details";
	}
	@GET
	@Path("/byname/{name}")
	public String getStudentsDetailsByName(@PathParam("name") String name) {
		return "hello, your name is "+name;
	}
	
	@GET
	@Path("/students")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getstudentdetails2() {
		
		Student s = new Student();
		s.setID(1);
		s.setName("Bushra");
		
		return Response.ok(s).build();
	}
}
