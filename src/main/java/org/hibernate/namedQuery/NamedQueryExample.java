package org.hibernate.namedQuery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.query.Query;

public class NamedQueryExample {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.getNamedQuery("getCategoryNameById");
		//query.setString("name", "Stationary");
		query.setString("id", "1");
		List list = query.list();
		System.out.println("Category size: "+ list.size());
	}
}
