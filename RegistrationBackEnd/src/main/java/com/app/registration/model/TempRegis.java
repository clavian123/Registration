package com.app.registration.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="temp_regis")
public class TempRegis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_temp_regis")
	private long idTempRegis;
	
	@Column(name = "cif_code")
	private String cifCode;
	
	@Column(name = "data_registration")
	private Blob dataRegistration;
	
	private String dataRegistrations;
	
	@Column(name="expired_date")
	private Date expiredDate;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="token")
	private String token;
	
	public TempRegis() {
		// TODO Auto-generated constructor stub
	}

	public TempRegis(long idTempRegis, String cifCode, Blob dataRegistration, String dataRegistrations,
			Date expiredDate, Date createdDate, String token) {
		super();
		this.idTempRegis = idTempRegis;
		this.cifCode = cifCode;
		this.dataRegistration = dataRegistration;
		this.dataRegistrations = dataRegistrations;
		this.expiredDate = expiredDate;
		this.createdDate = createdDate;
		this.token = token;
	}

	public long getIdTempRegis() {
		return idTempRegis;
	}

	public void setIdTempRegis(long idTempRegis) {
		this.idTempRegis = idTempRegis;
	}

	public String getCifCode() {
		return cifCode;
	}

	public void setCifCode(String cifCode) {
		this.cifCode = cifCode;
	}

	public Blob getDataRegistration() {
		return dataRegistration;
	}

	public void setDataRegistration(Blob dataRegistration) {
		this.dataRegistration = dataRegistration;
	}

	public String getDataRegistrations() {
		return dataRegistrations;
	}

	public void setDataRegistrations(String dataRegistrations) {
		this.dataRegistrations = dataRegistrations;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	
	
}
