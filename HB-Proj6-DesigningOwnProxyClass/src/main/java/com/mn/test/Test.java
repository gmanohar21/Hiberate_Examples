package com.mn.test;

import org.hibernate.Session;

import com.mn.entity.IProxyClass;
import com.mn.entity.UserEntity;
import com.mn.utility.HibernateUtility;

public class Test {

	public static void main(String[] args) {
		Session ses = null;
		IProxyClass ent = null;
		ses = HibernateUtility.getSession();
		try {
			// ent = ses.get(UserEntity.class, 1);//for get(-) method(eager loading)
			
			ent = ses.load(UserEntity.class, 1);// for load(-) method
			//performing lazy loading
			//System.out.println(ent);
		//System.out.println(ent.getClass());

		} catch (Exception e) {
			e.printStackTrace();
System.out.println("Test.main()");
		}
	}

}
