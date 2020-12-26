package org.hibernate.updating.list;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Estudiante;

public class UpdatingList {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Estudiante estudiante = session.get(Estudiante.class, 1L);
		
		List<String> emails = estudiante.getEmails();
		emails.add("odin.araujo@hotmail");
		emails.add("odin.araujo.barragan@hotmail");
		
		session.getTransaction().begin();
		session.saveOrUpdate(estudiante);
		session.getTransaction().commit();
		System.out.println(estudiante);
	}

}
