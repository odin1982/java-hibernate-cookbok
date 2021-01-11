package org.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class BatchProcessingMain {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		for(int i=0;i<10000;i++) {
			Employee employee = new Employee();
			employee.setName("Name: "+String.valueOf(i));
			session.save(employee);
			if(i%50 == 0) {
				session.flush();
				session.clear();
			}
		}
		
		transaction.commit();
		session.close();
	}

}
