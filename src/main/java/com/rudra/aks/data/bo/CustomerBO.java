package com.rudra.aks.data.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUST")
public class CustomerBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	
	@Column
	private String customerName;
	
	@Column
	private String	email;
	
	@Column
	private	String address;

	
	
	
	
	/**
	 * @param customerName
	 * @param email
	 * @param address
	 */
	public CustomerBO(String customerName, String email, String address) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.address = address;
	}

	public CustomerBO(int customerid, String customerName, String email, String address) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.email = email;
		this.address = address;
	}

	public CustomerBO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerBO [customerid=" + customerid + ", customerName=" + customerName + ", email=" + email
				+ ", address=" + address + "]";
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
