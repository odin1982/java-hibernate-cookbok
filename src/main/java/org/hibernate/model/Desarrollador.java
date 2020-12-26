package org.hibernate.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="desarrollador")
public class Desarrollador {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@ElementCollection
	@CollectionTable(name="correo_desarrollador")
	private Map<String,String> correosDesarrollador;

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

	public Map<String, String> getCorreosDesarrollador() {
		return correosDesarrollador;
	}

	public void setCorreosDesarrollador(Map<String, String> correosDesarrollador) {
		this.correosDesarrollador = correosDesarrollador;
	}
	
	public String toString() {
		return "Employee"
				+ "\n\tId:"+this.id
				+ "\n\t"+this.name
				+ "\n\t"+this.correosDesarrollador;
	}
}
