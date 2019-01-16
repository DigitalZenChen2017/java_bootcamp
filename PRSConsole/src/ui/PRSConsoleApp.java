package ui;

import util.Console;

import java.sql.SQLException;
import java.util.List;
import business.User;
import db.PRSDB;

public class PRSConsoleApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Purchase Request System Application!");

		// define objects and variables
		Console c = new Console();
		PRSDB pdb = new PRSDB();
		boolean cont = false;

		while (cont == false) {
			// displayMenu method should be inside the while loop, switch statement, etc.
			displayMenu();
			System.out.println();
			int selection = c.getIntWithinRange("Enter An Option: ", 0, 5);
			switch (selection) {
			case 1: // Display All Users in the PRS System
				try {
					System.out.println(); // print space between displayMenu and displayed list
					@SuppressWarnings("unchecked")
					List<User> users = pdb.getAll(); // create List object of users and store
					for (User u : users) {
						System.out.println(u.toString());
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error trying to connect to PRS database.");
					e.printStackTrace();
				}
				break;
			case 2: // Add A User
				String userName = c.getString("Create Username: ");
				String password = c.getString("Create Password: ");
				String firstName = c.getString("Enter Your First Name: ");
				String lastName = c.getString("Enter Your Last Name: ");
				String phoneNumber = c.getString("Enter Phone #: ");
				String email = c.getString("Enter E-Mail: ");

				// create new instance of User object
				User u = new User(userName, password, firstName, lastName, phoneNumber, email);

				try {
					if (pdb.add(u)) {
						System.out.println("ID # " + u.toString() + " was successfully added to the User database.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error trying to add" + "ID # " + u.toString() + "to PRS database.");
					e.printStackTrace();
				}

			case 3: // Update A User
				
			case 4: // Delete A User
				System.out.println();
				int deleteID = c.getInt("Enter User ID # to Delete: ");
				
//				try {
//					
//				}
////				catch (SQLException s) {
////					s.printStackTrace();
////				}
				
			case 5: // Inspect A User
				System.out.println(); // space between "Enter Option" and "Enter ID #"
				int inspectID = c.getInt("Enter ID #: ");
				User user = null;
				try {
					user = pdb.get(inspectID);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("\nYou selected ID # " + user);
			}

		}

	}

	private static void displayMenu() {
		System.out.println("\nUser Menu:\n");
		System.out.println("1 - Display All Users");
		System.out.println("2 - Add A User");
		System.out.println("3 - Update A User");
		System.out.println("4 - Delete A User");
		System.out.println("5 - Get/Inspect A User");
	}

}
