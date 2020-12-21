package org.hibernate.criteria.transforming.result;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;
import org.hibernate.transform.Transformers;

public class ConvertAResultMap {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		// convierte cada elemento en Lista
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List list = criteria.list();
		System.out.println("List ---->\n" + list);
		Map map = (Map)list.get(0);
		Employee employeeMap = (Employee)map.get(Criteria.ROOT_ALIAS);
		System.out.println(employeeMap.toString());
	}
}
