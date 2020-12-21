package org.hibernate.model;

public class EmployeeDetail {
	private Long empId;
	private String empFirstName;
	private Double empSalary;
	private String empDeptName;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDeptName() {
		return empDeptName;
	}
	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}
	
	public String toString() {
		return "\nEmployeeDetail " +
				"\n Employee id: " + this.empId +
				"\n Employee FirstName: " + this.empFirstName +
				"\n Employee Salary: " + this.empSalary + 
				"\n Employee DepartmentName: " + this.empDeptName; 
	}
	
}
