package ui;

import util.Console;
import java.util.ArrayList;

public class WizardInventoryApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("The Wizard Inventory Game");
	
		boolean cont = false;
		
		// create object
		Console c = new Console();
		
		// create ArrayList and set Wizard default 3 items
		ArrayList<String> items = new ArrayList<String>();
		items.add("Holy Staff");
		items.add("Vivi's Wizard Hat");
		items.add("Moon Boots");
		
		int itemSize = items.size();
		int itemMax = 4;
		
		while (cont != true) {
			// display COMMAND MENU
		System.out.println(); // print blank line	
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items" +"\n"+
						   "grab - Grab an item" + "\n"+
						   "edit - Edit an item" + "\n"+
						   "drop - Drop an item" + "\n"+
						   "exit - Exit program");
		
		// prompt user input - COMMAND:
		System.out.println();
		String command = c.getString("Command: ");
		
		switch(command.toLowerCase()) {
		case "show": // DISPLAYS all items in Wizard's inventory
		// foreach loop
		System.out.println();
		for(String item : items) {	
			System.out.print(items.indexOf(item)+ 1 + ". ");
			System.out.println(item);
		}
		break;	
		case "grab": // ADDS additional items but cannot exceed 4 items!
			
		if (itemSize == itemMax) {	
		System.out.println("You can't carry any more items. Drop something first.");
		}
		else { 
		String grabbedItem = c.getString("Name: ");
		items.add(grabbedItem);
		System.out.println(grabbedItem + " was added.");
		itemSize++;
			}		
		break;	
		case "edit": // CHANGES current item from list
			
		int editPosition = c.getIntWithinRange("Number: ", 0, itemSize);
		int indexEditPosition = editPosition - 1;
		String updatedName = c.getString("Updated name: ");
		
		// set updatedName at index position 
		items.set(indexEditPosition, updatedName);
		
		System.out.println("Item number " + editPosition + " was updated.");
		
		break;	
		case "drop": // REMOVES specific item number from list
			
		int dropPosition = c.getIntWithinRange("Number: ", 0, itemSize);
		int indexDropPosition = dropPosition - 1;
		System.out.println(items.get(indexDropPosition) + " was dropped.");
		items.remove(indexDropPosition);
		itemSize--;
	
		break;
		case "exit": // TERMINATES program
		cont = true;
		break;
		}
	}
		// goodbye message
		System.out.println("Goodbye!");
		
	}

}
