package ui;

import business.MovieCollection;
import util.Console;

import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieRatingsApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Movie Ratings Application!\n");

		// create instance of objects
		List<Movie> movies = new ArrayList<>();
		MovieCollection movieCollection = new MovieCollection(movies);
		boolean choice = true;

		// add some starting data to make testing easier
		movies.add(new Movie("Wonder Woman", 2017, 4.1));
		movies.add(new Movie("Clash of the Titans", 2010, 2.6));
		movies.add(new Movie("Citizen Kane", 1941, 4.99));

		// while loop
		while (choice == true) {
			displayMenu();
			// prompt user input
			int selection = Console.getIntWithinRange("\nChoose a Menu Option: ", 1, 6);

			// Enter a movie
			if (selection == 1) {
				int movieAdd = Console.getInt("\nHow many movies do you want to enter? ");
				int i;
				for (i = 0; i < movieAdd; i++) {
					System.out.println("\nMovie #" + (i + 1));
					System.out.println("---------");
					String title = Console.getString("\nEnter title: ");
					int year = Console.getInt("Enter year: ");
					double rating = Console.getDouble("Enter rating between 1 and 5 (decimals OK): ");
					movies.add(new Movie(title, year, rating));
					System.out.println(movieCollection);
				}

				// View top rated movies
			} else if (selection == 2) {
				System.out.println("\nTop Rated Movies");
				System.out.println("----------------\n");
				movies.stream().filter(m -> m.getRating() >= 4.0).forEach(m -> System.out.println(m));
			}

			// Enter a movie
			else if (selection == 3) {

			}

			// View all movies
			else if (selection == 4) {
				System.out.println(movieCollection);
			}

			// View ratings
			else if (selection == 5) {

			}

			// Quit application
			else if (selection == 6) {
				choice = false;
			}

		}
		// goodbye message
		System.out.println("\nGoodbye!");

	}

	private static void displayMenu() {
		System.out.println("\n-----------------------");
		System.out.println("What do you want to do?");
		System.out.println("-----------------------");
		System.out.println("1 - Enter a movie");
		System.out.println("2 - View top rated movies");
		System.out.println("3 - View most recent movies");
		System.out.println("4 - View all movies");
		System.out.println("5 - View ratings");
		System.out.println("6 - Quit application");
	}

}
