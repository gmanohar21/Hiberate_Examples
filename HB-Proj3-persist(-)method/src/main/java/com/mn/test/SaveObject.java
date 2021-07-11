package com.mn.test;

import java.io.Serializable;

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
		boolean flag = false;
		

		cfg = new Configuration();
		cfg.configure("com/mn/cfgs/Hibernate.cfgs.xml");
		factory = cfg.buildSessionFactory();
		ses = factory.openSession();
		st = new Student();
		st.setId(15);//if we use generator to id it will overidden and wont consider id value
		st.setName("manu");
		st.setCourse("java");

		System.out.println("tx");
		try {
			tx = ses.beginTransaction();// internally calls con.setAutoCommit(false) to begin transaction
			// save object
			ses.persist(st);//it wont have generators 
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag == true) {
				tx.commit();
			} else {
				tx.rollback();// internally calls con.roollback()
			}
			ses.close();
			factory.close();
		}

	}

}
