package org.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="degree")
public class Degree {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="degreeName")
	private String degreeName;
	
	@Column(name="passingYear")
	private Integer passingYear;
	
	public Degree() {}
	
	public Degree(String degreeName,int passingYear) {
		this.degreeName = degreeName;
		this.passingYear = passingYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public Integer getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(Integer passingYear) {
		this.passingYear = passingYear;
	}

	@Override
	public String toString() {
		return "\n\n Degree " + 
				"\n\t Id=" + id + 
				"\n\t Name=" + degreeName + 
				"\n\t Passing Year=";
	}
}
