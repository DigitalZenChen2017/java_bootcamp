package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	public List<Movie> movies;

	public MovieCollection(List<Movie> movies) {
		super();
		this.movies = movies;
	}

	public void add(Movie movie) { // add Movie object to internal list
	}

	public List<Movie> filterMovies(Predicate<Movie> condition) {
		List<Movie> filteredMovies = new ArrayList<>();
		for (Movie m : movies) {
			if (condition.test(m)) {
				filteredMovies.add(m);
			}
		}
		return filteredMovies;
	}

	public double getLowestRating() {
		double lowestRating = movies.stream().map(m -> m.getRating()).reduce(5.0, Math::min);
		return lowestRating;
	}

	public double getHighestRating() {
		double highestRating = movies.stream().map(m -> m.getRating()).reduce(0.0, (a, b) -> Math.max(a, b));
		return highestRating;
	}

	public double getAverageRating() {
		double averageRating = movies.stream().mapToDouble(m -> m.getRating()).sum()/movies.size();
		return averageRating;
	}

	public int getSize() { // return number of items in internal list
		return movies.size();
	}

	@Override
	public String toString() {
		return "\nMovieCollection:" + movies;
	}

}
