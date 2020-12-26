package org.hibernate.persist.set;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Jugador;

public class PersistSet {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Jugador jugador = new Jugador();
		jugador.setName("Odin Araujo Barragan");
		
		Set<String> emails = new HashSet<>();
		emails.add("amaya@hotmail.com");
		emails.add("dae@hotmail.com");
		emails.add("araujo@hotmail.com");
		
		jugador.setCorreos(emails);
		
		
		session.save(jugador);
		session.getTransaction().commit();
		
		session.close();
		HibernateUtil.shutdown();
	}

}
