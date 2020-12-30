package org.hibernate.querying;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.Restrictions;
import org.hibernate.model.Employee;

public class Querying01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.createAlias("department", "dept");
		criteria.add(Restrictions.eq("dept.name","tizayuca"));
		List<Employee> list = criteria.list();
		list.stream().forEach(empleado ->System.out.println(empleado));
	}
}
