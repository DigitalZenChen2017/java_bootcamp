package ui;

import util.Console;

import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;

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
					if (pdb.add(u)) {
						System.out.println("ID # " + u.toString() + " was successfully added to the User database.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error trying to add" + "ID # " + u.toString() + "to PRS database.");
					e.printStackTrace();
				}
				break;
			case 3: // Update A User
				try {
					List<User> users; // Declare a List named users
					users = pdb.getAll(); // create List of user objects from SQL result set
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
							updatedLastName, updatedPhoneNumber, updatedEmail); // create new Updated User object

					if (pdb.update(updatedUser)) {
						System.out.println("\nID # " + updatedUser.toString() + " was successfully updated.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error trying to update User!");
					e.printStackTrace();
				}
				break;
			case 4: // Delete A User
				System.out.println();
				try {
					List<User> users = pdb.getAll();
					int minID = 1;
					int maxID = 0;
					for (User user : users) {
						maxID++;
						maxID = Math.max(maxID, user.getId());
					}
					int deleteID = c.getIntWithinRange("Enter User ID # to Delete: ", minID, maxID);

					if (pdb.delete(deleteID)) {
						System.out.println("ID # " + deleteID + " was successfully deleted." );
					}
				}
				catch (SQLException s) {
					s.printStackTrace();
				}
				break;
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
				break;
			case 6: // Exit Menu
				System.out.println("Thanks For Using the Purchase Request System! YOU ROCK!");
				cont = true;
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
		System.out.println("6 - Exit Menu");
	}

}
