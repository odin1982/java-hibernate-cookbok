package org.hibernate.persist.list;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Estudiante;

public class PersistList {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Odin Araujo Barragan");
		
		List<String> emails = new ArrayList<>();
		emails.add("odin@hotmail.com");
		emails.add("araujo@hotmail.com");
		emails.add("barragan@hotmail.com");
		estudiante.setEmails(emails);
		
		session.getTransaction().begin();
		session.save(estudiante);
		session.getTransaction().commit();
		
		session.close();
		HibernateUtil.shutdown();
	}
}
