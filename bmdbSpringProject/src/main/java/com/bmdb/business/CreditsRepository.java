package com.bmdb.business;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CreditsRepository extends PagingAndSortingRepository<Credits, Integer> { // <Object, Data Type>
	// This will be AUTO IMPLEMENTED by Spring into a Bean called creditsRepository
	// CRUD refers Create, Read, Update, Delete
	List<Credits> findByMovie(Movie movie);
}
