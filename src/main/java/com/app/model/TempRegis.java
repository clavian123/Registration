package com.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="temp_regis")
public class TempRegis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="cif_code")
	private String cif_code;
	
	@Column(name="data_registration")
	private Customer data_registration;
	
	@Column(name="expired_date")
	private Date expired_date;
	
	@Column(name="created_date")
	private Date created_date;
	
	@Column(name="token")
	private String token;
	
	private List<Customer>customers;
	private List<AllCustomer>allCustomer;
	public TempRegis(long id, String cif_code, Customer data_registration, Date expired_date, Date created_date,
			String token, List<Customer> customers, List<AllCustomer> allCustomer) {
		super();
		this.id = id;
		this.cif_code = cif_code;
		this.data_registration = data_registration;
		this.expired_date = expired_date;
		this.created_date = created_date;
		this.token = token;
		this.customers = customers;
		this.allCustomer = allCustomer;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCif_code() {
		return cif_code;
	}
	public void setCif_code(String cif_code) {
		this.cif_code = cif_code;
	}
	public Customer getData_registration() {
		return data_registration;
	}
	public void setData_registration(Customer data_registration) {
		this.data_registration = data_registration;
	}
	public Date getExpired_date() {
		return expired_date;
	}
	public void setExpired_date(Date expired_date) {
		this.expired_date = expired_date;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	@OneToOne()
	@JoinColumn(name="id_customers")
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	@OneToOne()
	@JoinColumn(name="id_allcustomers")
	public List<AllCustomer> getAllCustomer() {
		return allCustomer;
	}
	public void setAllCustomer(List<AllCustomer> allCustomer) {
		this.allCustomer = allCustomer;
	}
	
	
	
	
	
	

	
}
