package org.hibernate.test.one.to.many.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Actor;
import org.hibernate.model.Movie;

public class OneToMany {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Movie movie = new Movie();
		movie.setName("Furious 7");
		
		Actor actor1 = new Actor();
		actor1.setActorName("vin diesel");
		actor1.setMovie(movie);
		
		Actor actor2 = new Actor();
		actor2.setActorName("mia");
		actor2.setMovie(movie);
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		
		session.save(movie);
		session.save(actor1);
		session.save(actor2);
		
		transaction.commit();
		
	}
}
