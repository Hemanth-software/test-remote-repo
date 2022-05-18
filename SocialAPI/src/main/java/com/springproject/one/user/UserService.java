package com.springproject.one.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.one.location.Location;







@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;
	                                                               // get all users
	public List<User> getallusers(){
		
        List<User> users = new ArrayList<>();		
		userrepository.findAll().forEach(users::add);                   
		return users;
		
	}
	
	
	public List<User> getUsersByLocationId(String id){
		                                                                      //find all users by location id
		List <User> users = new ArrayList<>();
		userrepository.findByLocationId(id).forEach(users::add);
		
		return users;
		
	}
	
	
	
	
	
	
	
	public Optional<User> getuser(String id){                       // reading a user by id or getting by id
		
		return userrepository.findById(id);
		
	}
	
	
	public void adduser(User user) {
		
        
		userrepository.save(user);                                  // creating a user or adding user
	}
	
	
	
	public void updateuser(User user, String id) {                  // updating a user
		
		userrepository.save(user);
	}
	
	
	public void deleteuser(String id) {
		                                                           // deleting a user by id
		userrepository.deleteById(id);
	}


	public List<User> FindUsersByLocationId(String id) {
		return userrepository.findByLocationId(id);
		
		
		
	}


	public List<User> findUsersByfirstName(String firstname) {
		return userrepository.findByfirstname(firstname);
	}
	

//	public List<User> getUsersByFirstname(String firstname) {
//		return userRepository.findByFirstname(firstname);
	
	
}









//@Service
//public class UserService {
//	
//	@Autowired
//	private UserRepository userRepository;	
//
//	
//	public List<User> getAllUsers() {
//		List<User> users = new ArrayList<>();
//		
//		userRepository.findAll()
//		.forEach(users::add);
//		
//		return users;
//	}
//
//	
//	public List<User> getUsersByLocation(String id) {
//		List<User> users = new ArrayList<>();
//		
//		userRepository.findByLocationId(id)
//		.forEach(users::add);
//		
//		return users;
//	}
//
//	
//	public Optional<User> getUser(String id) {
//		return userRepository.findById(id);
//	}
//
//	
//	public void addUser(User user) {
//		userRepository.save(user);
//	}
//
//	
//	public void updateUser(String id, User user) {
//		userRepository.save(user);
//	}
//
//	
//	public void deleteUser(String id) {
//	     userRepository.deleteById(id);	
//	}
//
//
//	public List<User> getUsersByLocationId(String Id) {
//		return userRepository.findByLocationId(Id);
//	}
//
//
//	public List<User> getUsersByFirstname(String firstname) {
//		return userRepository.findByFirstname(firstname);
//	}
//}


















