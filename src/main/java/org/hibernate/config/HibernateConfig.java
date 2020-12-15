package org.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.model.Department;
import org.hibernate.model.Employee;

public class HibernateConfig {
	public static void main(String[] args) {
		
		//config 1
//		Configuration configuration = new Configuration();
//		configuration = configuration.addResource("org/hibernate/model/Employee.hbm.xml");
//		configuration = configuration.addResource("org/hibernate/model/Department.hbm.xml");
		
		//config 2
//		Configuration configuration = new Configuration();
//		configuration = configuration.addResource("org/hibernate/model/Employee.hbm.xml")
//									 .addResource("org/hibernate/model/Department.hbm.xml");

		
		
		//config 3
		//this look for hbm.xml files
		Configuration configuration = new Configuration();
		configuration = configuration.addClass(Department.class);
		configuration = configuration.addClass(Employee.class);
		
		
		//Set up custom properties
		//configuration.setProperty(propertyName, value)
//		configuration.setProperty("show_sql", "true");
		
		//Set up multiple properties
//		Properties properties = new Properties();
//		properties.put("hibernate.dialect", "org.hibernate.dialect");
//		properties.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
//		properties.put("hibernate.connection.url","jdbc:mysql://localhost:3306/jhibernatecookbook?useSSL=false&amp;serverTimezone=America/Mexico_City&amp;allowPublicKeyRetrieval=true");
//		properties.put("hibernate.connection.username","root");
//		properties.put("hibernate.connection.password","barcelona8");
//		properties.put("show_sql","true");
//		properties.put("hbm2ddl.auto","update");
//		configuration.setProperties(properties);
		
		SessionFactory sessionFactory = new Configuration().buildSessionFactory();

	}
}
