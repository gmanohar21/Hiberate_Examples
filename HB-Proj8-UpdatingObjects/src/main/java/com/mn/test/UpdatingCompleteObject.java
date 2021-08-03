package com.mn.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mn.entity.Employee;
import com.mn.utility.HibernateUtility;

public class UpdatingCompleteObject {
	public static void main(String[] args) {
		// Removing nested try blocks
		Transaction tx = null;
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session ses = factory.openSession();

		boolean flag = false;
		Employee emp = null;
		// from java 9 try with resource
		try (factory; ses) {
			emp = new Employee();
			emp.setId(3);
			emp.setName("sanu");
			emp.setDepartmentid(10);
			emp.setSal(460);
			// emp = ses.get(Employee.class, 3);

			try {
				System.out.println("LoadObjectsTest1.main()");
				tx = ses.beginTransaction();
				ses.update(emp);
				flag = true;
			} catch (HibernateException he) {
				flag = false;
				he.printStackTrace();
			} finally {
				if (flag) {
					System.out.println("obj saved");
					tx.commit();
				} else {
					System.out.println("obj not saved");
					tx.rollback();
				}
			}

		}
	}
}
