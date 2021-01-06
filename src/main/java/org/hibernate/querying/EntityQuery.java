package org.hibernate.querying;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Category;

public class EntityQuery {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM category");
		sqlQuery.addEntity(Category.class);
		
		List<Category> list = sqlQuery.list();
		list.stream().forEach(cat -> {
			System.out.println("\nCategory id: " + cat.getId());
			System.out.println("Category name: " + cat.getName());
		});
	}
}
