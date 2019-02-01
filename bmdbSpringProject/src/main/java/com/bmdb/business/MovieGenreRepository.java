package com.bmdb.business;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieGenreRepository extends PagingAndSortingRepository<MovieGenre, Integer> { // <Object, Data Type>
	// This will be AUTO IMPLEMENTED by Spring into a Bean called genreRepository
	// CRUD refers Create, Read, Update, Delete
	MovieGenre findByGenre(Genre genre);
}
