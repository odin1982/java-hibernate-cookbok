package org.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class CriteriaExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> employees = criteria.list();
		
		employees.stream().forEach(employee -> System.out.println("Employee ---->"+employee));
	}
}
