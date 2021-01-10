package org.hibernate.maintaining;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class Maintaining {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		session.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setName("Aurush");
		employee.setPassword("p44sw0rd");
		session.save(employee);
		
		session.getTransaction().commit();
		session.close();
	}

}
