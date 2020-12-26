package org.hibernate.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="tbl_escuela",
uniqueConstraints = @UniqueConstraint(columnNames= {"id","empCode"}))
public class Escuela {
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="empCode",length = 4)
	private String empCode;
	
	@Column(name="telefono",nullable=false)
	private String telefono;
	
	@Column(columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP")
	private LocalDate startDate;
	
	@Column(precision=7,scale=2)
	private BigDecimal salary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
/*
 * uniqueConstraint = It is used when we need UNIQUE KEY with multiple fields
 * */
