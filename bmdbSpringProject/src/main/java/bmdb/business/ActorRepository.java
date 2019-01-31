package bmdb.business;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ActorRepository extends PagingAndSortingRepository<Actor, Integer> { // <Object, Data Type>
	// This will be AUTO IMPLEMENTED by Spring into a Bean called actorRepository
	// CRUD refers Create, Read, Update, Delete
	Actor findByGender(String gender);
}
