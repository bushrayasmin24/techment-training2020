package com.techment.restcrud;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	/*
	 * declare a static arraylist to store employee details
	 */
	static ArrayList<Employee> employeelist = new ArrayList<Employee>();
	/*
	 * static below to initialize data to the employee arraylist
	 */
	static {
		employeelist.add(new Employee(1, "Bushra","CSE",500000));
		employeelist.add(new Employee(2, "Yasmin","IT",6000000));
		employeelist.add(new Employee(3, "Zoya","ETC",400000));

	}
	
	public List<Employee> getAll(){
		return employeelist;
	}
	
	public String addEmployee(Employee e) {
		employeelist.add(e);
		return "Student added";
	}
	
	public String deleteEmployee(int id) {
		employeelist.remove(id);
		return "Student deleted";
	}
	
	public String updateEmployee(int id, Employee e) {
		System.out.println("before update "+employeelist);
		employeelist.get(id).setName(e.getName());

		return "student updated";
	}

}
