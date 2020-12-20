package org.hibernate.criteria.pagination;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class Pagination {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session sesion = sessionFactory.openSession();
		
		Criteria criteria = sesion.createCriteria(Employee.class);
		criteria.setFirstResult(1);
		criteria.setMaxResults(2);
		
		List<Employee> employees = criteria.list();
		employees.forEach(employee -> System.out.println("Employee ---->" + employee));
		
		sesion.close();
		HibernateUtil.shutdown();
	}
}
