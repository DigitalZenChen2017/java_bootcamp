package ui;

import business.MovieCollection;
import business.Movie;

public class MovieRatingsApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Movie Ratings Application!\n");
		
		
		// create instance of objects
        MovieCollection movies = new MovieCollection();
        
        // add some starting data to make testing easier
        movies.add(new Movie("Wonder Woman", 2017, 4.1));
        movies.add(new Movie("Clash of the Titans", 2010, 2.6));
        movies.add(new Movie("Citizen Kane", 1941, 4.9));

	}

}
