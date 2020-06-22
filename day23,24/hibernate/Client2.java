package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("configuration.cfg.xml");
		SessionFactory app =cfg.buildSessionFactory();
		Session session=app.openSession();
		Transaction t = session.beginTransaction();
		Query q=session.createQuery("from Employee e");
		List<Employee> l =q.getResultList();
		for(Employee e:l){
			System.out.println(e.getId() +" " +e.getName() +" "+e.getDept());
		}
		
		t.commit();
		session.close();
	}
}