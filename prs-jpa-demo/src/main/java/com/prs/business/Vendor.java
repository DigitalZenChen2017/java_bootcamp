package com.prs.business;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendor {
	// private instance variables or fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // database must assign id
	private int id; // primary key
	private String code;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	@Column(name = "isPreApproved") // changes variable name to match mySQL field name
	private boolean preApproved;;

	@OneToMany(fetch = FetchType.EAGER, mappedBy="vendor")
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Vendor() {
		super();
	}

	// generated constructor with EVERY instance variable
	public Vendor(int id, String code, String name, String address, String city, String state, String zip,
			String phoneNumber, String email, boolean preApproved) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.preApproved = preApproved;
	}

	// constructor used in PRSDB class
	public Vendor(String code, String name, String address, String city, String state, String zip, String phoneNumber,
			String email, boolean preApproved) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.preApproved = preApproved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPreApproved() { // boolean getPreApproved method
		return preApproved;
	}

	public void setPreApproved(boolean preApproved) {
		this.preApproved = preApproved;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", code=" + code + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", preApproved=" + preApproved + ", products:" + products + "]";
	}

//	@Override
//	public String toString() {
////		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
////				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", isReviewer="
////				+ isReviewer + ", isAdmin=" + isAdmin + "]";
//		return id + " " + code + " " + name + " " + address + " " + city + " " + state + " " + zip + " " + phoneNumber
//				+ " " + email + " " + preApproved;
//	}

}
