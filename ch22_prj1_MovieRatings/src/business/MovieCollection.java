package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	public List<Movie> movie;

	public MovieCollection(List<Movie> movie) {
		super();
		this.movie = movie;
	}

	public void add(Movie movie) { // add Movie object to internal list
	}

	public List<Movie> filterMovies(Predicate<Movie> condition) {
		List<Movie> filteredMovies = new ArrayList<>();
		for (Movie m : filteredMovies) {
			if (condition.test(m)) {
				filteredMovies.add(m);
			}
		}
		return filteredMovies;
	}

	public double getLowestRating() {
		return 0;
	}

	public double getHighestRating() {
		return 0;
	}

	public double getAverageRating() {
		return 0;
	}

	public int getSize() { // return number of items in internal list
		return movie.size();
	}

	@Override
	public String toString() {
		return "\nMovieCollection:" + movie;
	}

}
