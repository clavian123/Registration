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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reward")
public class Reward {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_reward")
	private long idReward;
	
	@Column(name="reward_code")
	private String rewardCode;
	
	@Column(name = "type")
	private String type;
	
	@Column(name="id_status")
	private long idStatus;
	
	@Column(name="voucher_code")
	private long voucherCode;
	
	
//	@ManyToMany(mappedBy = "reward") 
//    private List<Event>events;
	
	
//	@ManyToOne
//	@JoinColumn(name="status",referencedColumnName ="id_status" , nullable = false)
//	@JoinColumn(name = "id_status", nullable = false)
//	private Status status2;
	
//	@ManyToOne
//	@JoinTable(name = "status", joinColumns = { @JoinColumn(name = "id_status", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_reward", nullable = false) })
//	private List<Status> status;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="id_status", nullable = false, insertable = false, updatable = false)
	private Status status;
	
	
	public Reward() {
		// TODO Auto-generated constructor stub
	}


	public Reward(long idReward, String rewardCode, String type, long idStatus, long voucherCode, Status status) {
		super();
		this.idReward = idReward;
		this.rewardCode = rewardCode;
		this.type = type;
		this.idStatus = idStatus;
		this.voucherCode = voucherCode;
		this.status = status;
	}


	public long getIdReward() {
		return idReward;
	}


	public void setIdReward(long idReward) {
		this.idReward = idReward;
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


	public long getIdStatus() {
		return idStatus;
	}


	public void setIdStatus(long idStatus) {
		this.idStatus = idStatus;
	}


	public long getVoucherCode() {
		return voucherCode;
	}


	public void setVoucherCode(long voucherCode) {
		this.voucherCode = voucherCode;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}

	
		
			
}
