package com.app.registration.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name ="username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name="customer")
	private long customer;
	
	@Column(name="created_date")
	private Date createdDate;
	
//	@ManyToOne
//	@JoinColumn(name="id", nullable = false)
//	private UserVoucher userVoucher;
//	
	
	
	@OneToOne(mappedBy = "user")
	private List<Customers>customers;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String username, String password, long customer, Date createdDate, UserVoucher userVoucher,
			List<Customers> customers) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.customer = customer;
		this.createdDate = createdDate;
		//this.userVoucher = userVoucher;
		this.customers = customers;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCustomer() {
		return customer;
	}

	public void setCustomer(long customer) {
		this.customer = customer;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

//	public UserVoucher getUserVoucher() {
//		return userVoucher;
//	}
//
//	public void setUserVoucher(UserVoucher userVoucher) {
//		this.userVoucher = userVoucher;
//	}

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}
	
	
}
