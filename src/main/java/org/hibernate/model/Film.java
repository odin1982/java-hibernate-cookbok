package org.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="film")
public class Film {
	public Film() {}
	
	public Film(String name,long releaseYear) {
		super();
		this.name=name;
		this.releaseYear=releaseYear;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Long releaseYear;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Long releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", name=" + name + ", releaseYear=" + releaseYear + "]";
	}
	
}
