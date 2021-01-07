package org.hibernate.secondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;
//En Hibernate 4 no se debe declarar el segundo nivel de cache ni en clase ni en el archivo hibernate.cfg.xml
public class SeconLevelCacheReadOnlyStrategy {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee employee = session.load(Employee.class, 1L);
		System.out.println(employee);
		session.close();
		
		Session anotherSession = sessionFactory.openSession();
		Employee employeeDummy = anotherSession.load(Employee.class, 1L);
		System.out.println(employeeDummy);
		anotherSession.close();
	}
}
