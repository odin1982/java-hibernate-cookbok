package org.hibernate.dao;

import java.util.List;

import org.hibernate.model.Film;

public interface FilmDao {
	public void save(Film film);
	public List<Film> getAll();
}
