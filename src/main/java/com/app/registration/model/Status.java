package com.app.registration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_status")
	private long idStatus;

	@Column(name="type")
	private String type;
	
	
	@Column(name = "code")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	//cek ntr
	//@OneToMany(mappedBy = "status")
	@OneToMany
	@JoinColumn(name = "id_status")
	private List<Reward>rewards;
	
	//@OneToMany(mappedBy = "status")
	@OneToMany
	@JoinColumn(name = "id_status")
	private List<Voucher>vouchers;
	
	
	 @JoinTable(name = "dummy_customer", 
		      joinColumns = 
		        { @JoinColumn(name = "id_status", referencedColumnName = "id_status") },
		      inverseJoinColumns = 
		        { @JoinColumn(name = "id_dummy_customer", referencedColumnName = "id_dummy_customer") })
	private List<AllCustomersData>allCustomersData;
	
	public Status() {
		// TODO Auto-generated constructor stub
	}

	public Status(long idStatus, String type, String code, String name, String description, List<Reward> rewards,
			List<Voucher> vouchers, List<AllCustomersData> allCustomersData) {
		super();
		this.idStatus = idStatus;
		this.type = type;
		this.code = code;
		this.name = name;
		this.description = description;
		this.rewards = rewards;
		this.vouchers = vouchers;
		this.allCustomersData = allCustomersData;
	}

	public long getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(long idStatus) {
		this.idStatus = idStatus;
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

	public List<AllCustomersData> getAllCustomersData() {
		return allCustomersData;
	}

	public void setAllCustomersData(List<AllCustomersData> allCustomersData) {
		this.allCustomersData = allCustomersData;
	}

			
}
