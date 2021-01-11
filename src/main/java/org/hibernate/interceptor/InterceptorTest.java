package org.hibernate.interceptor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class InterceptorTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		CustomInterceptor interceptor = new CustomInterceptor();
		Session session = sessionFactory.withOptions().interceptor(interceptor).openSession();
		Transaction tx = null;
		tx= session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("Vishal");
		session.saveOrUpdate(employee);
		tx.commit();
		session.close();
		sessionFactory.close();
	}
}
