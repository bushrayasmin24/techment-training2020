package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("configuration.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction t = session.beginTransaction();
//		Employee e = new Employee();
//		e.setId(2);
//		e.setName("Yasmin");
//		e.setDept("IT");
//		session.persist(e);
//		System.out.println("Inserted!");
		Employee emp=session.get(Employee.class, 2);
		emp.setName("princessBushr@");
		System.out.println(emp.getId()+" " +emp.getName() +" "+emp.getDept());
		session.saveOrUpdate(emp);
		t.commit();
		session.close();
	}

}
