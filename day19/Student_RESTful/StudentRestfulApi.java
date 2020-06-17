package com.techment.restcrud;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/studentapi")
public class StudentRestfulApi {
	
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent(){
		Repository r = new Repository();
		return r.getAll();
	}

	
	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public String addStudent(Student s){
		Repository r = new Repository();
		return r.addStudent(s);
	}
	
	@DELETE
	@Path("/delete/{id}")
	
	public String delStudent(@PathParam("id") int id){
		Repository r = new Repository();
		return r.deleteStudent(id);
	}
	@PUT
	@Path("/update")
	public String updateStudent(Student s){
		Repository r = new Repository();
		return r.updateStudent(s);
	}
}
