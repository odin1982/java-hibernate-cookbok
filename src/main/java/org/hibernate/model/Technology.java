package org.hibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="technology")
public class Technology {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="language")
	private String language;
	
	@Column(name="expertise")
	private String expertise;
	
	@ManyToMany(mappedBy = "technology")
	private Set<Developer> developer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public Set<Developer> getDeveloper() {
		return developer;
	}

	public void setDeveloper(Set<Developer> developer) {
		this.developer = developer;
	}

	@Override
	public String toString() {
		return "Technology [id=" + id + ", language=" + language + ", expertise=" + expertise + "]";
	}
	
	
	
}
