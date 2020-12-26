package org.hibernate.updating.map;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Desarrollador;

public class UpdatingMap {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		Desarrollador des = new Desarrollador();
		des.setName("Sandra Hernandez Hernandez");
		
		Map<String,String> emails = new HashMap<>();
		emails.put("Business email", "odin@gmail.com");
		emails.put("Personal email", "o@gmail.com");
		des.setCorreosDesarrollador(emails);
		session.save(des);
		
		
		
		Desarrollador des2 = session.get(Desarrollador.class, 1L);
		Map<String, String> correosDesarrollador = des2.getCorreosDesarrollador();
		correosDesarrollador.put("Personal email 1", "prueba@gmail.com");
		des2.setCorreosDesarrollador(correosDesarrollador);
		
		session.saveOrUpdate(des2);
		session.getTransaction().commit();
		System.out.println(des);
	}
}
