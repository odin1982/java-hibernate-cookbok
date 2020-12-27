package org.hibernate.test.one.to.one;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Person;

public class RetrievingRecordUsingParent {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Person.class);
		Person person = (Person) criteria.uniqueResult();
		System.out.println("Person ----> " + person);
	}
}
