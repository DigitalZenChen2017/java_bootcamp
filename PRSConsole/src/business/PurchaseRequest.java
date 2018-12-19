package business;

import java.util.Date;

public class PurchaseRequest {
	// private instance variables or fields
	private int id;
	private int userID;
	private String description;
	private String justification;
	private Date dateNeeded;
	private String deliveryMode;
	private int status;
	private double total;
	private Date submitttedDate;
	private String reasonForRejection;

	// create a new ArrayList
//	ArrayList<PRLI> prlis = new ArrayList<>();
	
	// generate constructors
	public PurchaseRequest(int id, int userID, String description, String justification, Date dateNeeded,
			String deliveryMode, int status, double total, Date submitttedDate, String reasonForRejection) {
		super();
		this.id = id;
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submitttedDate = submitttedDate;
		this.reasonForRejection = reasonForRejection;
	}
	
	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public Date getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(Date dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getSubmitttedDate() {
		return submitttedDate;
	}

	public void setSubmitttedDate(Date submitttedDate) {
		this.submitttedDate = submitttedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}	
	
}
