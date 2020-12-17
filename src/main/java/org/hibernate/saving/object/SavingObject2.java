package org.hibernate.saving.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Department;
import org.hibernate.model.Employee;

public class SavingObject2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//begin a transaction
		session.getTransaction().begin();
		
		//creating a department object
		Department department = new Department();
		department.setId(1L);
		
		
		Employee employee = new  Employee();
		employee.setDepartment(department);
		employee.setEmpCode("AMAYA");
		employee.setFirstName("Amaya");
		employee.setSalary(170000D);
		
		session.save(employee);
		System.out.println("Employee saved, id: "+ employee.getId());
		
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
