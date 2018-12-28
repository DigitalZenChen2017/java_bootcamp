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
		
		while(choice == true) {
			// Display Menu
			System.out.println("MENU:\n" +
							   "1. Grab Stuffie\n"+
							   "2. Add Stuffie\n"+
							   "3. Exit\n");
			
			// Prompt User Input
			int selection = c.getIntWithinRange("Select From 3 Options: ", 1, 3);
			
			// 3 Options
			switch(selection) {
			case 1: // Grab Stuffie
			db.grabStuffie(); 
			break;	
			case 2: // Add Stuffie				
			db.addStuffie();
				
			break;
			case 3: // Exit Game 
			System.out.println("\nThanks for playing the Stuffie Dispenser Game!");	
			choice = false;	
			break;	
			}
		}
		
	}

}
