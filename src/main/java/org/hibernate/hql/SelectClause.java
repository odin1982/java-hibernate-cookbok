package org.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Category;
import org.hibernate.query.Query;

public class SelectClause {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("SELECT id,name from Category");
		List<Category> list = query.list();
		System.out.println("Result size:" + list.size());
	}
}
