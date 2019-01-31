package bmdb.business;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GenreRepository extends PagingAndSortingRepository<Genre, Integer> { // <Object, Data Type>
	// This will be AUTO IMPLEMENTED by Spring into a Bean called genreRepository
	// CRUD refers Create, Read, Update, Delete
	Genre findByName(String name);
}
