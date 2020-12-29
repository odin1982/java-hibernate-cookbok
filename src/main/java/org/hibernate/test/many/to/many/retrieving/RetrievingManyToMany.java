package org.hibernate.test.many.to.many.retrieving;

import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.Restrictions;
import org.hibernate.model.Developer;
import org.hibernate.model.Technology;

public class RetrievingManyToMany {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Developer.class);
		criteria.add(Restrictions.eq("id",1L));
		
		Developer developer = (Developer)criteria.uniqueResult();
		System.out.println(developer.toString());
		
		Set<Technology> technologies = developer.getTechnology();
		technologies.stream().forEach(t -> System.out.println(t));
	}
}
