package org.hibernate.criteria.restrictingResults;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.Restrictions;
import org.hibernate.model.Employee;

public class RestrictingResultCriteria {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		// gt = greater than
		criteria.add(Restrictions.gt("salary", 50000D));
		List<Employee> employees = criteria.list();
		System.out.println("Employees greater than 50000");
		employees.forEach(employee -> System.out.println("Employee ----> "+employee));
	}
}
