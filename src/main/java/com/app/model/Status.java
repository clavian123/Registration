package com.app.model;

<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 0eab4b9f08806e4099659f0935b365afcac0a26f
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
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.AUTO)
=======
	@GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> 0eab4b9f08806e4099659f0935b365afcac0a26f
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
	
<<<<<<< HEAD
	@OneToMany ()
	@JoinTable(name="status", joinColumns = {@JoinColumn (name="id", nullable = false)}, inverseJoinColumns = {@JoinColumn (name="id", nullable = false)})
	private List<Voucher>voucher;
	
	@OneToMany ()
	@JoinTable(name="status", joinColumns = {@JoinColumn (name="id", nullable = false)}, inverseJoinColumns = {@JoinColumn (name="id", nullable = false)})
	private List<Reward>reward;
=======
	
	
	private Set<Voucher>voucher;
	
	
	
	@OneToMany (mappedBy="status")
	@JoinTable(name="status", joinColumns = {@JoinColumn(name ="id_voucher", nullable=false), inverseJoinColumns = @JoinColumns(name ="id_status", nullable = false)})
	
>>>>>>> 0eab4b9f08806e4099659f0935b365afcac0a26f
	
	public Status() {
		// TODO Auto-generated constructor stub
	}

<<<<<<< HEAD
=======

>>>>>>> 0eab4b9f08806e4099659f0935b365afcac0a26f
	public Status(long id, String type, String code, String name, String description, 
			Set<Voucher> voucher) {
		super();
		this.id = id;
		this.type = type;
		this.code = code;
		this.name = name;
		this.description = description;
		//this.vouchers = vouchers;
		this.voucher = voucher;
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

	
	public Set<Voucher> getVoucher() {
		return voucher;
	}


	public void setVoucher(Set<Voucher> voucher) {
		this.voucher = voucher;
	}
<<<<<<< HEAD
=======


	

	
	
	
>>>>>>> 0eab4b9f08806e4099659f0935b365afcac0a26f
}
