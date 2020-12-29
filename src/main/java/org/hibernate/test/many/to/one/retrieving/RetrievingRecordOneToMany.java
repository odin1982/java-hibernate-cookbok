package org.hibernate.test.many.to.one.retrieving;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.Restrictions;
import org.hibernate.model.Movie;

public class RetrievingRecordOneToMany {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Movie.class);
		criteria.add(Restrictions.eq("id", 1L));
		Movie movie = (Movie)criteria.uniqueResult();
		System.out.println("Actors:");
		movie.getActors().stream().forEach(actor-> System.out.println(actor));
		
	}
}
