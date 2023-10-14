package com.projectEmp.com.projectEmp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="EmpData")
public class EmpData {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="EmpName")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="doj")
	private String doj;
	
	@Column(name="ContactNo")
	private String phoneNo;
	
	public EmpData()
	{
		
	}
	

	public EmpData(String name, String email, String dob, String doj,String phoneNo) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.doj = doj;
		this.phoneNo=phoneNo;
	}


	@Override
	public String toString() {
		return "EmpData [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", doj=" + doj
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	

	
	

}
