package com.StuffieDispenser.business;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface StuffieRepository extends PagingAndSortingRepository<Stuffie, Integer> { // <Object, Data Type>
	// This will be AUTO IMPLEMENTED by Spring into a Bean called stuffieRepository
	// CRUD refers Create, Read, Update, Delete
	Stuffie findByName(String name);
}
