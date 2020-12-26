package org.hibernate.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(Tienda.class)
public class Tienda implements Serializable{
	private static final long serialVersionUID = -2559331602181186192L;
	
	@Id
	private String nombre;
	
	@Id
	private String telefono;
}
