package org.hibernate.insert.list.object;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Degree;
import org.hibernate.model.Teacher;

public class InsertListObject {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Teacher teacher = new Teacher();
		teacher.setName("Odin Araujo Barragan");
		
		List<Degree> degrees = new ArrayList<>();
		degrees.add(new Degree("B.E.",2008));
		degrees.add(new Degree("M.S.",2011));
		
		teacher.setDegrees(degrees);
		
		session.getTransaction().begin();
		session.save(teacher);
		session.getTransaction().commit();
	}
}
