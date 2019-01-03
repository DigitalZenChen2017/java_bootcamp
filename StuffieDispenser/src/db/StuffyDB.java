package db;

import java.util.ArrayList;

import business.Stuffie;
import util.Console;

public class StuffyDB {
	
	// create ArrayList of Stuffie objects
	ArrayList<Stuffie> stuffies;
	
	// define instance variables
	private int stuffieID = 10;
	
	
	// create Console object
	Console cons = new Console();
	
	
	// constructor with one parameter of # of stuffie objects and assigns unique ID for each one
//	public StuffyDB(int n) {
//		for (int i = 1; i <= n; i++) {
//			int id = getNextStuffieID();
//			Stuffie s = new Stuffie(id);
//			addStuffie(s);
//		}
//	}
	
	// constructor that by default populates list of Stuffy objects
	public StuffyDB() {
		populateStuffies();
	}
	
	private void populateStuffies() {
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
	
	public Stuffie grabStuffie(int id) {
		for(Stuffie stuffie : stuffies) {
			if (stuffie.getId() == id) {
				stuffies.remove(stuffie);
				return stuffie;
			}
		}
		return null;
	}
//		if (stuffies.size() > 0) {
//		int random = (int) (Math.random() * stuffies.size()) + 1; 
//		System.out.println("\nYou grabbed a " + stuffies.get(random - 1) + "!\n");
//		stuffies.remove(random - 1);
//		}
//		else if (stuffies.size() == 0) {
//		System.out.println("\nThere are no more stuffies left in the dispenser.\n");	
//		}
//		return 0;
	
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
	
	public int getDBSize() {
		int maxStuffie = 0;
		for(Stuffie stuffie : stuffies) {
			if (stuffie.getId() > maxStuffie) {
				maxStuffie = stuffie.getId();
			}
		}
		return maxStuffie;
	}
	
	// Review boolean method
	public boolean checkForStuffy(int id) {
		for (Stuffie stuffy : stuffies) {
			if (stuffy.stuffyExists(id) == true)
				return true;
		}
		return false;
	}
	
}


