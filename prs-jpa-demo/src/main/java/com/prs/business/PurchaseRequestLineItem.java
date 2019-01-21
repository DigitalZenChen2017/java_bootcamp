package com.prs.business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PurchaseRequestLineItem {
	// private instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // primary key
//	private int vendorID; // foreign key
	@ManyToOne
	@JoinColumn(name = "PurchaseRequestID") // foreign key purchaseRequestID joins primary key in PurchaseRequest class
	private PurchaseRequest purchaseRequest; // replace purchaseRequestID with instance of PR object
	@ManyToOne
	@JoinColumn(name = "productID")
	private Product product;
	private int quantity;
	
	// generated constructor
	public PurchaseRequestLineItem(int id, PurchaseRequest purchaseRequest, Product product, int quantity) {
		super();
		this.id = id;
		this.purchaseRequest = purchaseRequest;
		this.product = product;
		this.quantity = quantity;
	}
	
	// constructor w/o arguments
	public PurchaseRequestLineItem() {
		super();
	}
	
	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PurchaseRequest getPurchaseRequest() {
		return purchaseRequest;
	}

	public void setPurchaseRequest(PurchaseRequest purchaseRequest) {
		this.purchaseRequest = purchaseRequest;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "PurchaseRequestLineItem [id=" + id + ", purchaseRequest=" + purchaseRequest + ", product=" + product
				+ ", quantity=" + quantity + "]";
	}
}