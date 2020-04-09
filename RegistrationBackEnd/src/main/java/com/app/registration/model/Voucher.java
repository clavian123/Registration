package com.app.registration.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="voucher")
public class Voucher {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="id_voucher")
	private long idVoucher;
	
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
	
	@Column(name="id_status")
	private long idStatus;
	
	
	//nanti cek
	
	
//	@ManyToOne
//	@JoinColumn(name="id_status",nullable = false)
//	private Status status2;
//	
//	@ManyToOne
//	@JoinColumn(name="id_voucher",nullable = false)
//	private UserVoucher userVoucher;
	
	@ManyToOne(optional = false,cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="id_status", nullable = false, insertable = false, updatable = false)
	private Status status;
	
//	@OneToMany(mappedBy = "voucher")
//	private List<UserVoucher>userVouchers;
	
	public Voucher() {
		// TODO Auto-generated constructor stub
	}

	public Voucher(long idVoucher, String voucherCode, String type, long maxRedeem, Date startDate, Date endDate,
			long amount, String description, long idStatus, Status status) {
		super();
		this.idVoucher = idVoucher;
		this.voucherCode = voucherCode;
		this.type = type;
		this.maxRedeem = maxRedeem;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.description = description;
		this.idStatus = idStatus;
		this.status = status;
	}

	public long getIdVoucher() {
		return idVoucher;
	}

	public void setIdVoucher(long idVoucher) {
		this.idVoucher = idVoucher;
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

	public long getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(long idStatus) {
		this.idStatus = idStatus;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
		
}
