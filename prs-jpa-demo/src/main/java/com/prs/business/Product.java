package com.prs.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	// private instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // primary key
//	private int vendorID; // foreign key
	@ManyToOne
	@JoinColumn(name="vendorID") // column vendorID
	private Vendor vendor; // replace vendorID with instance of Vendor object
	private String partNumber;
	private String name;
	private double price;
	private String unit;
	private String photoPath;
	
	// generated constructor
	public Product(int id, Vendor vendor, String partNumber, String name, double price, String unit, String photoPath) {
		super();
		this.id = id;
		this.vendor = vendor;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}
	
	public Product(Vendor vendor, String partNumber, String name, double price, String unit, String photoPath) {
		this.vendor = vendor;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}
	
	// constructor w/o arguments
	public Product() {
		super();
	}
	
	// generated getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vendor getVendorID() {
		return vendor;
	}

	public void setVendorID(Vendor vendorID) {
		this.vendor = vendor;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	// generated toString method
	@Override
	public String toString() {
		return "Product [id=" + id + ", vendorID=" + vendor.getName() + ", partNumber=" + partNumber + ", name=" + name
				+ ", price=" + price + ", unit=" + unit + ", photoPath=" + photoPath + "]";
	}
	
	
}
