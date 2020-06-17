package com.techment.restcrud;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/employeeapi")
public class EmployeeRestfulApi {
	
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployee(){
		EmployeeRepository r = new EmployeeRepository();
		return r.getAll();
	}
	
	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public String addEmployee(Employee e){
		EmployeeRepository r = new EmployeeRepository();
		return r.addEmployee(e);
	}
	
	@DELETE
	@Path("/delete/{id}")
	
	public String delEmployee(@PathParam("id") int id){
		EmployeeRepository r = new EmployeeRepository();
		return r.deleteEmployee(id);
	}
	@PUT
	@Path("/update/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String updateEmployee(@PathParam("id")  int id, Employee e){
		EmployeeRepository r = new EmployeeRepository();
		return r.updateEmployee(id,e);
	}
}
