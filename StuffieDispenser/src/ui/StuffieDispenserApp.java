package ui;

import business.Stuffie;
import db.StuffyDB;
import util.Console;

public class StuffieDispenserApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Stuffy Dispenser Application!\n");
		// define variables and objects
		boolean choice = true;
		Console c = new Console();
		StuffyDB db = new StuffyDB(); // populates Stuffy objects
		// while loop
		while (choice == true) {
			// Display Menu
			System.out.println("MENU:\n" + "1. Grab Stuffie\n" + "2. Add Stuffie\n" + "3. Exit\n");
			// Prompt User Input
			int selection = c.getIntWithinRange("Select From 3 Options: ", 1, 3);
			// 3 Options
			switch (selection) {
			case 1: // Grab Stuffie
					// obtains a random ID between 0 and DBSize
				boolean hasStuffy = false;

				if (db.getDBSize() == 0) {
					System.out.println("\nThere are no more stuffies left in the dispenser.\n");
					break;
				}
				// while loop hasStuffy not true
				while (!hasStuffy == true) {
					int stuffyID = (int) (Math.random() * db.getDBSize() + 1); // changed getDBSize method

					if (db.checkForStuffy(stuffyID)) { // checks if random StuffyID matches an ID in the ArrayList of
														// stuffies
						Stuffie stuffy = new Stuffie();
						stuffy = db.grabStuffie(stuffyID);
						System.out.println("\nYou grabbed a " + stuffy + "!\n");
						hasStuffy = true;
						break;
					}
				}
				break;
			case 2: // Add Stuffie
				String stuffieType = c.getString("\nEnter Stuffie Type: ");
				String stuffieSize = c.getString("Enter Stuffie Size: ");
				String stuffieColor = c.getString("Enter Stuffie Color: ");
				Stuffie s = new Stuffie(db, stuffieType, stuffieSize, stuffieColor);
				System.out.println("\nYou added a " + s + ".\n");
				db.addStuffie(s);
				break;
			case 3: // Exit Game
				System.out.println("\nThanks for playing the Stuffie Dispenser Game!");
				choice = false;
				break;
			}
		}
	}
}
