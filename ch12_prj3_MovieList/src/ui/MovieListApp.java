package ui;

import java.util.ArrayList;

import business.Movie;
import db.MovieIO;
import util.Console;

public class MovieListApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Movie List Application\n");
		
		// define variables and objects
		String choice = "y";
		Console console = new Console();
		MovieIO mIO = new MovieIO();
		
		// populate Movie List
		
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("1. List All Movies\n" +
							   "2. List Movies By Category\n" +
							   "3. Add Movies\n");
			
			// prompt user input - select from 3 options
			int selection = console.getIntWithinRange("Enter a number option (1-3): ", 1, 3);
			
			switch(selection) {
			case 1:
			// LIST ALL MOVIES
			ArrayList<Movie> allMovies = mIO.getMovies();
			
			// use a foreach loop to obtain all Movies 
			for(Movie m : allMovies) {
				System.out.println(m.getTitle());
			}
			
			System.out.println(); // print blank line
			break;	
			case 2:
			// LIST MOVIES BY CATEGORY
			System.out.println("Categories: Drama | Musical | Scifi | Horror | Comedy | Animated\n");
			String category = console.getString("Enter a Category: ");
			
			ArrayList<Movie> filteredMovies = mIO.getMovies(category);
			for(Movie m : filteredMovies) {
				System.out.println(m.getTitle());
			}	
			
			System.out.println(); // print blank line
			case 3:
			// ADD METHODS TO MOVIEIO	
				
			}
							
//			System.out.println("Choose from " + mIO.getMovies().size() + " Movies!\n");		
		}
		// goodbye message
		System.out.println("Goodbye! :)");
	}

}
