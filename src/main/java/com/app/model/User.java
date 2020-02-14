package com.app.model;

import javax.persistence.*;
import javax.print.attribute.standard.DateTimeAtCompleted;

import java.util.Date;
import java.util.Set;


@Entity
@Table(name ="user")
public class User {
	private long id;
	private String cif_code;
	private String title; 
	private String name;
	private String id_type;
	private String id_number;
	private Date id_expiry_date;
	private String gender;
	private String marital_status;
	private String address;
	private String rt_rw;
	private String kelurahan; 
	private String kecamatan; 
	private String city;
	private String postal_code; 
	private String province;
	private String current_address; 
	private String current_rt_rw; 
	private String current_kelurahan; 
	private String current_kecamatan;
	private String current_city; 
	private String current_postal_code; 
	private String current_province;
	private String mothers_maiden; 
	private String birth_place;
	private Date birth_date;
	private String occupation; 
	private String monthly_income; 
	private String email; 
	private String mobile_number;
	private String nationality;
	private long status;
	private Date created_date;
	private String created_by;
	private Date last_updated_date;
	private String last_updated_by;
	private String pan ;
	private String pin;
	private String username;
	private String password;
	private String confirmpassword;
	
	public User() {
	
	}

	public User(long id, String cif_code, String title, String name, String id_type, String id_number,
			Date id_expiry_date, String gender, String marital_status, String address, String rt_rw, String kelurahan,
			String kecamatan, String city, String postal_code, String province, String current_address,
			String current_rt_rw, String current_kelurahan, String current_kecamatan, String current_city,
			String current_postal_code, String current_province, String mothers_maiden, String birth_place,
			Date birth_date, String occupation, String monthly_income, String email, String mobile_number,
			String nationality, long status, Date created_date, String created_by, Date last_updated_date,
			String last_updated_by, String pan, String pin, String username, String password, String confirmpassword) {
		super();
		this.id = id;
		this.cif_code = cif_code;
		this.title = title;
		this.name = name;
		this.id_type = id_type;
		this.id_number = id_number;
		this.id_expiry_date = id_expiry_date;
		this.gender = gender;
		this.marital_status = marital_status;
		this.address = address;
		this.rt_rw = rt_rw;
		this.kelurahan = kelurahan;
		this.kecamatan = kecamatan;
		this.city = city;
		this.postal_code = postal_code;
		this.province = province;
		this.current_address = current_address;
		this.current_rt_rw = current_rt_rw;
		this.current_kelurahan = current_kelurahan;
		this.current_kecamatan = current_kecamatan;
		this.current_city = current_city;
		this.current_postal_code = current_postal_code;
		this.current_province = current_province;
		this.mothers_maiden = mothers_maiden;
		this.birth_place = birth_place;
		this.birth_date = birth_date;
		this.occupation = occupation;
		this.monthly_income = monthly_income;
		this.email = email;
		this.mobile_number = mobile_number;
		this.nationality = nationality;
		this.status = status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.last_updated_date = last_updated_date;
		this.last_updated_by = last_updated_by;
		this.pan = pan;
		this.pin = pin;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO);
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCif_code() {
		return cif_code;
	}

	public void setCif_code(String cif_code) {
		this.cif_code = cif_code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId_type() {
		return id_type;
	}

	public void setId_type(String id_type) {
		this.id_type = id_type;
	}

	public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	public Date getId_expiry_date() {
		return id_expiry_date;
	}

	public void setId_expiry_date(Date id_expiry_date) {
		this.id_expiry_date = id_expiry_date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRt_rw() {
		return rt_rw;
	}

	public void setRt_rw(String rt_rw) {
		this.rt_rw = rt_rw;
	}

	public String getKelurahan() {
		return kelurahan;
	}

	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}

	public String getKecamatan() {
		return kecamatan;
	}

	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCurrent_address() {
		return current_address;
	}

	public void setCurrent_address(String current_address) {
		this.current_address = current_address;
	}

	public String getCurrent_rt_rw() {
		return current_rt_rw;
	}

	public void setCurrent_rt_rw(String current_rt_rw) {
		this.current_rt_rw = current_rt_rw;
	}

	public String getCurrent_kelurahan() {
		return current_kelurahan;
	}

	public void setCurrent_kelurahan(String current_kelurahan) {
		this.current_kelurahan = current_kelurahan;
	}

	public String getCurrent_kecamatan() {
		return current_kecamatan;
	}

	public void setCurrent_kecamatan(String current_kecamatan) {
		this.current_kecamatan = current_kecamatan;
	}

	public String getCurrent_city() {
		return current_city;
	}

	public void setCurrent_city(String current_city) {
		this.current_city = current_city;
	}

	public String getCurrent_postal_code() {
		return current_postal_code;
	}

	public void setCurrent_postal_code(String current_postal_code) {
		this.current_postal_code = current_postal_code;
	}

	public String getCurrent_province() {
		return current_province;
	}

	public void setCurrent_province(String current_province) {
		this.current_province = current_province;
	}

	public String getMothers_maiden() {
		return mothers_maiden;
	}

	public void setMothers_maiden(String mothers_maiden) {
		this.mothers_maiden = mothers_maiden;
	}

	public String getBirth_place() {
		return birth_place;
	}

	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getMonthly_income() {
		return monthly_income;
	}

	public void setMonthly_income(String monthly_income) {
		this.monthly_income = monthly_income;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getLast_updated_date() {
		return last_updated_date;
	}

	public void setLast_updated_date(Date last_updated_date) {
		this.last_updated_date = last_updated_date;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Transient
	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
	
	
	
	
}
