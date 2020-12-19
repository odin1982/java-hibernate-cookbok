package org.hibernate.fetching.object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.Department;
import org.hibernate.model.Employee;

public class FetchingObject {
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
		
		session.getTransaction().commit();
		
		
		Employee employee = session.get(Employee.class,1L);
		
		if(employee != null) {
			System.out.println("Employee ----> "+employee);
		}
		
		session.close();
		HibernateUtil.shutdown();
	}
}
