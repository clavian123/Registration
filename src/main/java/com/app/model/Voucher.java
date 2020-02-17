package com.app.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "voucher")
public class Voucher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private long id;
	
	@Column(name ="voucher_code")
	private String voucher_code;
	
	@Column(name ="type")
	private  String type;
	
	@Column(name ="max_redeem")
	private long max_redeem;
	
	@Column(name ="start_date")
	private Date start_date;
	
	@Column(name ="end_date")
	private Date end_date;
	
	@Column(name ="amount")
	private long amount;
	
	@Column(name ="description")
	private String description;
	
	@Column(name ="status")
	private long status;
	
	private List<UserVoucher> userVoucher;
	private Set<Status> statuss;
	
	
	public Voucher(long id, String voucher_code, String type, long max_redeem, Date start_date, Date end_date,
			long amount, String description, long status, List<UserVoucher> userVoucher, Set<Status> statuss) {
		super();
		this.id = id;
		this.voucher_code = voucher_code;
		this.type = type;
		this.max_redeem = max_redeem;
		this.start_date = start_date;
		this.end_date = end_date;
		this.amount = amount;
		this.description = description;
		this.status = status;
		this.userVoucher = userVoucher;
		this.statuss = statuss;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getVoucher_code() {
		return voucher_code;
	}


	public void setVoucher_code(String voucher_code) {
		this.voucher_code = voucher_code;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public long getMax_redeem() {
		return max_redeem;
	}


	public void setMax_redeem(long max_redeem) {
		this.max_redeem = max_redeem;
	}


	public Date getStart_date() {
		return start_date;
	}


	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}


	public Date getEnd_date() {
		return end_date;
	}


	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}


	public long getAmount() {
		return amount;
	}


	public void setAmount(long amount) {
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public long getStatus() {
		return status;
	}


	public void setStatus(long status) {
		this.status = status;
	}

	@ManyToOne()
	@JoinColumn(name ="id_uservoucher")
	public List<UserVoucher> getUserVoucher() {
		return userVoucher;
	}


	public void setUserVoucher(List<UserVoucher> userVoucher) {
		this.userVoucher = userVoucher;
	}

	@ManyToOne()
	@JoinColumn(name ="id_status")
	public Set<Status> getStatuss() {
		return statuss;
	}


	public void setStatuss(Set<Status> statuss) {
		this.statuss = statuss;
	}
	
	
	
	
	
	
	
}
