package db;

import java.util.ArrayList;

import business.Movie;

public class MovieIO {
	
	public ArrayList<Movie> movies;
	
	public MovieIO() {
		populateMovieList();
	}

    private void populateMovieList() {
        movies = new ArrayList<>();
        movies.add(new Movie("Citizen Kane", "drama"));
        movies.add(new Movie("Casablanca", "drama"));
        movies.add(new Movie("The Godfather", "drama"));
        movies.add(new Movie("Gone With The Wind", "drama"));
        movies.add(new Movie("Lawrence Of Arabia", "drama"));
        movies.add(new Movie("The Wizard Of Oz", "musical"));
        movies.add(new Movie("The Graduate", "drama"));
        movies.add(new Movie("On The Waterfront", "drama"));
        movies.add(new Movie("Schindler's List", "drama"));
        movies.add(new Movie("Singin' In The Rain", "musical"));
        movies.add(new Movie("It's A Wonderful Life", "drama"));
        movies.add(new Movie("Sunset Boulevard", "drama"));
        movies.add(new Movie("The Bridge On The River Kwai", "drama"));
        movies.add(new Movie("Some Like It Hot", "drama"));
        movies.add(new Movie("Star Wars", "scifi"));
        movies.add(new Movie("All About Eve", "drama"));
        movies.add(new Movie("The African Queen", "drama"));
        movies.add(new Movie("Psycho", "horror"));
        movies.add(new Movie("Chinatown", "drama"));
        movies.add(new Movie("One Flew Over The Cuckoo's Nest", "drama"));
        movies.add(new Movie("The Grapes Of Wrath", "drama"));
        movies.add(new Movie("2001: A Space Odyssey", "scifi"));
        movies.add(new Movie("The Maltese Falcon", "drama"));
        movies.add(new Movie("Raging Bull", "drama"));
        movies.add(new Movie("E.T. The extra-terrestrial", "scifi"));
        movies.add(new Movie("Dr. Strangelove", "drama"));
        movies.add(new Movie("Bonnie And Clyde", "drama"));
        movies.add(new Movie("Apocalypse Now", "drama"));
        movies.add(new Movie("Mr. Smith Goes to Washington", "drama"));
        movies.add(new Movie("The Treasure Of The Sierra Madre", "drama"));
        movies.add(new Movie("Annie Hall", "comedy"));
        movies.add(new Movie("The Godfather Part II", "drama"));
        movies.add(new Movie("High Noon", "drama"));
        movies.add(new Movie("To Kill A Mockingbird", "drama"));
        movies.add(new Movie("It Happened One Night", "drama"));
        movies.add(new Movie("Midnight Cowboy", "drama"));
        movies.add(new Movie("The Best Years Of Our Lives", "drama"));
        movies.add(new Movie("Double Indemnity", "drama"));
        movies.add(new Movie("Doctor Zhivago", "drama"));
        movies.add(new Movie("North By Northwest", "drama"));
        movies.add(new Movie("West Side Story", "musical"));
        movies.add(new Movie("Rear Window", "drama"));
        movies.add(new Movie("King Kong", "horror"));
        movies.add(new Movie("The Birth Of A Nation", "drama"));
        movies.add(new Movie("A Streetcar Named Desire", "drama"));
        movies.add(new Movie("A Clockwork Orange", "scifi"));
        movies.add(new Movie("Taxi Driver", "drama"));
        movies.add(new Movie("Jaws", "horror"));
        movies.add(new Movie("Snow White And The Seven Dwarfs", "animated"));
        movies.add(new Movie("Butch Cassidy And The Sundance Kid", "drama"));
        movies.add(new Movie("The Philadelphia Story", "drama"));
        movies.add(new Movie("From Here To Eternity", "drama"));
        movies.add(new Movie("Amadeus", "drama"));
        movies.add(new Movie("All Quiet On The Western Front", "drama"));
        movies.add(new Movie("The Sound Of Music", "musical"));
        movies.add(new Movie("M*A*S*H", "comedy"));
        movies.add(new Movie("The Third Man", "drama"));
        movies.add(new Movie("Fantasia", "animated"));
        movies.add(new Movie("Rebel Without A Cause", "drama"));
        movies.add(new Movie("Raiders Of The Lost Ark", "drama"));
        movies.add(new Movie("Vertigo", "drama"));
        movies.add(new Movie("Tootsie", "comedy"));
        movies.add(new Movie("Stagecoach", "drama"));
        movies.add(new Movie("Close Encounters Of The Third Kind", "scifi"));
        movies.add(new Movie("The Silence Of The Lambs", "horror"));
        movies.add(new Movie("Network", "drama"));
        movies.add(new Movie("The Manchurian Candidate", "drama"));
        movies.add(new Movie("An American In Paris", "drama"));
        movies.add(new Movie("Shane", "drama"));
        movies.add(new Movie("The French Connection", "drama"));
        movies.add(new Movie("Forrest Gump", "drama"));
        movies.add(new Movie("Ben-Hur", "drama"));
        movies.add(new Movie("Wuthering Heights", "drama"));
        movies.add(new Movie("The Gold Rush", "drama"));
        movies.add(new Movie("Dances With Wolves", "drama"));
        movies.add(new Movie("City Lights", "drama"));
        movies.add(new Movie("American Graffiti", "drama"));
        movies.add(new Movie("Rocky", "drama"));
        movies.add(new Movie("The Deer Hunter", "drama"));
        movies.add(new Movie("The Wild Bunch", "drama"));
        movies.add(new Movie("Modern Times", "drama"));
        movies.add(new Movie("Giant", "drama"));
        movies.add(new Movie("Platoon", "drama"));
        movies.add(new Movie("Fargo", "drama"));
        movies.add(new Movie("Duck Soup", "comedy"));
        movies.add(new Movie("Mutiny On The Bounty", "drama"));
        movies.add(new Movie("Frankenstein", "horror"));
        movies.add(new Movie("Easy Rider", "drama"));
        movies.add(new Movie("Patton", "drama"));
        movies.add(new Movie("The Jazz Singer", "drama"));
        movies.add(new Movie("My Fair Lady", "musical"));
        movies.add(new Movie("A Place In The Sun", "drama"));
        movies.add(new Movie("The Apartment", "drama"));
        movies.add(new Movie("Goodfellas", "drama"));
        movies.add(new Movie("Pulp Fiction", "drama"));
        movies.add(new Movie("The Searchers", "drama"));
        movies.add(new Movie("Bringing Up Baby", "drama"));
        movies.add(new Movie("Unforgiven", "drama"));
        movies.add(new Movie("Guess Who's Coming To Dinner", "drama"));
        movies.add(new Movie("Yankee Doodle Dandy", "musical"));
    }
    
    // Return a list of movies that match the input category
    public ArrayList<Movie> getMovies() {
    	return movies;
    }
    
    public ArrayList<Movie> getMovies(String cat) {
    	ArrayList<Movie> filteredMovies = new ArrayList<>();
    	
    	// loop through our list of movies 
    	// if the movie category equals 'cat', add 
    	// the movie to filteredMovies
    	
    	for(Movie m : movies) {
    		if(m.getCategory().equalsIgnoreCase(cat)) {
    			filteredMovies.add(m);
    		}
    	}
    	
    	return filteredMovies;
    }
//    
//    public ArrayList<Movie> addMovies() {
//		
//    }
//    
//    
    
}