package org.hibernate.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
//namedquery example ony one
//@NamedQuery(name="getCategoryNameByName",query="FROM Category c WHERE c.name=:name")

@NamedQueries({
	@NamedQuery(
			name="getCategoryNameByName",
			query="FROM Category c WHERE c.name=:name"
	),
	@NamedQuery(
			name="getCategoryNameById",
			query="FROM Category c WHERE c.id=:id"
	)
})
@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="created_on")
	private LocalDate createdOn;

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

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", createdOn=" + createdOn + "]";
	}
	
}
