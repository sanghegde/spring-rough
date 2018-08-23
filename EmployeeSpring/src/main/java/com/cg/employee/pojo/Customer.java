package com.cg.employee.pojo;

import javax.persistence.Entity;

@Entity
public class Customer {
	private String customerId;
	private String customerName;
	
	
	private String contactnumber;
	private String emailId;
	private String nationality;
	private String gender;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Customer(String customerId, String customerName, String contactnumber, String emailId, String nationality,
			String gender) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactnumber = contactnumber;
		this.emailId = emailId;
		this.nationality = nationality;
		this.gender = gender;
	}

	public Customer() {
		
	}
}
	
	