package org.hibernate.strategy.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.ContractualEmployee;
import org.hibernate.model.Employee;
import org.hibernate.model.PermanentEmployee;

public class StartegyInheritence {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setName("Aarush");
		session.save(employee);
		
		PermanentEmployee permanentEmployee = new PermanentEmployee();
		permanentEmployee.setName("Mike");
		permanentEmployee.setSalary(10000D);
		session.save(permanentEmployee);
		
		ContractualEmployee contractualEmployee = new ContractualEmployee();
		contractualEmployee.setName("Vishal");
		contractualEmployee.setHourlyRate(200D);
		contractualEmployee.setContractPeriod(100F);
		session.save(contractualEmployee);
		
		session.getTransaction().commit();
		session.close();
	}
}
