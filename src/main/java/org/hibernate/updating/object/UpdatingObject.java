package org.hibernate.updating.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class UpdatingObject {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee = session.get(Employee.class,6L);
		
		session.getTransaction().begin();
		
		employee.setFirstName("Felix");
		employee.setEmpCode("FHH");
		employee.setSalary(800D);
		session.update(employee);
		System.out.println("Employee ----> " + employee);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
		
	}
}
