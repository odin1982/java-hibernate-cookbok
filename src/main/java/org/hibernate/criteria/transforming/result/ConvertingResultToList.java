package org.hibernate.criteria.transforming.result;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;
import org.hibernate.transform.Transformers;

public class ConvertingResultToList {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//convierte cada elemento en Lista
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setResultTransformer(Transformers.TO_LIST);
		System.out.println(criteria.list());
	}
}
