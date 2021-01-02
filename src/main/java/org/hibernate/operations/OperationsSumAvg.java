package org.hibernate.operations;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.model.Product;

public class OperationsSumAvg {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Product.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.groupProperty("category"));
		//projectionList.add(Projections.alias(Projections.sum("price"), "price"));
		//projectionList.add(Projections.alias(Projections.avg("price"), "price"));
		//projectionList.add(Projections.alias(Projections.min("price"), "price"));
		//projectionList.add(Projections.alias(Projections.max("price"), "price"));
		projectionList.add(Projections.alias(Projections.count("price"), "price"));
		criteria.createAlias("category", "category");
		projectionList.add(Projections.alias(Projections.property("category.name"),"cat_name"));
		criteria.setProjection(projectionList);
		criteria.setResultTransformer(criteria.ALIAS_TO_ENTITY_MAP);
		List list = criteria.list();
		list.stream().forEach(object -> {
			System.out.println("Category name:" + ((Map)object).get("cat_name"));
			//System.out.println("SUM(price):" + ((Map)object).get("price"));
			//System.out.println("AVG(price):" + ((Map)object).get("price"));
			//System.out.println("MIN(price):" + ((Map)object).get("price"));
			//System.out.println("MAX(price):" + ((Map)object).get("price"));
			System.out.println("COUNT(price):" + ((Map)object).get("price"));
		});
		
	}
}
