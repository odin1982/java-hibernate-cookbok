package org.hibernate.criteria.transforming.result;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.model.Employee;
import org.hibernate.model.EmployeeDetail;
import org.hibernate.transform.Transformers;

public class ConvertingResultUserDefinedBean {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.createAlias("department", "_department");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.alias(Projections.property("id"), "empId"));
		projectionList.add(Projections.alias(Projections.property("firstName"), "empFirstName"));
		projectionList.add(Projections.alias(Projections.property("salary"), "empSalary"));
		projectionList.add(Projections.alias(Projections.property("_department.deptName"), "empDeptName"));
		criteria.setProjection(projectionList);
		criteria.setResultTransformer(Transformers.aliasToBean(EmployeeDetail.class));
		List<EmployeeDetail> employeesDetail = criteria.list();
		EmployeeDetail employeeDetail = employeesDetail.get(0);
		System.out.println(employeeDetail.toString());
	}

}
