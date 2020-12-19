package org.hibernate.fetching.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class FetchingObject4 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		Employee employee = session.get(Employee.class,4000L);
//		System.out.println(employee);
		Employee employee2 = session.load(Employee.class, 4000L);
		System.out.println(employee2);
		session.close();
		HibernateUtil.shutdown();
	}
}
