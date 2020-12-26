package org.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passport_detail_id")//define el campo de la relacion entre tablas
	private PassportDetail passportDetail;

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

	public PassportDetail getPassportDetail() {
		return passportDetail;
	}

	public void setPassportDetail(PassportDetail passportDetail) {
		this.passportDetail = passportDetail;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", passportDetail=" + passportDetail + "]";
	}
}
