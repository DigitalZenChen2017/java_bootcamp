package ui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import business.Stuffie;
import db.StuffieDB;
import util.Console;

public class StuffieDispenserDBApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffie Dispenser Application!");

		Console c = new Console();
		StuffieDB sdb = new StuffieDB();

		int choice = 0;
		while (choice != 5) {
			displayMenu();
			choice = c.getIntWithinRange("\nEnter an option: ", 0, 6);
			if (choice == 1) {
				// get a list of ALL Stuffies
				try {
					List<Stuffie> stuffies = sdb.getAll();
					if (stuffies.size() == 0) {
						System.out.println("\nThere are no more Stuffies left in the dispenser.");
					} else if (stuffies.size() > 0) {
						System.out.println("\nStuffie List:\n");
						for (Stuffie s : stuffies) {
							System.out.println(s.toString());
						}
					}
				} catch (SQLException e) {
					System.out.println("Exception occurred getting all stuffies.");
					e.printStackTrace();
				}
			}
			if (choice == 2) {
				// grab a stuffie
				try {
					List<Stuffie> stuffies = sdb.getAll();// 1 - get list of all stuffies
					int size = stuffies.size(); // declare variable for stuffies ArrayList size
					int rand = (int) (Math.random() * size);// 2 - generate a random # between 0 and ArrayList stuffies
															// size
					System.out.println(rand);
					if (size > 0) {
						Stuffie s = stuffies.get(rand);// 3 - get instance of stuffie from the list
						if (sdb.delete(s))
							;
						{
							System.out.println("You got an ID # " + s);
						}
					} else if (size == 0)
						System.out.println("There are no more Stuffies left in the dispenser.");
					// 4 - delete it
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (choice == 3) {
				/// add a Stuffie
				// prompt user input for TYPE, COLOR, and SIZE
				String type = c.getString("\nEnter Stuffie Type: ");
				String color = c.getString("Enter Stuffie Color: ");
				String size = c.getString("Enter Stuffie Size: ");

				Stuffie s = new Stuffie(0, type, color, size);

				try {
					if (sdb.add(s)) {
						System.out.println("\nID # " + s.toString() + " was successfully added.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error adding Stuffie");
					e.printStackTrace();
				}
			}
			if (choice == 4) {
				// update a Stuffie
				// 1 - getAll
				List<Stuffie> stuffies;
				try {
					stuffies = sdb.getAll();
					int minID = 1;
					int maxID = 0;
					for (Stuffie s : stuffies) {
						maxID++;
						maxID = Math.max(maxID, s.getId()); // compares maxID to stuffie object id
					}
					// int id = c.getIntWithinRange("\nEnter Stuffie ID: ");
					int id = c.getIntWithinRange("\nEnter Stuffie ID: ", 1, maxID);
					String type = c.getString("Enter Stuffie Type: ");
					String color = c.getString("Enter Stuffie Color: ");
					String size = c.getString("Enter Stuffie Size: ");

					Stuffie s = new Stuffie(id, type, color, size);

					if (sdb.update(s)) {
						System.out.println("\nID # " + s.toString() + " was added.");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error updating Stuffie.");
					e.printStackTrace();
				}
			}
			if (choice == 5) {
				// Get/Inspect a Stuffie but Don't REMOVE
				System.out.println();
				int id = c.getInt("\nEnter Stuffie ID: ");
				Stuffie s = sdb.get(id);
				System.out.println("You selected a" + s);
				System.out.println();
			}
			if (choice == 6)
				System.out.println("\nThanks for Playing the Stuffie Dispenser Application!");
		}

	}

	private static void displayMenu() {
		System.out.println("\nStuffie Dispenser Options:\n");
		System.out.println("1 - List All Stuffies");
		System.out.println("2 - Grab Stuffie"); // use the get and delete altogether
		System.out.println("3 - Add A Stuffie");
		System.out.println("4 - Update A Stuffie");
		System.out.println("5 - Get/Inspect a Stuffie");
		System.out.println("6 - Exit");
	}

}
