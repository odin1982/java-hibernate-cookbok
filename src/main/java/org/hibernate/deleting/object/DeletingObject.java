package org.hibernate.deleting.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Employee;

public class DeletingObject {
	private static final Long ELIMINAR_EMPLEADO= 7L;
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		Employee employee = session.get(Employee.class, ELIMINAR_EMPLEADO);
		if(employee != null) {
			session.delete(employee);
		}else {
			System.out.println("No existe empleado con id: "+ELIMINAR_EMPLEADO);
		}
		
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}
}
