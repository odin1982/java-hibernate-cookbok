package org.hibernate.projection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.Projections;
import org.hibernate.model.Employee;

public class UsingBasicProjection {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setProjection(Projections.property("id"));
		System.out.println("List Employees id's: " + criteria.list());
	}
}
