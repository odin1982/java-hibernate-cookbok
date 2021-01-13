package org.hibernate.action;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.config.HibernateUtil;
import org.hibernate.dao.FilmDao;
import org.hibernate.dao.FilmDaoImpl;
import org.hibernate.model.Film;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class FilmAction extends ActionSupport implements ModelDriven{

	Film film = new Film();
	List<Film> films =  new ArrayList<Film>();
	
	public String execute() throws Exception{
		return SUCCESS;
	}
	
	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	@Override
	public Object getModel() {
		return film;
	}
	
	public String saveFilm() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		FilmDao filmDao = new FilmDaoImpl(sessionFactory);
		filmDao.save(film);
		
		films = filmDao.getAll();
		return SUCCESS;
	}
	
	public String listAllFilms() {
		films = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		FilmDao filmDao = new FilmDaoImpl(sessionFactory);
		films = filmDao.getAll();
		return SUCCESS;
	}

}
