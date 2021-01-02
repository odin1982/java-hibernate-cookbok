package org.hibernate.operations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.model.Product;

public class Operations_01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Product.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.groupProperty("category"));
		projectionList.add(Projections.alias(Projections.sum("price"),"price"));
		criteria.createAlias("category","category");
		projectionList.add(Projections.alias(Projections.property("category.name"), "cat_name"));
		criteria.setProjection(projectionList);
		criteria.setResultTransformer(criteria.ALIAS_TO_ENTITY_MAP);
		List listGroupByCategory = criteria.list();
		System.out.println(listGroupByCategory);
	}
}
