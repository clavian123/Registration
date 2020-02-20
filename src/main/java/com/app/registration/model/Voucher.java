package com.app.registration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="voucher")
public class Voucher {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="id")
	private long id;
	
	@Column(name="voucher_code")
	private String voucherCode;
	
	@Column(name="type")
	private String type;
	
	@Column(name="max_redeem")
	private long maxRedeem;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="amount")
	private long amount;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private long status;
	
	@OneToOne
	@MapsId
	private Reward reward;
	
	@ManyToOne
	@JoinColumn(name="id",nullable = false)
	private Status status2;
	
	@ManyToOne
	@JoinColumn(name="id",nullable = false)
	private UserVoucher userVoucher;
	
	public Voucher() {
		// TODO Auto-generated constructor stub
	}

	public Voucher(long id, String voucherCode, String type, long maxRedeem, Date startDate, Date endDate, long amount,
			String description, long status, Reward reward, Status status2, UserVoucher userVoucher) {
		super();
		this.id = id;
		this.voucherCode = voucherCode;
		this.type = type;
		this.maxRedeem = maxRedeem;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.description = description;
		this.status = status;
		this.reward = reward;
		this.status2 = status2;
		this.userVoucher = userVoucher;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getMaxRedeem() {
		return maxRedeem;
	}

	public void setMaxRedeem(long maxRedeem) {
		this.maxRedeem = maxRedeem;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	public Status getStatus2() {
		return status2;
	}

	public void setStatus2(Status status2) {
		this.status2 = status2;
	}

	public UserVoucher getUserVoucher() {
		return userVoucher;
	}

	public void setUserVoucher(UserVoucher userVoucher) {
		this.userVoucher = userVoucher;
	}
	
	
	
	
	
	
	
	
}
