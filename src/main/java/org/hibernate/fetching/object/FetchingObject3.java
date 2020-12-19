package org.hibernate.fetching.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Department;
import org.hibernate.model.Employee;

public class FetchingObject3 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();

		Department dep = new Department();
		dep.setId(1L);
		dep.setDeptName("tester");

		Employee emp = new Employee();
		emp.setDepartment(dep);
		emp.setEmpCode("SSHH");
		emp.setFirstName("Sandra");
		emp.setSalary(50000D);

		session.save(emp);
		

		Employee emp2 = new Employee();
		emp2.setDepartment(dep);
		emp2.setEmpCode("LEAH");
		emp2.setFirstName("Luis");
		emp2.setSalary(50000D);

		session.save(emp);

		session.getTransaction().commit();
		
		
		System.out.println("Empoyee get ...");
		Employee employee = session.get(Employee.class, 1L);
		System.out.println(employee);
		
		System.out.println("Empoyee get ...");
		Employee employee2 = session.get(Employee.class, 2L);
		System.out.println(employee2);
		
		session.close();
		HibernateUtil.shutdown();
		
	}
}
