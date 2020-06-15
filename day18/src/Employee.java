package com.techment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/employee")
public class Employee {

	@GET
	@Path("/employeedetails")
	public String getEmployeeDetails() {
		return "hello this is employee details";
	}
}
