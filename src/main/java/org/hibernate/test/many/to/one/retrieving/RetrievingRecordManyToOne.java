package org.hibernate.test.many.to.one.retrieving;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.Restrictions;
import org.hibernate.model.Actor;

public class RetrievingRecordManyToOne {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Actor.class);
		criteria.add(Restrictions.eq("actorName","mia"));
		Actor actor = (Actor)criteria.uniqueResult();
		System.out.println("Actor: "+actor.getActorName());
		System.out.println("Movie: "+actor.getMovie().getName());
	}
}
