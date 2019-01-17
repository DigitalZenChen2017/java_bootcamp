package ui;

import util.Console;

import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;

import business.User;
import business.Vendor;
import db.UserDB;
import db.VendorDB;

public class PRSConsoleApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Purchase Request System Application!");

		// define objects and variables
		Console c = new Console();
		UserDB udb = new UserDB();
		VendorDB vdb = new VendorDB();
		boolean mainChoice = false;

		while (mainChoice == false) {
			/*
			 * #1 First display the Main Menu which toggles between other sub-menus like
			 * User and Vendor
			 */

			displayMainMenu();
			System.out.println();
			boolean subChoice = false;
			int mainSelection = c.getIntWithinRange("Select An Option: ", 1, 3);

			while (subChoice == false) {
				// User CRUD SUB-MENU
				if (mainSelection == 1) {
					// displayMenu method should be inside the while loop
					displayUserMenu();
					System.out.println();
					int userSelection = c.getIntWithinRange("Enter An Option: ", 0, 6);
					if (userSelection == 1) {
//			case 1: // Display All Users in the PRS System
						try {
							System.out.println(); // print space between displayMenu and displayed list
							@SuppressWarnings("unchecked")
							List<User> users = udb.getAll(); // create List object of users and store
							for (User u : users) {
								System.out.println(u.toString());
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							System.out.println("Error trying to connect to PRS database.");
							e.printStackTrace();
						}
					}
//				break;
//			case 2: // Add A User
					if (userSelection == 2) {
						String addedUserName = c.getString("Create Username: ");
						String addedPassword = c.getString("Create Password: ");
						String addedFirstName = c.getString("Enter Your First Name: ");
						String addedLastName = c.getString("Enter Your Last Name: ");
						String addedPhoneNumber = c.getString("Enter Phone #: ");
						String addedEmail = c.getString("Enter E-Mail: ");

						// create new instance of User object
						User u = new User(addedUserName, addedPassword, addedFirstName, addedLastName, addedPhoneNumber,
								addedEmail);

						try {
							if (udb.add(u)) {
								System.out.println(
										"ID # " + u.toString() + " was successfully added to the User database.");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							System.out.println("Error trying to add" + "ID # " + u.toString() + "to PRS database.");
							e.printStackTrace();
						}
					}
//				break;
//			case 3: // Update A User
					if (userSelection == 3) {
						try {
							List<User> users; // Declare a List named users
							users = udb.getAll(); // create List of user objects from SQL result set
							int minID = 1;
							int maxID = 0;
							for (User user : users) { // loop there each user and set maxID equals to highest ID #
								maxID++;
								maxID = Math.max(maxID, user.getId()); // compares maxID to stuffie object id
							}
							int updateID = c.getIntWithinRange("Enter ID to Update: ", minID, maxID);
							String updatedUserName = c.getString("Enter New Username: ");
							String updatedPassword = c.getString("Enter New Password: ");
							String updatedFirstName = c.getString("Enter New First Name: ");
							String updatedLastName = c.getString("Enter New Last Name: ");
							String updatedPhoneNumber = c.getString("Enter New Phone #: ");
							String updatedEmail = c.getString("Enter New E-Mail: ");

							User updatedUser = new User(updateID, updatedUserName, updatedPassword, updatedFirstName,
									updatedLastName, updatedPhoneNumber, updatedEmail); // create new Updated User
																						// object

							if (udb.update(updatedUser)) {
								System.out.println("\nID # " + updatedUser.toString() + " was successfully updated.");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							System.out.println("Error trying to update User!");
							e.printStackTrace();
						}
					}
//				break;
//			case 4: // Delete A User
					if (userSelection == 4) {
						System.out.println();
						try {
							@SuppressWarnings("unchecked")
							List<User> users = udb.getAll();
							int minID = 1;
							int maxID = 0;
							for (User user : users) {
								maxID++;
								maxID = Math.max(maxID, user.getId());
							}
							int deleteID = c.getIntWithinRange("Enter User ID # to Delete: ", minID, maxID);

							if (udb.delete(deleteID)) {
								System.out.println("\nID # " + deleteID + " was successfully deleted.");
							}
						} catch (SQLException s) {
							s.printStackTrace();
						}
					}
//				break;
//			case 5: // Inspect A User
					if (userSelection == 5) {
						System.out.println(); // space between "Enter Option" and "Enter ID #"
						int inspectID = c.getInt("Enter ID #: ");
						User user = null;
						try {
							user = udb.get(inspectID);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("\nYou selected ID # " + user);
					}
//				break;
//			case 6: // Return to Main Menu
					if (userSelection == 6) {
						subChoice = true;
					}
				}
					// VENDOR SUB-MENU
					if (mainSelection == 2) {
						displayVendorMenu();
						System.out.println();
						int vendorSelection = c.getIntWithinRange("Enter An Option: ", 0, 6);
						if (vendorSelection == 1) {
//			case 1: // Display All Vendors in the PRS System
							try {
								System.out.println(); // print space between displayMenu and displayed list
								@SuppressWarnings("unchecked")
								List<Vendor> vendors = vdb.getAll(); // create List object of users and store
								for (Vendor v : vendors) {
									System.out.println(v.toString());
								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								System.out.println("Error trying to connect to PRS database.");
								e.printStackTrace();
							}
						}
//				break;
//			case 2: // Add A Vendor
						if (vendorSelection == 2) {
							String addedCode = c.getString("Create Code: ");
							String addedName = c.getString("Create Name: ");
							String addedAddress = c.getString("Enter Your Address: ");
							String addedCity = c.getString("Enter Your City: ");
							String addedState = c.getString("Enter Your State: ");
							String addedZip = c.getString("Enter Your Zip Code: ");
							String addedPhoneNumber = c.getString("Enter Your Phone #: ");
							String addedEmail = c.getString("Enter Your E-Mail: ");
							// create new instance of User object
							Vendor v = new Vendor(addedCode, addedName, addedAddress, addedCity, addedState, addedZip,
									addedPhoneNumber, addedEmail);

							try {
								if (vdb.add(v)) {
									System.out.println(
											"ID # " + v.toString() + " was successfully added to the Vendor database.");
								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								System.out.println("Error trying to add" + "ID # " + v.toString() + "to PRS database.");
								e.printStackTrace();
							}
						}
//				break;
//			case 3: // Update A Vendor
						if (vendorSelection == 3) {
							try {
								List<Vendor> vendors; // Declare a List named users
								vendors = vdb.getAll(); // create List of user objects from SQL result set
								int minID = 1;
								int maxID = 0;
								for (Vendor vendor : vendors) { // loop there each user and set maxID equals to highest
																// ID #
									maxID++;
									maxID = Math.max(maxID, vendor.getId()); // compares maxID to Vendor object id
								}
								int updateID = c.getIntWithinRange("Enter ID to Update: ", minID, maxID);
								String updatedCode = c.getString("Enter New Code: ");
								String updatedName = c.getString("Enter New Name: ");
								String updatedAddress = c.getString("Enter New Address: ");
								String updatedCity = c.getString("Enter New City: ");
								String updatedState = c.getString("Enter New State #: ");
								String updatedZip = c.getString("Enter New Zip: ");
								String updatedPhoneNumber = c.getString("Enter New Phone #: ");
								String updatedEmail = c.getString("Enter New Email: ");

								// create new updated Vendor object
								Vendor updatedVendor = new Vendor(updateID, updatedCode, updatedName, updatedAddress,
										updatedCity, updatedState, updatedZip, updatedPhoneNumber, updatedEmail);

								if (vdb.update(updatedVendor)) {
									System.out.println(
											"\nID # " + updatedVendor.toString() + " was successfully updated.");
								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								System.out.println("Error trying to update Vendor!");
								e.printStackTrace();
							}
						}
//				break;
//			case 4: // Delete A Vendor
						if (vendorSelection == 4) {
							System.out.println();
							try {
								@SuppressWarnings("unchecked")
								List<Vendor> vendors = vdb.getAll(); // create list of ALL vendors from SQL database
								int minID = 1;
								int maxID = 0;
								for (Vendor vendor : vendors) { // for each Vendor object from ArrayList of vendors do
																// the
																// following
									maxID++;
									maxID = Math.max(maxID, vendor.getId()); // compares maxID to assigned Vendor object
																				// ID
								}
								int deleteID = c.getIntWithinRange("Enter User ID # to Delete: ", minID, maxID);

								if (vdb.delete(deleteID)) {
									System.out.println("\nID # " + deleteID + " was successfully deleted.");
								}
							} catch (SQLException s) {
								s.printStackTrace();
							}
						}
//				break;
//			case 5: // Inspect A Vendor
						if (vendorSelection == 5) {
							System.out.println(); // space between "Enter Option" and "Enter ID #"
							int inspectID = c.getInt("Enter ID #: ");
							Vendor vendor = null;
							try {
								vendor = vdb.get(inspectID);
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("\nYou selected ID # " + vendor);
						}
//				break;
//			case 6: // Exit Menu
						if (vendorSelection == 6) {
							subChoice = true;
						}

					}

					if (mainSelection == 3) {
						System.out.println("\nThanks For Using the Purchase Request System! YOU ROCK!");
						mainChoice = true;
						subChoice = true;
					}

				}
			}
		}


	private static void displayMainMenu() {
		System.out.println("\nMain Menu:\n");
		System.out.println("1 - User CRUD Functions");
		System.out.println("2 - Vendor CRUD Functions");
		System.out.println("3 - Exit Main Menu");
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

}
