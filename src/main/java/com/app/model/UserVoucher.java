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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="user_voucher")
public class UserVoucher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private long id;
	
	@Column(name ="login_name")
	private String login_name;
	
	@Column(name ="voucher")
	private long voucher;
	
	@Column(name ="created_date")
	private Date created_date;
	
	@Column(name ="expiry_date")
	private Date expiry_date;
	
	@Column(name ="redeem_date")
	private int redeem_date;
	
	@Column(name ="status")
	private long status;
	
	@Column(name ="redeem_counter")
	private long redeem_counter;
	
	@Column(name ="cif_code")
	private String cif_code;
	
	
	private Set<Voucher> vouchers;
	private List<User> users;
	public UserVoucher(long id, String login_name, long voucher, Date created_date, Date expiry_date, int redeem_date,
			long status, long redeem_counter, String cif_code, Set<Voucher> vouchers, List<User> users) {
		super();
		this.id = id;
		this.login_name = login_name;
		this.voucher = voucher;
		this.created_date = created_date;
		this.expiry_date = expiry_date;
		this.redeem_date = redeem_date;
		this.status = status;
		this.redeem_counter = redeem_counter;
		this.cif_code = cif_code;
		this.vouchers = vouchers;
		this.users = users;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public long getVoucher() {
		return voucher;
	}
	public void setVoucher(long voucher) {
		this.voucher = voucher;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	public int getRedeem_date() {
		return redeem_date;
	}
	public void setRedeem_date(int redeem_date) {
		this.redeem_date = redeem_date;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public long getRedeem_counter() {
		return redeem_counter;
	}
	public void setRedeem_counter(long redeem_counter) {
		this.redeem_counter = redeem_counter;
	}
	public String getCif_code() {
		return cif_code;
	}
	public void setCif_code(String cif_code) {
		this.cif_code = cif_code;
	}
	
	@OneToMany()
	@JoinColumn(name = "id_voucher")
	public Set<Voucher> getVouchers() {
		return vouchers;
	}
	public void setVouchers(Set<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	@OneToMany()
	@JoinColumn(name ="id_user")
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	
	
	
	
}
