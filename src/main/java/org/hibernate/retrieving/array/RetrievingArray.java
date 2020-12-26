package org.hibernate.retrieving.array;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Programador;

public class RetrievingArray {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Programador programador = new Programador();
		programador.setName("Odin Araujo Barragan");
		String[] emails = {"o@gmail.com","odin@gmail.com","araujo@gmail.com"};
		programador.setEma(emails);
		
		session.getTransaction().begin();
		session.save(programador);
		session.getTransaction().commit();
		
		session.close();
		HibernateUtil.shutdown();
	}
}
