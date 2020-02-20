package com.app.registration.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;

	@Column(name="type")
	private String type;
	
	
	@Column(name = "code")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	
	@OneToMany(mappedBy = "status")
	private List<Reward>rewards;
	
	@OneToMany(mappedBy = "status")
	private List<Voucher>vouchers;
	
	
	public Status() {
		// TODO Auto-generated constructor stub
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


	public List<Reward> getRewards() {
		return rewards;
	}


	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}


	public List<Voucher> getVouchers() {
		return vouchers;
	}


	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	
	
	
	
	
}
