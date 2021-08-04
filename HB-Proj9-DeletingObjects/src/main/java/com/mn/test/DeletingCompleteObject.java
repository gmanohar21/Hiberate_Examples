package com.mn.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mn.entity.Project;
import com.mn.utility.HibernateUtility;

public class DeletingCompleteObject {
	public static void main(String[] args) {
		// Removing nested try blocks
		Transaction tx = null;
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session ses = factory.openSession();
		boolean flag = false;
		Project p = null;
		// from java 9 try with resource
		try (factory; ses) {
			p = new Project();
			p.setPid(6);
			p.setPsize(15);
			p.setPname("accencture");
			try {
				System.out.println("LoadObjectsTest1.main()");
				tx = ses.beginTransaction();
				ses.delete(p);
				flag = true;
			} catch (HibernateException he) {
				flag = false;
				he.printStackTrace();
			} finally {
				if (flag) {
					System.out.println("obj deleted");
					tx.commit();
				} else {
					System.out.println("obj not deleted");
					tx.rollback();
				}
			}

		}
	}
}
