package org.hibernate.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OpenSessionExample {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
	}

}
