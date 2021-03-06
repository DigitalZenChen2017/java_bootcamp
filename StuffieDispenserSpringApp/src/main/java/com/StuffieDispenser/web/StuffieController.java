package com.StuffieDispenser.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.business.User;
import hello.business.UserRepository;
import hello.util.JsonResponse;

@Controller
@RequestMapping(path = "/users")
public class StuffieController {
	// This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	@Autowired // like static method, no new() required, creating a bean (big POJO)
	private UserRepository userRepository;
//	@GetMapping(path = "/add")
//	public @ResponseBody User addNewUser(@RequestParam String name, @RequestParam String email) {
//		// @ResponseBody means the returned String is the response, not a view name
//		// @RequestParam means it is a parameter from the GET (read) or @RequestBody POST (update and delete)
//		// request
//		User u = new User();
//		u.setName(name);
//		u.setEmail(email);
//		userRepository.save(u);
//		return u;
////		return "User Saved: " + name + ", " + email;
//	}

	// get all users
	@GetMapping("/")
	public @ResponseBody JsonResponse getAllUsers() {
		JsonResponse jr = null; // instantiates JsonResponse object called "jr"
		try {
			jr = JsonResponse.getInstance(userRepository.findAll()); // returns all instance of User type
		} catch (Exception ex) {
			jr = JsonResponse.getInstance(ex);
		}
		return jr;
	}

	// get method using @RequestParam
//	@GetMapping("/get") // @RequestParam - have to add "?id=?"
//	public @ResponseBody Optional<User> getUserById(@RequestParam int id) { // returns the user
////		Optional<User> u = userRepository.findById(id);
//		return getUser(id); // calls path variable get method
//	}

	// get method using path variable
	@GetMapping("/{id}")
	public @ResponseBody JsonResponse getUser(@PathVariable int id) { // returns the user
		JsonResponse jr = null; // instantiates JsonResponse as an object
		try {
			Optional<User> u = userRepository.findById(id);
			if (u.isPresent()) {
				// good call to database - return a valid user
				jr = JsonResponse.getInstance(u); // return user object
			} else {
				jr = JsonResponse.getInstance(new Exception("No User Found for ID: " + id));
			}
		} catch (Exception ex) {
			jr = JsonResponse.getInstance(ex);
		}
		return jr;
	}

	// add a user
	@PostMapping(path = "/")
	public @ResponseBody JsonResponse addNewUser(@RequestBody User u) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET (read) or @RequestBody
		// POST (update and delete)
		// request
//		return u;
//		JsonResponse jr = null;
//		jr = JsonResponse.getInstance(saveUser(u));
		return saveUser(u);
	}

	// update a user - changed from Post to PutMapping
	@PutMapping("/{id}")
	public @ResponseBody JsonResponse updateUser(@PathVariable int id, @RequestBody User u) {
//		u = userRepository.save(u);
		return saveUser(u);
//		return u;
	}

	private @ResponseBody JsonResponse saveUser(User u) {
		JsonResponse jr = null;
		try {
			userRepository.save(u);
			jr = JsonResponse.getInstance(u);
		} catch (DataIntegrityViolationException dive) {
			// TODO better way to handle exceptions
			jr = JsonResponse.getInstance(dive);
			jr.setErrors(dive.getMessage());
		}
		return jr;
	}

	// delete a user
	@DeleteMapping("/{id}")
	public @ResponseBody JsonResponse removeUser(@PathVariable int id) { // remove the user by id
		JsonResponse jr = null;
		Optional<User> u = userRepository.findById(id);
		if (u.isPresent()) {
//		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
//			return "User ID " + id + " was successfully deleted.";
			jr = JsonResponse.getInstance(u);
		} else {
			jr = JsonResponse.getInstance("User ID " + id + " was not successful deleted.");
		}
		return jr;
	}

	// get user by email
	@GetMapping("/getByEmail")
	public @ResponseBody JsonResponse getUserByEmail(@RequestBody User user) { // returns the user
		return JsonResponse.getInstance(userRepository.findByEmail(user.getEmail()));
//		
//		User u = userRepository.findByEmail(user.getEmail());
//		return u;
	}
}
