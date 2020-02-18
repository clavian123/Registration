package com.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reward")
public class Reward {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="status")
	private long status;
	
	@Column(name="reward_code")
	private String rewardCode;
	
	@Column(name="type")
	private String type;
	
	@Column(name="voucher_code")
	private long voucherCode;

	@ManyToOne ()
	@JoinTable (name="reward", joinColumns = {@JoinColumn (name="id", nullable = false)}, inverseJoinColumns = {@JoinColumn (name="id", nullable = false)})
	private List<Status>statuss;
	
	public Reward(long id, long status, String rewardCode, String type, long voucherCode) {
		super();
		this.id = id;
		this.status = status;
		this.rewardCode = rewardCode;
		this.type = type;
		this.voucherCode = voucherCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getRewardCode() {
		return rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(long voucherCode) {
		this.voucherCode = voucherCode;
	}
}
