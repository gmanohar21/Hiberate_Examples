package com.mn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mn.entity.Student;

public class SaveObject {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Student st = null;
		Transaction tx = null;
		
		cfg = new Configuration();
		cfg.configure("com/mn/cfgs/Hibernate.cfgs.xml");
		factory = cfg.buildSessionFactory();
		ses = factory.openSession();
		st = new Student();
		st.setId(2);
		st.setName("manu");
		st.setCourse("java");
		tx = ses.beginTransaction();
		ses.save(st);
		System.out.println("tx");
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		tx.commit();
		

	}

}
