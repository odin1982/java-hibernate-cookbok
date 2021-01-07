package org.hibernate.firstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class FirstLevelCacheUseEvict {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		System.out.println("\nLoading employee #1... ");
		Employee employee = session.load(Employee.class, 1L);
		System.out.println(employee);
		
		session.evict(employee);
		System.out.println("\nEmployee #1 removed using evict(...)... ");
		
		System.out.println("\nLoading employee #1 again ... ");
		Employee employeeDummy = session.load(Employee.class, 1L);
		System.out.println(employeeDummy);
		
		
	}
}
