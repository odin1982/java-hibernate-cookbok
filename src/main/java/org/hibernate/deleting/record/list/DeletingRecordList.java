package org.hibernate.deleting.record.list;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Estudiante;

public class DeletingRecordList {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		Estudiante estudiante = session.get(Estudiante.class,1L);
		session.delete(estudiante);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}
