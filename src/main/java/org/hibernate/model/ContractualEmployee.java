package org.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contractualEmployee")
@PrimaryKeyJoinColumn(name="emp_id")
public class ContractualEmployee extends Employee{
	@Column(name="hourly_rate")
	private Double HourlyRate;
	
	@Column(name="contract_period")
	private Float ContractPeriod;

	public Double getHourlyRate() {
		return HourlyRate;
	}

	public void setHourlyRate(Double hourlyRate) {
		HourlyRate = hourlyRate;
	}

	public Float getContractPeriod() {
		return ContractPeriod;
	}

	public void setContractPeriod(Float contractPeriod) {
		ContractPeriod = contractPeriod;
	}

	@Override
	public String toString() {
		return "ContractualEmployee [HourlyRate=" + HourlyRate + ", ContractPeriod=" + ContractPeriod + "]";
	}
	
}
