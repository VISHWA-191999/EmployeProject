package com.projectEmp.com.projectEmp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empDetails")
public class EmployInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	@Column(name="Name")
	private String empName;
	
	@Column(name="Sal")
	private double salary;
	
	@Column(name="Designation")
	private String designation;
	
	@Column(name="Department")
	private String deptName;
	
	public EmployInfo()
	{
		
	}
	
	public EmployInfo(int empId, String empName, double salary, String designation, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
		this.deptName = deptName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String depName) {
		this.deptName = depName;
	}
	
	

	
}
