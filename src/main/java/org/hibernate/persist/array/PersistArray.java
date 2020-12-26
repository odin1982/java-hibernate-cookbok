package org.hibernate.persist.array;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Programador;

public class PersistArray {
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
		
		Programador programador2 = session.get(Programador.class, 4L);
		System.out.println(programador2);
		
		session.close();
		HibernateUtil.shutdown();
	}
}
