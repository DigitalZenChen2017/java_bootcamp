package db;

import java.util.ArrayList;

import business.Stuffie;

public class StuffyDB {
	
	// create ArrayList of Movie objects
	ArrayList<Stuffie> stuffies;
	
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
		int random = (int) (Math.random() * stuffies.size()) + 1; 
//		System.out.println(random);
//		random = stuffies.indexOf(stuffies) - 1;
//		return random;
		if rand
    }

//	public void ArrayList<Stuffie> addStuffie(int id) {
//		this.id = Stuffie
//    	ret;
//    }
//	
