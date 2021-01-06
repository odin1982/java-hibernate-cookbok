package org.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.query.Query;

public class OrderByClause {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("FROM Category c ORDER BY c.id DESC");
		List list = query.list();
		System.out.println("Result size:" + list.size());
	}
}
