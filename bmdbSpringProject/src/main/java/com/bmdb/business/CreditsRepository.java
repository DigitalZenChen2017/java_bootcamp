package com.bmdb.business;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CreditsRepository extends PagingAndSortingRepository<Credits, Integer> { // <Object, Data Type>
	// This will be AUTO IMPLEMENTED by Spring into a Bean called actorRepository
	// CRUD refers Create, Read, Update, Delete
	Credits findByMovie(Movie movie);
}
