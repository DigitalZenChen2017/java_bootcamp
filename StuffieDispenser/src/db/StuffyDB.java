package db;

import java.util.ArrayList;

import business.Stuffie;
import util.Console;

public class StuffyDB {
	
	// create ArrayList of Stuffie objects
	ArrayList<Stuffie> stuffies;
	
	// define instance variable
	private int stuffieID = 0;
	
	// create Console object
	Console cons = new Console();
	
	// constructor that by default populates list of Stuffy objects
	public StuffyDB() {
		populateStuffies();
	}
	
	public void populateStuffies() {
		stuffies = new ArrayList<>();
		stuffies.add(new Stuffie(1, "Cat", "Small", "Yellow"));
		stuffies.add(new Stuffie(2, "Dog", "Medium", "Black"));
		stuffies.add(new Stuffie(3, "Elephant", "Large", "Gray"));
		stuffies.add(new Stuffie(4, "Giraffe", "Large", "Yellow"));
		stuffies.add(new Stuffie(5, "Koala", "Small", "Gray"));
		stuffies.add(new Stuffie(6, "Cheetah", "Medium", "Yellow"));
		stuffies.add(new Stuffie(7, "Kangaroo", "Large", "Brown"));
		stuffies.add(new Stuffie(8, "Peacock", "Medium", "Green"));
		stuffies.add(new Stuffie(9, "Flamingo", "Small", "Pink"));
		stuffies.add(new Stuffie(10, "Lion", "Large", "Yellow"));
	}
	
	public int grabStuffie() {
		// grab random Stuffie
		if (stuffies.size() > 0) {
		int random = (int) (Math.random() * stuffies.size()) + 1; 
		System.out.println("\nYou grabbed a " + stuffies.get(random - 1) + "!\n");
		stuffies.remove(random - 1);
		}
		else if (stuffies.size() == 0) {
		System.out.println("\nThere are no more stuffies left in the dispenser.\n");	
		}
		return 0;
	}
		
	
	public void addStuffie(Stuffie stuffie) {
		stuffies.add(stuffie);
//		int stuffieID = stuffies.size() + 1;
//		String stuffieType = cons.getString("\nEnter Stuffie Type: ");
//		String stuffieSize = cons.getString("Enter Stuffie Size: ");
//		String stuffieColor = cons.getString("Enter Stuffie Color: ");
//		stuffies.add(new Stuffie(stuffieID, stuffieType, stuffieSize, stuffieColor));
//		System.out.println("\nYou added a " + stuffies.get(stuffieID - 1) + ".\n");
    }
	
	public int getNextStuffieID() {
		stuffieID++;
		return stuffieID;
	}
}


