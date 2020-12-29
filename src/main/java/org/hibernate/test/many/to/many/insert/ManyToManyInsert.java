package org.hibernate.test.many.to.many.insert;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Developer;
import org.hibernate.model.Technology;

public class ManyToManyInsert {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Developer developer = new Developer();
		developer.setName("Odin");
		
		Developer developer2 = new Developer();
		developer2.setName("Amaya");
		
		Developer developer3 = new Developer();
		developer3.setName("Sandra");
		
		
		Technology technology = new Technology();
		technology.setLanguage("Java");
		technology.setExpertise("Expert");
		
		Technology technology2 = new Technology();
		technology2.setLanguage("Python");
		technology2.setExpertise("Intermediate");
		
		Set<Technology> technologies = new HashSet<>();
		technologies.add(technology);
		technologies.add(technology2);
		
		developer.setTechnology(technologies);
		developer2.setTechnology(technologies);
		developer3.setTechnology(technologies);
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(developer);
		session.save(developer2);
		session.save(developer3);
		
		transaction.commit();
	}

}
