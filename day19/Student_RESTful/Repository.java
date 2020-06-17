package com.techment.restcrud;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	/*
	 * declare a static arraylist to store student details
	 */
	static ArrayList<Student> studentlist = new ArrayList<Student>();
	/*
	 * static below to initialize data to the student arraylist
	 */
	static {
		studentlist.add(new Student(1, "Bushra","CSE"));
		studentlist.add(new Student(2, "Yasmin","IT"));
		studentlist.add(new Student(3, "Zoya","ETC"));
	}
	
	public List<Student> getAll(){
		return studentlist;
	}
	
	public String addStudent(Student s) {
		studentlist.add(s);
		return "Student added";
	}
	
	public String deleteStudent(int id) {
		studentlist.remove(id);
		return "Student deleted";
	}
	
	public String updateStudent(Student s) {
		System.out.println("before update "+studentlist);
		studentlist.get(s.getId()).setName(s.getName());
		return "student updated";
	}
}
