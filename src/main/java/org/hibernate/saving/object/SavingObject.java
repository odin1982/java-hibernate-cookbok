package org.hibernate.saving.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Department;
import org.hibernate.model.Employee;

public class SavingObject {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//begin a transaction
		session.getTransaction().begin();
		
		//creating a department object
		Department department = new Department();
		department.setDeptName("development");
		
		session.save(department);
		System.out.println("Department saved,id: "+department.getId());
		
		Employee employee = new  Employee();
		employee.setDepartment(department);
		employee.setEmpCode("ODAB");
		employee.setFirstName("Odin");
		employee.setSalary(70000D);
		
		session.save(employee);
		System.out.println("Employee saved, id: "+ employee.getId());
		
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
