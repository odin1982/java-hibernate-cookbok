package org.hibernate.querying;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Product;

public class NativeSQLQuery {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		@SuppressWarnings("deprecation")
		SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM product");
		List<Object[]> object = sqlQuery.list();
		object.stream().forEach(obj -> {
			System.out.println("\nId: "+ obj[0]);
			System.out.println("Name: "+ obj[1]);
			System.out.println("Price: "+ obj[2]);
			System.out.println("Category Id: "+ obj[3]);
		});
	}
}
