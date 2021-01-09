package org.hibernate.strategy.subclass.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.ContractualEmployee;
import org.hibernate.model.Employee;
import org.hibernate.model.PermanentEmployee;

public class ConcreteInheritance {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setId(1L);
		employee.setName("Aarush");
		session.save(employee);
		
		PermanentEmployee permanentEmployee = new PermanentEmployee();
		permanentEmployee.setId(2L);
		permanentEmployee.setName("Mike");
		permanentEmployee.setSalary(10000D);
		session.save(permanentEmployee);
		
		ContractualEmployee contractualEmployee = new ContractualEmployee();
		contractualEmployee.setId(3L);
		contractualEmployee.setName("Vishal");
		contractualEmployee.setHourlyRate(200D);
		contractualEmployee.setContractPeriod(100F);
		session.save(contractualEmployee);
		
		session.getTransaction().commit();
		session.close();
	}

}
