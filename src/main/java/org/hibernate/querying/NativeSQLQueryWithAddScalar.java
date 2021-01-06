package org.hibernate.querying;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Product;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;

public class NativeSQLQueryWithAddScalar {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		SQLQuery sqlQuery = session.createSQLQuery("SELECT id,name,price,category_id FROM product");
		sqlQuery.addScalar("id", new org.hibernate.type.LongType());
		sqlQuery.addScalar("name", new org.hibernate.type.StringType());
		sqlQuery.addScalar("price", new org.hibernate.type.DoubleType());
		sqlQuery.addScalar("category_id", new org.hibernate.type.LongType());
		sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List list = sqlQuery.list();
		System.out.println(list);
		
	}
}
