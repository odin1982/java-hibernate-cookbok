package org.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Category;
import org.hibernate.query.Query;

public class FromClause {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("FROM Category");
		List<Category> categories = query.list();
		System.out.println(categories);
		
		
		Query query2 = session.createQuery("FROM Category,Product");
		List<Category> list = query2.list();
		System.out.println("Result size:" + list.size() );
		
		
		Query query3 = session.createQuery("FROM Category c, Product p WHERE c.id=1");
		List list2 = query3.list();
		System.out.println(list2);
	}
}
