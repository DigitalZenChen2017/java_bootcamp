package com.prs;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.Product;
import com.prs.business.PurchaseRequest;
import com.prs.business.PurchaseRequestLineItem;
import com.prs.business.User;
import com.prs.business.Vendor;
import com.prs.db.ProductDB;
import com.prs.db.PurchaseRequestDB;
import com.prs.db.PurchaseRequestLineItemDB;
import com.prs.db.UserDB;
import com.prs.db.VendorDB;
import com.prs.util.Console;

@SpringBootApplication
public class PRSJPADemoApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(PRSJPADemoApplication.class, args);

		// welcome message
		System.out.println("Welcome to the Purchase Request System Application!");

		// define objects and variables
		Console c = new Console();
		boolean mainChoice = false;

		while (mainChoice == false) {
			/*
			 * #1 First display the Main Menu which toggles between other sub-menus like
			 * User, Vendor, Product, PurchaseRequest, and PRLI
			 */

			displayMainMenu();
			System.out.println();
			boolean subChoice = false;
			int mainSelection = c.getIntWithinRange("Select An Option: ", 1, 6);

			while (subChoice == false) {
				// USER CRUD SUB-MENU
				if (mainSelection == 1) {
					// displayMenu method should be inside the while loop
					displayUserMenu();
					System.out.println();
					int userSelection = c.getIntWithinRange("Enter An Option: ", 0, 6);
					// Get All Users
					if (userSelection == 1) {
						List<User> users = UserDB.getAll();
						for (User u : users) { // for each User object out of ArrayList, do the statement below
							System.out.println(u);
						}
					}
					// Add a User
					else if (userSelection == 2) {
						String addedUserName = c.getString("Create Username: ");
						String addedPassword = c.getString("Create Password: ");
						String addedFirstName = c.getString("Enter Your First Name: ");
						String addedLastName = c.getString("Enter Your Last Name: ");
						String addedPhoneNumber = c.getString("Enter Phone #: ");
						String addedEmail = c.getString("Enter E-Mail: ");
						User addedUser = new User();
						addedUser.setUserName(addedUserName);
						addedUser.setPassword(addedPassword);
						addedUser.setFirstName(addedFirstName);
						addedUser.setLastName(addedLastName);
						addedUser.setPhoneNumber(addedPhoneNumber);
						addedUser.setEmail(addedEmail);
						if (UserDB.add(addedUser)) {
							System.out.println("\nID # " + addedUser + " was successfully added to the User database.");
						}
					}
					// Update a User
					else if (userSelection == 3) {
						int updateID = c.getInt("Enter ID to Update: ");

						User updatedUser = UserDB.getUserById(updateID); // creates instance of User object by id

						String updatedPassword = c.getString("Enter New Password: ");

						updatedUser.setPassword(updatedPassword); // sets new updated user object

						if (UserDB.update(updatedUser)) {
							System.out.println("\nID # " + updatedUser + " was successfully updated.");
						}
					}
					// Delete a User
					else if (userSelection == 4) {
						System.out.println();
						int deleteID = c.getInt("Enter ID to Delete: ");
						User deleteUser = UserDB.getUserById(deleteID); // creates instance of User object by id
						if (UserDB.delete(deleteUser)) {
							System.out.println("\nID # " + deleteID + " was successfully deleted.");
						}
					}
					// Get a User
					else if (userSelection == 5) {
						System.out.println(); // space between "Enter Option" and "Enter ID #"
						int inspectID = c.getInt("Enter ID #: ");
						User user = UserDB.getUserById(inspectID);
						System.out.println("\nYou selected ID # " + user);
					}
					// Return to Main Menu
					if (userSelection == 6) {
						subChoice = true;
					}
				}
				// VENDOR CRUD SUB-MENU
				else if (mainSelection == 2) {
					displayVendorMenu();
					System.out.println();
					int vendorSelection = c.getIntWithinRange("Enter An Option: ", 0, 6);
					// Get All Users
					if (vendorSelection == 1) {
						List<Vendor> vendors = VendorDB.getAll();
						for (Vendor v : vendors) { // for each Vendor object out of ArrayList, do the statement below
							System.out.println(v);
						}
					}
					// Add a User
					else if (vendorSelection == 2) {
						String addedCode = c.getString("Create Code: ");
						String addedName = c.getString("Create Name: ");
						String addedAddress = c.getString("Enter Your Address: ");
						String addedCity = c.getString("Enter Your City: ");
						String addedState = c.getString("Enter State: ");
						String addedZip = c.getString("Enter Zip: ");
						String addedPhoneNumber = c.getString("Enter Phone #: ");
						String addedEmail = c.getString("Enter Email: ");
						Vendor addedVendor = new Vendor();
						addedVendor.setCode(addedCode);
						addedVendor.setName(addedName);
						addedVendor.setAddress(addedAddress);
						addedVendor.setCity(addedCity);
						addedVendor.setState(addedState);
						addedVendor.setZip(addedZip);
						addedVendor.setPhoneNumber(addedPhoneNumber);
						addedVendor.setEmail(addedEmail);
						if (VendorDB.add(addedVendor)) {
							System.out.println(
									"\nID # " + addedVendor + " was successfully added to the Vendor database.");
						}
					}
					// Update a User
					else if (vendorSelection == 3) {
						int updateID = c.getInt("Enter ID to Update: ");

						Vendor updatedVendor = VendorDB.getVendorById(updateID); // creates instance of User object by
																					// id

						String updatedVendorName = c.getString("Enter New Vendor Name: ");

						updatedVendor.setName(updatedVendorName); // sets new updated user object

						if (VendorDB.update(updatedVendor)) {
							System.out.println("\nID # " + updatedVendor + " was successfully updated.");
						}
					}
					// Delete a User
					else if (vendorSelection == 4) {
						System.out.println();
						int deleteID = c.getInt("Enter ID to Delete: ");
						Vendor deleteVendor = VendorDB.getVendorById(deleteID); // creates instance of User object by id
						if (VendorDB.delete(deleteVendor)) {
							System.out.println("\nID # " + deleteVendor + " was successfully deleted.");
						}
					}
					// Get a User
					else if (vendorSelection == 5) {
						System.out.println(); // space between "Enter Option" and "Enter ID #"
						int inspectID = c.getInt("Enter ID #: ");
						Vendor vendor = VendorDB.getVendorById(inspectID);
						System.out.println("\nYou selected ID # " + vendor);
					}
					// Return to Main Menu
					if (vendorSelection == 6) {
						subChoice = true;
					}
				}
				// PRODUCT SUB-MENU
				else if (mainSelection == 3) {
					displayProductMenu();
					System.out.println();
					int productSelection = c.getIntWithinRange("Enter An Option: ", 0, 7);
					// Get All Products
					if (productSelection == 1) {
						List<Product> products = ProductDB.getAll(); // create a List object of Product that calls the
																		// getAll method
						for (Product p : products) { // for each Vendor object out of ArrayList, do the statement below
							System.out.println(p);
						}
					}
					// Add a Product
					else if (productSelection == 2) {
						int addedVendorID = c.getInt("Select Vendor ID: ");
						Vendor v = VendorDB.getVendorById(addedVendorID);
						String addedPartNumber = c.getString("Create Part Number: ");
						String addedName = c.getString("Create Product Name: ");
						Double addedPrice = c.getDouble("Create Product Price: ");
						String addedUnit = c.getString("Create Unit: ");
						String addedPhotoPath = c.getString("Create Photo Path: ");
						Product addedProduct = new Product(v, addedPartNumber, addedName, addedPrice, addedUnit,
								addedPhotoPath);
//						addedProduct.setPartNumber(addedPartNumber);
//						addedProduct.setName(addedName);
//						addedProduct.setPrice(addedPrice);
//						addedProduct.setUnit(addedUnit);
//						addedProduct.setPhotoPath(addedPhotoPath);
						if (ProductDB.add(addedProduct)) {
							System.out.println(
									"\nID # " + addedProduct + " was successfully added to the Product database.");
						}
					}
					// Update a Product
					else if (productSelection == 3) {
						int updateID = c.getInt("Enter ID to Update: ");
						Product updatedProduct = ProductDB.getProductById(updateID); //
						String updatedVendorName = c.getString("Enter New Vendor Name: ");
						updatedProduct.setName(updatedVendorName); // sets new updated user object
						if (ProductDB.update(updatedProduct)) {
							System.out.println("\nID # " + updatedProduct + " was successfully updated.");
						}
					}
					// Delete a Product
					else if (productSelection == 4) {
						System.out.println();
						int deleteID = c.getInt("Enter ID to Delete: ");
						Product deleteProduct = ProductDB.getProductById(deleteID); // creates instance of User object
																					// by id
						if (ProductDB.delete(deleteProduct)) {
							System.out.println("\nID # " + deleteProduct + " was successfully deleted.");
						}
					}
					// Get a Product
					else if (productSelection == 5) {
						System.out.println(); // space between "Enter Option" and "Enter ID #"
						int inspectID = c.getInt("Enter ID #: ");
						Product product = ProductDB.getProductById(inspectID);
						System.out.println("\nYou selected ID # " + product);
					}
					// Get All Products By Vendor ID
					else if (productSelection == 6) {
						int vid = c.getInt("Enter Vendor ID: ");
						List<Product> products = ProductDB.getAllProductsByVendorID(vid);
						for (Product p : products) {
							System.out.println(p);
						}
					}
					// Return to Main Menu
					else if (productSelection == 7) {
						subChoice = true;
					}

				}
				// PURCHASE REQUEST SUB-MENU
				else if (mainSelection == 4) {
					displayPurchaseRequestMenu();
					System.out.println();
					int purchaseRequestSelection = c.getIntWithinRange("Enter An Option: ", 0, 7);
					// Get All Purchase Requests
					if (purchaseRequestSelection == 1) {
						List<PurchaseRequest> purchaseRequests = PurchaseRequestDB.getAll(); // create a List object of
																								// PurchaseRequest that
																								// calls the
						// getAll method
						for (PurchaseRequest pr : purchaseRequests) { // for each Vendor object out of ArrayList, do the
																		// statement below
							System.out.println(pr);
						}
					}
					// Add a Purchase Request
					else if (purchaseRequestSelection == 2) {
						int addedUserID = c.getInt("Select User ID: ");
						User u = UserDB.getUserById(addedUserID); // instantiates User object by passing in user
																	// prompted ID
						String addedDescription = c.getString("Create Description: ");
						String addedJustification = c.getString("Create Justification: ");
						String dateNeeded = c.getString("Enter Date Needed By (yyyy-mm-dd): ");
						LocalDate lddateNeeded = LocalDate.parse(dateNeeded);
						String addedDeliveryMode = c.getString("Create Delivery Mode: ");
						String addedStatus = c.getString("Create Status: ");
						double addedTotal = c.getDouble("Create Total: ");
//						String addedSubmittedDate = c.getString("Create Submitted Date: ");
						LocalDateTime submittedDate = LocalDateTime.now();
						String addedReasonForRejection = c.getString("Create Reason for Rejection: ");
						PurchaseRequest addedPurchaseRequest = new PurchaseRequest(u, addedDescription,
								addedJustification, lddateNeeded, addedDeliveryMode, addedStatus, addedTotal,
								submittedDate, addedReasonForRejection);

						if (PurchaseRequestDB.add(addedPurchaseRequest)) {
							System.out.println("\nID # " + addedPurchaseRequest
									+ " was successfully added to the PurchaseRequest database.");
						}
					}
					// Update a Purchase Request
					else if (purchaseRequestSelection == 3) {
						int updateID = c.getInt("Enter ID to Update: ");
						PurchaseRequest updatedPurchaseRequest = PurchaseRequestDB.getPurchaseRequestById(updateID); //
						String updatedDescription = c.getString("Enter New Description: ");
						String updatedDateNeeded = c.getString("Enter New Date Needed (yyyy-mm-dd): ");
						LocalDate lddateNeeded = LocalDate.parse(updatedDateNeeded);
						updatedPurchaseRequest.setDescription(updatedDescription);
						updatedPurchaseRequest.setDateNeeded(lddateNeeded);
						if (PurchaseRequestDB.update(updatedPurchaseRequest)) {
							System.out.println("\nID # " + updatedPurchaseRequest + " was successfully updated.");
						}
					}
					// Delete a Purchase Request
					else if (purchaseRequestSelection == 4) {
						System.out.println();
						int deleteID = c.getInt("Enter ID to Delete: ");
						PurchaseRequest deletePurchaseRequest = PurchaseRequestDB.getPurchaseRequestById(deleteID);
						if (PurchaseRequestDB.delete(deletePurchaseRequest)) {
							System.out.println("\nID # " + deletePurchaseRequest + " was successfully deleted.");
						}
					}
					// Get a Purchase Request
					else if (purchaseRequestSelection == 5) {
						System.out.println(); // space between "Enter Option" and "Enter ID #"
						int inspectID = c.getInt("Enter ID #: ");
						PurchaseRequest purchaseRequest = PurchaseRequestDB.getPurchaseRequestById(inspectID);
						System.out.println("\nYou selected ID # " + purchaseRequest);
					}
					// Get All Purchase Request By User ID
					else if (purchaseRequestSelection == 6) {
						int userID = c.getInt("Enter User ID: ");
						List<PurchaseRequest> purchaseRequestsByUserID = PurchaseRequestDB
								.getAllPurchaseRequestsByUserID(userID);
						for (PurchaseRequest pr : purchaseRequestsByUserID) {
							System.out.println(pr);
						} // for each PurchaseRequest object pr out of List purchaseRequestByUserID, print
							// object toString()
					}
					// Return to Main Menu
					else if (purchaseRequestSelection == 7) {
						subChoice = true;
					}
				}
				// PURCHASE REQUEST LINE ITEM SUB-MENU
				else if (mainSelection == 5) {
					displayPurchaseRequestLineItemMenu();
					System.out.println();
					int purchaseRequestLineItemSelection = c.getIntWithinRange("Enter An Option: ", 0, 7);
					// Get All Purchase Requests
					if (purchaseRequestLineItemSelection == 1) {
						List<PurchaseRequestLineItem> purchaseRequestLineItems = PurchaseRequestLineItemDB.getAll(); // create
																														// a
																														// List
																														// object
																														// of
						// PurchaseRequest that
						// calls the
						// getAll method
						for (PurchaseRequestLineItem prli : purchaseRequestLineItems) { // for each PRLI object out of
																						// ArrayList, do the
							// statement below
							System.out.println(prli);
						}
					}
					// Add a Purchase Request Line Item
					else if (purchaseRequestLineItemSelection == 2) {
						int addedPurchaseRequestID = c.getInt("Select Purchase Request ID: ");
						PurchaseRequest addedPR = PurchaseRequestDB.getPurchaseRequestById(addedPurchaseRequestID);
						int addedProductID = c.getInt("Select Product ID: "); // selected Product ID
						Product addedProduct = ProductDB.getProductById(addedProductID);
						int quantity = c.getInt("Enter Quantity: ");
						PurchaseRequestLineItem addedPurchaseRequestLineItem = new PurchaseRequestLineItem();
						addedPurchaseRequestLineItem.setPurchaseRequest(addedPR);
						addedPurchaseRequestLineItem.setProduct(addedProduct);
						addedPurchaseRequestLineItem.setQuantity(quantity);
						if (PurchaseRequestLineItemDB.add(addedPurchaseRequestLineItem)) {
							System.out.println("\nID # " + addedPurchaseRequestLineItem
									+ " was successfully added to the PurchaseRequest database.");
						}
					}
					// Update a Purchase Request Line Item
					else if (purchaseRequestLineItemSelection == 3) {
						int updateID = c.getInt("Enter ID to Update: ");
						PurchaseRequestLineItem updatedPurchaseRequestLineItem = PurchaseRequestLineItemDB
								.getPurchaseRequestLineItemById(updateID);
						int updatedPurchaseRequestID = c.getInt("Enter New Purchase Request ID: ");
						PurchaseRequest updatedPR = PurchaseRequestDB.getPurchaseRequestById(updatedPurchaseRequestID);
						int updatedProductID = c.getInt("Enter New Product ID: ");
						Product updatedProduct = ProductDB.getProductById(updatedProductID);
						int updatedQuantity = c.getInt("Enter New Quantity: ");
						updatedPurchaseRequestLineItem.setPurchaseRequest(updatedPR);
						updatedPurchaseRequestLineItem.setProduct(updatedProduct);
						updatedPurchaseRequestLineItem.setQuantity(updatedQuantity);
						if (PurchaseRequestLineItemDB.update(updatedPurchaseRequestLineItem)) {
							System.out
									.println("\nID # " + updatedPurchaseRequestLineItem + " was successfully updated.");
						}
					}
					// Delete a Purchase Request Line Item
					else if (purchaseRequestLineItemSelection == 4) {
						System.out.println();
						int deleteID = c.getInt("Enter ID to Delete: ");
						PurchaseRequestLineItem deletePurchaseRequestLineItem = PurchaseRequestLineItemDB
								.getPurchaseRequestLineItemById(deleteID);
						if (PurchaseRequestLineItemDB.delete(deletePurchaseRequestLineItem)) {
							System.out
									.println("\nID # " + deletePurchaseRequestLineItem + " was successfully deleted.");
						}
					}
					// Get a Purchase Request Line Item
					else if (purchaseRequestLineItemSelection == 5) {
						System.out.println(); // space between "Enter Option" and "Enter ID #"
						int inspectID = c.getInt("Enter ID #: ");
						PurchaseRequestLineItem purchaseRequestLineItem = PurchaseRequestLineItemDB
								.getPurchaseRequestLineItemById(inspectID);
						System.out.println("\nYou selected ID # " + purchaseRequestLineItem);
					}
					// Get All Purchase Request Line Items By Purchase Request ID
					else if (purchaseRequestLineItemSelection == 6) {
						int purchaseRequestID = c.getInt("Enter Purchase Request ID: ");
						List<PurchaseRequestLineItem> purchaseRequestLineItemsByPRID = PurchaseRequestLineItemDB
								.getAllPurchaseRequestLineItemsByPurchaseRequestID(purchaseRequestID);
						for (PurchaseRequestLineItem prli : purchaseRequestLineItemsByPRID) {
							System.out.println(prli);
						} // for each PurchaseRequestLineItem object prli out of List
							// purchaseRequestLineItemsByPRID, print
							// object toString()
					}
					// Return to Main Menu
					else if (purchaseRequestLineItemSelection == 7) {
						subChoice = true;
					}
				} else if (mainSelection == 6) {
					subChoice = true;
					mainChoice = true;
				}
			}
		}
	}

	private static void displayMainMenu() {
		System.out.println("\nMain Menu:\n");
		System.out.println("1 - User CRUD Functions");
		System.out.println("2 - Vendor CRUD Functions");
		System.out.println("3 - Product CRUD Functions ");
		System.out.println("4 - PurchaseRequest CRUD Functions ");
		System.out.println("5 - PurchaseRequestLineItem CRUD Functions ");
		System.out.println("6 - Exit Main Menu");
	}

	private static void displayUserMenu() {
		System.out.println("\nUser Menu:\n");
		System.out.println("1 - Display All Users");
		System.out.println("2 - Add A User");
		System.out.println("3 - Update A User");
		System.out.println("4 - Delete A User");
		System.out.println("5 - Get/Inspect A User");
		System.out.println("6 - Return to Main Menu");
	}

	private static void displayVendorMenu() {
		System.out.println("\nVendor Menu:\n");
		System.out.println("1 - Display All Vendors");
		System.out.println("2 - Add A Vendor");
		System.out.println("3 - Update A Vendor");
		System.out.println("4 - Delete A Vendor");
		System.out.println("5 - Get/Inspect A Vendor");
		System.out.println("6 - Return to Main Menu");
	}

	private static void displayProductMenu() {
		System.out.println("\nProduct Menu:\n");
		System.out.println("1 - Display All Products");
		System.out.println("2 - Add A Product");
		System.out.println("3 - Update A Product");
		System.out.println("4 - Delete A Product");
		System.out.println("5 - Get/Inspect A Product");
		System.out.println("6 - Get Products By Vendor ID");
		System.out.println("7 - Return to Main Menu");
	}

	private static void displayPurchaseRequestMenu() {
		System.out.println("\nPurchase Request Menu:\n");
		System.out.println("1 - Display All Purchase Requests");
		System.out.println("2 - Add A Purchase Request");
		System.out.println("3 - Update A Purchase Request");
		System.out.println("4 - Delete A Purchase Request");
		System.out.println("5 - Get/Inspect A Purchase Request");
		System.out.println("6 - Get Purchase Request By User ID");
		System.out.println("7 - Return to Main Menu");
	}

	private static void displayPurchaseRequestLineItemMenu() {
		System.out.println("\nPurchase Request Line Item Menu:\n");
		System.out.println("1 - Display All Purchase Request Line Items");
		System.out.println("2 - Add A Purchase Request Line Item");
		System.out.println("3 - Update A Purchase Request Line Item");
		System.out.println("4 - Delete A Purchase Request Line Item");
		System.out.println("5 - Get/Inspect A Purchase Request Line Item");
		System.out.println("6 - Get Purchase Request Line Item By Purchase Request ID");
		System.out.println("7 - Return to Main Menu");
	}
}
