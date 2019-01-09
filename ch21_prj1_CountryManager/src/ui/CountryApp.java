package ui;

import java.sql.SQLException;
import java.util.List;

import db.CountryDB;
import util.Console;

public class CountryApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Country Manager Application!");

		// create objects and variables
		CountryDB cdb = new CountryDB();
		boolean cont = true;

		// use do while loop to continually prompt user input from 3 option menu
		do {
			displayMenu();
			// prompt user input
			int option = Console.getIntWithinRange("\nEnter Option: ", 1, 3);
			System.out.println(); // print blank line

			if (option == 1) {
				// List All Countries
				try {
					cdb.getCountries();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error occurred while trying to list all Countries.");
					e.printStackTrace();
				}
			}
			if (option == 2) {
				// Add a Country
				String country = Console.getString("Enter a Country: "); // prompt user input
				try {
					if (cdb.addCountry(country)) {
						System.out.println("\n" + country + " was successfully added.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error trying to add" + country + "to the database.");
					e.printStackTrace();
				}

			}
			if (option == 3) {
				// Delete a Country
				List<String> countries = cdb.getCountries(); // creates a List, String wrapper class object named "countries"
				int maxID = 0;
				
				for(Countries : countries) {
					
				}
				
				int id = Console.getIntWithinRange("Enter ID: ", min, max);
			}
			if (option == 4) {
				// Exit
				System.out.println("Thanks for Using the Country Manager Application! Goodbye. :)");
				cont = false;				
			}

		} while (cont == true);
	}

	private static void displayMenu() {
		System.out.println("\nMenu Options:\n");
		System.out.println("1 - List Countries");
		System.out.println("2 - Add a Country");
		System.out.println("3 - Delete a Country");
		System.out.println("4 - Exit");
	}
}
