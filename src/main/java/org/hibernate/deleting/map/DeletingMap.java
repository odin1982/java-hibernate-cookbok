package org.hibernate.deleting.map;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Desarrollador;

public class DeletingMap {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		Desarrollador des = new Desarrollador();
		des.setName("Sandra Hernandez Hernandez");
		Map<String,String> emails = new HashMap<String,String>();
		emails.put("Business email", "odin@gmail.com");
		emails.put("Personal email", "o@gmail.com");
		des.setCorreosDesarrollador(emails);
		session.save(des);

		Desarrollador desarrollador = new Desarrollador();
		desarrollador.setId(3L);
		session.delete(desarrollador);
		session.getTransaction().commit();
	}
}
