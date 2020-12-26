package org.hibernate.updating.list.object;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Degree;
import org.hibernate.model.Teacher;

public class UpdatingListObject {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		Teacher teacher = session.get(Teacher.class, 1L);
		System.out.println("Teacher"+teacher);
		List<Degree> degrees = teacher.getDegrees();
		degrees.add(new Degree("F.K",2020));
		session.saveOrUpdate(teacher);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}
