package org.hibernate.persist.map;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Desarrollador;

public class PersistMap {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Desarrollador des = new Desarrollador();
		des.setName("Sandra Hernandez Hernandez");
		
		Map<String,String> emails = new HashMap<String,String>();
		emails.put("Business email", "odin@gmail.com");
		emails.put("Personal email", "o@gmail.com");
		des.setCorreosDesarrollador(emails);
		
		session.getTransaction().begin();
		session.save(des);
		session.getTransaction().commit();
		
	}
}
