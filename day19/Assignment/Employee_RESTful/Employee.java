package com.techment.restcrud;

public class Employee {
	
	private int id;
	private String name;
	private String dept;
	private float sal; 
	
	public Employee(int id, String name, String dept, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Student (id "+id +"name "+name+"dept"+dept +")";
	}

}
