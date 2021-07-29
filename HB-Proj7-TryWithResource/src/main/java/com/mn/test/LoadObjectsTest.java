package com.mn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mn.entity.Employee;
import com.mn.utility.HibernateUtility;

public class LoadObjectsTest {
	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtility.getSessionFactory()) {
			try (Session ses = factory.openSession()) {
				Employee emp = ses.get(Employee.class, 1);
				System.out.println(emp);
			}
		}
	}
}
