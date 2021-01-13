package org.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.model.Film;

public class FilmDaoImpl implements FilmDao{
	private SessionFactory sessionFactory;

	public FilmDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Film film) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(film);
		tx.commit();
		session.close();
	}

	public List<Film> getAll() {
		Session session = this.sessionFactory.openSession();
		List<Film> filmList = session.createQuery("from Film").list();
		session.close();
		return filmList;
	}

}
