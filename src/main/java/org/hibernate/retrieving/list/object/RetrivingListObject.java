package org.hibernate.retrieving.list.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Teacher;

public class RetrivingListObject {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Teacher teacher = session.get(Teacher.class, 1L);
		System.out.println(teacher);
	}
}
