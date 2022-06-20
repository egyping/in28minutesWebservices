package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	// counter to start ID after the initial users
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Fahd", new Date()));
		users.add(new User(2, "Yassin", new Date()));
		users.add(new User(3, "Yahya", new Date()));
	}
	
	// Method to return all users 
	public List<User> findAll(){
		return users;
	}
	
	
	// Method to add new user to the Array
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	// Find user 
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
}
