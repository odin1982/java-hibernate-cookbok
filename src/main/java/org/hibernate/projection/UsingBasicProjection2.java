package org.hibernate.projection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.model.Employee;
import org.hibernate.transform.Transformers;

public class UsingBasicProjection2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.alias(Projections.property("id"),"empId"));
		projectionList.add(Projections.alias(Projections.property("firstName"),"empFirstName"));
		criteria.setProjection(projectionList);
		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List list = criteria.list();
		System.out.println(list);
	}
}
