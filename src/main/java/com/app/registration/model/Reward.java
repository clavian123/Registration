package com.app.registration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@Column(name="status")
	private long status;
	
	@Column(name="voucher_code")
	private long voucherCode;
	
	
	@ManyToMany(mappedBy = "reward") 
    private List<Event>events;
	
	
	@ManyToOne
	@JoinColumn(name="status",referencedColumnName ="id_status" , nullable = false)
	private Status status2;
	
	@OneToOne(mappedBy = "reward",cascade = CascadeType.ALL)
	private Voucher voucher;
	
	public Reward() {
		// TODO Auto-generated constructor stub
	}

	public Reward(long idReward, String rewardCode, String type, long status, long voucherCode, List<Event> events,
			Status status2, Voucher voucher) {
		super();
		this.idReward = idReward;
		this.rewardCode = rewardCode;
		this.type = type;
		this.status = status;
		this.voucherCode = voucherCode;
		this.events = events;
		this.status2 = status2;
		this.voucher = voucher;
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

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public long getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(long voucherCode) {
		this.voucherCode = voucherCode;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Status getStatus2() {
		return status2;
	}

	public void setStatus2(Status status2) {
		this.status2 = status2;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	
	

		
}
