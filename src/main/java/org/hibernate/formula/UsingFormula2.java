package org.hibernate.formula;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Product;

public class UsingFormula2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		List<Product> list = criteria.list();
		for(Product product :list) {
			System.out.println("\nProduct name: "+ product.getName());
			System.out.println("Category name: "+ product.getCategoryName());
		}
	}
}
