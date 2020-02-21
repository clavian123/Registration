//package com.app.registration.model;
//
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="dummy_customer")
//public class DummyCustomer implements Serializable {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name ="id")
//	private long id;
//	
//	@Column(name="cif_code")
//	private String cif_code;
//	
//	@Column(name="title")
//	private String title; 
//	
//	@Column(name="name")
//	private String name;
//	
//	@Column(name="id_type")
//	private String id_type;
//	
//	@Column(name="id_number")
//	private String id_number;
//	
//	@Column(name="id_expiry_date")
//	private Date id_expiry_date;
//	
//	@Column(name="gender")
//	private String gender;
//	
//	@Column(name="marital_status")
//	private String marital_status;
//	
//	@Column(name="address")
//	private String address;
//	
//	@Column(name="rt_rw")
//	private String rt_rw;
//	
//	@Column(name="kelurahan")
//	private String kelurahan;
//	
//	@Column(name="kecamatan")
//	private String kecamatan;
//	
//	@Column(name="city")
//	private String city;
//	
//	@Column(name="postal_code")
//	private String postal_code;
//	
//	@Column(name="province")
//	private String province;
//	
//	@Column(name="current_address")
//	private String current_address;
//	
//	@Column(name="current_rt_rw")
//	private String current_rt_rw;
//	
//	@Column(name="current_kelurahan")
//	private String current_kelurahan;
//	
//	@Column(name="current_kecamatan")
//	private String current_kecamatan;
//	
//	@Column(name="current_city")
//	private String current_city;
//	
//	@Column(name="current_postal_code")
//	private String current_postal_code;
//	
//	@Column(name="current_province")
//	private String current_province;
//	
//	@Column(name="mothers_maiden")
//	private String mothers_maiden;
//	
//	@Column(name="birth_place")
//	private String birth_place;
//	
//	@Column(name="birth_date")
//	private Date birth_date;
//	
//	@Column(name="occupation")
//	private String occupation;
//	
//	@Column(name="monthly_income")
//	private String monthly_income;
//	
//	@Column(name="email")
//	private String email;
//	
//	@Column(name="mobile_number")
//	private String mobile_number;
//	
//	@Column(name="nationality")
//	private String nationality;
//	
//	@Column(name="status")
//	private long status;
//	
//	@Column(name="created_date")
//	private Date created_date;
//	
//	
//	@Column(name="created_by")
//	private String created_by;
//	
//	@Column(name="last_updated_date")
//	private Date last_updated_date;
//	
//	@Column(name="last_updated_by")
//	private String last_updated_by;
//	
//	@Column(name="pan")
//	private String pan ;
//	
//	@Column(name="pin")
//	private String pin;
//	
//	
////	@OneToOne(fetch = FetchType.LAZY,optional = false)
////	@JoinColumn(name = "id_status",nullable = false )
////	private Status status2;
//	
//
//	
//	
//	
//}
