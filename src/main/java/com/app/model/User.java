package com.app.model;

import javax.persistence.*;
import javax.print.attribute.standard.DateTimeAtCompleted;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Table(name ="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long  id;
	
	@Column(name="customer_id")
	private Customer customer_id;
	
	@Column(name="login_name")
	private String login_name;
	
	@Column(name="password")
	private String password;
	
	
	
	private List<UserVoucher>userVoucher;
	private List<Customer>customers;
	//pake entity manager
	public User(long id, Customer customer_id, String login_name, String password, List<UserVoucher> userVoucher,
			List<Customer> customers) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.login_name = login_name;
		this.password = password;
		this.userVoucher = userVoucher;
		this.customers = customers;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Customer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@ManyToOne()
	@JoinColumn(name="id_voucher")
	public List<UserVoucher> getUserVoucher() {
		return userVoucher;
	}
	public void setUserVoucher(List<UserVoucher> userVoucher) {
		this.userVoucher = userVoucher;
	}
	
	@OneToMany()
	@JoinColumn(name="id_customers")
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
	
	
	
	
	
	
	
	
}
