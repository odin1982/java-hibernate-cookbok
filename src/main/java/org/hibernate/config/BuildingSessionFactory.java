package org.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BuildingSessionFactory {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();					//Creates blank configuration
		cfg = cfg.configure();										//look for hibernate.cfg.xml or hibernate.properties
		SessionFactory sessionFactory = cfg.buildSessionFactory();	// create Session Factory
	}
}
