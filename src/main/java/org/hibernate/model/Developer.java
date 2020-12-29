package org.hibernate.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="developer")
public class Developer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Technology> technology;

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

	public Set<Technology> getTechnology() {
		return technology;
	}

	public void setTechnology(Set<Technology> technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + "]";
	}
	
}
