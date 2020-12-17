package org.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	
	//this block is executed only once,initialize the object of SessionFactory
	static {
		try {
			//Create the SessionFactory from hibernate.cfg.xml
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex) {
			System.err.println("SessionFactory creation failed." +  ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		//Close caches and connection pools
		getSessionFactory().close();
	}

}
