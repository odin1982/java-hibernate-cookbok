package org.hibernate.criteria.sorting;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.Order;
import org.hibernate.model.Employee;

public class SortingCriteria {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.addOrder(Order.desc("firstName"));
		// desc() used to add order descending
		// criteria.addOrder(Order.asc("id"));
		//asc() used to add order Ascending
		
		List<Employee> employees = criteria.list();
		employees.stream().forEach(employee -> System.out.println("Employee ---->" + employee ));
		
	}
}
