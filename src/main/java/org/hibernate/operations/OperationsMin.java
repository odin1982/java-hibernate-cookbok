package org.hibernate.operations;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.model.Product;

public class OperationsMin {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Product.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.groupProperty("category"));
		projectionList.add(Projections.alias(Projections.min("price"), "price"));
		
	}
}
