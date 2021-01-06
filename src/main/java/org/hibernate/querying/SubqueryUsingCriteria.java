package org.hibernate.querying;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Subqueries;
import org.hibernate.model.Category;
import org.hibernate.model.Product;

public class SubqueryUsingCriteria {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Category.class);
		detachedCriteria.setProjection(Projections.max("createdOn"));
		
		Criteria criteria = session.createCriteria(Product.class);
		criteria.createAlias("category", "cat");
		criteria.add(Subqueries.propertyEq("cat.createdOn",detachedCriteria));
		List<Product> list = criteria.list();
		list.stream().forEach(product -> {
			System.out.println("\nProduct id: " + product.getId());
			System.out.println("Product name: " + product.getName());
			System.out.println("Product price: " + product.getPrice());
			System.out.println("Category name: " + product.getCategory().getName());
		});
	}

}
