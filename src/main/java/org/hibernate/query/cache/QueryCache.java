package org.hibernate.query.cache;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class QueryCache {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		for(int i=0;i<5;i++) {
			Criteria criteria = session.createCriteria(Employee.class);
			List<Employee> employees = criteria.list();
			System.out.println("Employees found: "+employees.size());
		}
		session.close();
	}

}
