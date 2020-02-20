package com.app.registration.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_voucher")
public class UserVoucher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="login_name")
	private String loginName;
	
	@Column(name="voucher")
	private long voucher;
	
	@Column(name = "created_Date")
	private Date createdDate;
	
	@Column(name = "expiry_date")
	private Date expiryDate;
	
	//di db int harusnya date
	@Column(name = "redeem_date")
	private Date redeemDate;
	
	@Column(name = "status")
	private long status;
	
	@Column(name="redeem_counter")
	private long redeemCounter;
	
	@Column(name = "cif_code")
	private String cifCode;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "user_vocuher" )
	private List<Voucher>vouchers;
	
	//@OneToMany(fetch = FetchType.LAZY,mappedBy = "user_voucher")
	//private List<User>user = new ArrayList<User>();
	
	
	public UserVoucher() {
		// TODO Auto-generated constructor stub
	}


	public UserVoucher(long id, String loginName, long voucher, Date createdDate, Date expiryDate, Date redeemDate,
			long status, long redeemCounter, String cifCode, List<Voucher> vouchers, List<User> user) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.voucher = voucher;
		this.createdDate = createdDate;
		this.expiryDate = expiryDate;
		this.redeemDate = redeemDate;
		this.status = status;
		this.redeemCounter = redeemCounter;
		this.cifCode = cifCode;
		this.vouchers = vouchers;
		//this.user = user;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLoginName() {
		return loginName;
	}


	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}


	public long getVoucher() {
		return voucher;
	}


	public void setVoucher(long voucher) {
		this.voucher = voucher;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	public Date getRedeemDate() {
		return redeemDate;
	}


	public void setRedeemDate(Date redeemDate) {
		this.redeemDate = redeemDate;
	}


	public long getStatus() {
		return status;
	}


	public void setStatus(long status) {
		this.status = status;
	}


	public long getRedeemCounter() {
		return redeemCounter;
	}


	public void setRedeemCounter(long redeemCounter) {
		this.redeemCounter = redeemCounter;
	}


	public String getCifCode() {
		return cifCode;
	}


	public void setCifCode(String cifCode) {
		this.cifCode = cifCode;
	}


	public List<Voucher> getVouchers() {
		return vouchers;
	}


	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}


//	public List<User> getUser() {
//		return user;
//	}
//
//
//	public void setUser(List<User> user) {
//		this.user = user;
//	}
	
	

}
