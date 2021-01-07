package org.hibernate.firstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class FirstLevelCache {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		System.out.println("\nLoading employee #1... ");
		Employee employee = session.load(Employee.class, 1L);
		System.out.println(employee);
		
		System.out.println("\nLoading employee #2... ");
		Employee employee2 = session.load(Employee.class, 2L);
		System.out.println(employee2);
		
		System.out.println("\nLoading employee #1 again ... ");
		Employee employeeDummy = session.load(Employee.class, 1L);
		System.out.println(employeeDummy);
		
		System.out.println("\nLoading employee #2 again ... ");
		Employee employeeDummy2 = session.load(Employee.class, 2L);
		System.out.println(employeeDummy2);
		
	}
}
