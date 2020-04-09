package com.app.model;


import java.util.List;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "status")
public class Status {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="id")
	private long id;
	
	@Column(name ="type")
	private String type;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	

	
	public Status(long id, String type, String code, String name, String description, 
			Set<Voucher> voucher) {
		super();
		this.id = id;
		this.type = type;
		this.code = code;
		this.name = name;
		this.description = description;
		//this.vouchers = vouchers;
		//this.voucher = voucher;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	
	

}
