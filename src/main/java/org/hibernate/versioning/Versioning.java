package org.hibernate.versioning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class Versioning {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setName("Aarush");
		session.save(employee);
		
		session.getTransaction().commit();
		session.close();
		
		
		Session session2 = sessionFactory.openSession();
		session2.getTransaction().begin();
		Employee employee2 = new Employee();
		employee2.setId(1L);
		employee2.setName("Aarush");
		session2.saveOrUpdate(employee2);
		session2.getTransaction().commit();
		session2.close();
		
		
	}
}
