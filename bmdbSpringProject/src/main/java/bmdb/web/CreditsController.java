package bmdb.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bmdb.business.Actor;
import bmdb.business.ActorRepository;
import bmdb.util.JsonResponse;

@Controller
@RequestMapping(path = "/actors")
public class CreditsController {
	// This means to get the bean called actorRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	@Autowired // like static method, no new() required, creating a bean (big POJO)
	private ActorRepository actorRepository;

	// get all actors
	@GetMapping("/")
	public @ResponseBody JsonResponse getAllActors() {
		JsonResponse jr = null; // instantiates JsonResponse object called "jr"
		try {
			jr = JsonResponse.getInstance(actorRepository.findAll()); // returns all instance of Actor type
		} catch (Exception ex) {
			jr = JsonResponse.getInstance(ex);
		}
		return jr;
	}

	// get actors - pagination version
	@GetMapping("")
	public @ResponseBody JsonResponse getActors(@RequestParam int start, @RequestParam int limit) {
		JsonResponse jr = null; // instantiates JsonResponse object called "jr"
		try {
			jr = JsonResponse.getInstance(actorRepository.findAll(PageRequest.of(start, limit))); // returns all
																									// instance
																									// of Actor type
		} catch (Exception ex) {
			jr = JsonResponse.getInstance(ex);
		}
		return jr;
	}

	// get method using @RequestParam
//	@GetMapping("/get") // @RequestParam - have to add "?id=?"
//	public @ResponseBody Optional<Actor> getActorById(@RequestParam int id) { // returns the Actor
////		Optional<Actor> u = actorRepository.findById(id);
//		return getActor(id); // calls path variable get method
//	}

	// get method using path variable
	@GetMapping("/{id}")
	public @ResponseBody JsonResponse getActor(@PathVariable int id) { // returns the Actor
		JsonResponse jr = null; // instantiates JsonResponse as an object
		try {
			Optional<Actor> u = actorRepository.findById(id);
			if (u.isPresent()) {
				// good call to database - return a valid Actor
				jr = JsonResponse.getInstance(u); // return Actor object
			} else {
				jr = JsonResponse.getInstance(new Exception("No Actor Found for ID: " + id));
			}
		} catch (Exception ex) {
			jr = JsonResponse.getInstance(ex);
		}
		return jr;
	}

	// add an actor
	@PostMapping(path = "/")
	public @ResponseBody JsonResponse addNewActor(@RequestBody Actor a) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET (read) or @RequestBody
		// POST (update and delete)
		// request
//		return u;
//		JsonResponse jr = null;
//		jr = JsonResponse.getInstance(saveActor(u));
		return saveActor(a);
	}

	// update an actor - changed from Post to PutMapping
	@PutMapping("/{id}")
	public @ResponseBody JsonResponse updateActor(@PathVariable int id, @RequestBody Actor a) {
//		u = actorRepository.save(u);
		return saveActor(a);
//		return u;
	}

	private @ResponseBody JsonResponse saveActor(Actor a) {
		JsonResponse jr = null;
		try {
			actorRepository.save(a);
			jr = JsonResponse.getInstance(a);
		} catch (DataIntegrityViolationException dive) {
			// TODO better way to handle exceptions
			jr = JsonResponse.getInstance(dive);
			jr.setErrors(dive.getMessage());
		}
		return jr;
	}

	// delete an actor
	@DeleteMapping("/{id}")
	public @ResponseBody JsonResponse removeUser(@PathVariable int id) { // remove the actor by id
		JsonResponse jr = null;
		Optional<Actor> a = actorRepository.findById(id);
		if (a.isPresent()) {
			actorRepository.deleteById(id);
			jr = JsonResponse.getInstance(a);
		} else {
			jr = JsonResponse.getInstance("User ID " + id + " was not successful deleted.");
		}
		return jr;
	}

	// get actor by Gender
	@GetMapping("/getByGender")
	public @ResponseBody JsonResponse getActorByGender(@RequestBody Actor actor) { // returns the user
		return JsonResponse.getInstance(actorRepository.findByGender(actor.getGender()));
	}
}
