package ui;

import db.StuffyDB;
import util.Console;

public class StuffieDispenserApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Stuffy Dispenser Application!\n");
		
		// define variables and objects
		boolean choice = true;
		Console c = new Console();
		StuffyDB db = new StuffyDB();
		
		// populate Stuffie Database
		db.populateStuffies();
		stuffieSize = 
				
		while(choice = true) {
			// Display Menu
			System.out.println("MENU:\n" +
							   "1. Grab Stuffie\n"+
							   "2. Add Stuffie\n"+
							   "3. Exit\n\n");
			
			// Prompt User Input
			int selection = c.getIntWithinRange("Select From 3 Options: \n", 1, 3);
			
			// 3 Options
			switch(selection) {
			case 1: // Grab Stuffie
			db.generateRandomIntWithinRange(min, max)
				
			break;	
			case 2: // Add Stuffie
				
			break;
			case 3: // Exit Game 
			System.out.println("Thanks for playing the Stuffie Dispenser Game!");	
			choice = false;	
			break;	
			}
		}
		
	}

}
