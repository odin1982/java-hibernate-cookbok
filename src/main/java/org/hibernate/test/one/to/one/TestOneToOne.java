package org.hibernate.test.one.to.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.PassportDetail;
import org.hibernate.model.Person;

public class TestOneToOne {
public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	
	PassportDetail passportDetail = new PassportDetail();
	passportDetail.setPassportNo("G154678");
	
	Person person = new Person();
	person.setName("Odin");
	person.setPassportDetail(passportDetail);
	
	Transaction transaction = session.getTransaction();
	transaction.begin();
	
	session.save(person);
	
	transaction.commit();
}
}
