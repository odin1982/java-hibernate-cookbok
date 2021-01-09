package org.hibernate.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee")
@DiscriminatorValue(value="PE")
public class PermanentEmployee extends Employee{
	@Column(name="salary")
	private Double salary;

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [salary=" + salary + "]";
	}
	
}
