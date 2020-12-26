package org.hibernate.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jugador")
public class Jugador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@ElementCollection
	@CollectionTable(name="correo")
	private Set<String> correos;

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

	public Set<String> getCorreos() {
		return correos;
	}

	public void setCorreos(Set<String> correos) {
		this.correos = correos;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", name=" + name + ", correos=" + correos + "]";
	}
	
}
