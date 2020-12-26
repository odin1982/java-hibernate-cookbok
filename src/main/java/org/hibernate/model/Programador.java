package org.hibernate.model;


import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;


@Entity
@Table(name="programador")
public class Programador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@ElementCollection
	@IndexColumn(name="email_jobs_index")
	@CollectionTable(name="email_jobs")
	private String[] ema;

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

	public String[] getEma() {
		return ema;
	}

	public void setEma(String[] ema) {
		this.ema = ema;
	}

}
