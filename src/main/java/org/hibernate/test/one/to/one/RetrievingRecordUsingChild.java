package org.hibernate.test.one.to.one;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.model.PassportDetail;

public class RetrievingRecordUsingChild {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(PassportDetail.class);
		PassportDetail passportDetail = (PassportDetail) criteria.uniqueResult();
		System.out.println("PassportDetail ----> " + passportDetail+" "+passportDetail.getPerson());
		
		
		CriteriaQuery<PassportDetail> cq = session.getCriteriaBuilder().createQuery(PassportDetail.class);
		cq.from(PassportDetail.class);
		List<PassportDetail> passportDetails = session.createQuery(cq).getResultList();
	}
}
