package com.projectEmp.com.projectEmp.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import org.hibernate.mapping.List;
@Entity
@Table(name="ccEmail")
public class CcEmailId {
	
//	private List<String> emailAddresses = new ArrayList<>();
//
//	public void add(String email)
//	{
//		emailAddresses.add(email);
//	}
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="ccemailId")
	private String ccEmail;
	
	public CcEmailId()
	{
		
	}
	
	public CcEmailId(int id, String ccEmail) {
		super();
		this.id = id;
		this.ccEmail = ccEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCcEmail() {
		return ccEmail;
	}

	public void setCcEmail(String ccEmail) {
		this.ccEmail = ccEmail;
	}
	
	
	
	
	

}
