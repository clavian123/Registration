package com.app.registration.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_user")
	private long idUser;
	
	@Column(name ="username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name="customer")
	private long customer;
	
	@Column(name="created_date")
	private Date createdDate;
	
	//nanti cek lagi
	 @JoinTable(name = "customers", 
		      joinColumns = 
		        { @JoinColumn(name = "id_user", referencedColumnName = "id_user") },
		      inverseJoinColumns = 
		        { @JoinColumn(name = "id_customer", referencedColumnName = "id_customer") })
	private List<Customers>customers;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long idUser, String username, String password, long customer, Date createdDate,
			List<Customers> customers) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.customer = customer;
		this.createdDate = createdDate;
		this.customers = customers;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
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

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}
	
	
	
		
	
	
	
}
