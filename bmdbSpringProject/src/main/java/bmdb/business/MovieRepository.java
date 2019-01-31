package bmdb.business;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRepository extends PagingAndSortingRepository<Movie, Integer> { // <Object, Data Type>
	// This will be AUTO IMPLEMENTED by Spring into a Bean called genreRepository
	// CRUD refers Create, Read, Update, Delete
	Movie findByRating(String rating);
}
