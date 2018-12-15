package db;

import java.util.ArrayList;

import business.Stuffie;

public class StuffyDB {
	
	// create ArrayList of Movie objects
	ArrayList<Stuffie> stuffies;
	
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
	
	public ArrayList<Stuffie> grabStuffie(int id) {
		// choose random object
		
    	return stuffies;
    }
	
//	public void ArrayList<Stuffie> addStuffie(int id) {
//		this.id = Stuffie
//    	ret;
//    }
//	
	public int generateRandomIntWithinRange(Stuffie min, Stuffie max) {
		int stuffieSize = stuffies.size();
		return (int) (Math.random() * stuffieSize + 1);
	}
}
