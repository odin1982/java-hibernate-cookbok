package org.hibernate.test;

import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;

public class OpenSessionExample {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	}

}
