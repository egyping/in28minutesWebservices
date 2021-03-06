package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserResource {
	
	
	@Autowired
	private UserDaoService service;
	
	
	// get all users method
	@GetMapping("/users")
	public List<User> retreiveAllUsers(){
		return service.findAll();
	}
	
	//Get specific user 
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id){
		return service.findOne(id);
		
	}
	
	// create new user using POST
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		User SavedUser = service.save(user);
	}
	
	
	
	
	

}
