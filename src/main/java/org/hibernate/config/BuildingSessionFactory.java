package org.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BuildingSessionFactory {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();					// Creates blank configuration
		//option 1: without cfg.xml file
		//cfg = cfg.configure();										// Look for hibernate.cfg.xml or hibernate.properties if you dont set file configuration
		
		//option 2: with cfg.xml file
		//cfg = cfg.configure("postgresql.cfg.xml");					// You specify postgresql
		SessionFactory sessionFactory = cfg.buildSessionFactory();	// Create Session Factory
	}
}
