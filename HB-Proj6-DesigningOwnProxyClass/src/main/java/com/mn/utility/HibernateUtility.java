package com.mn.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static SessionFactory factory;
	static {
		Configuration cfg = null;
		try {
			cfg = new Configuration();
			cfg.configure("com/mn/cfgs/hibernate.cfgs.xml");
			factory = cfg.buildSessionFactory();
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// static

	public static Session getSession() {
		Session ses = null;
		if (factory != null)
			ses = factory.openSession();
		return ses;
	}

	public static void closeSession(Session ses) {
		ses.close();
	}

	public void closeFactory(SessionFactory factory) {
		factory.close();
	}

}
