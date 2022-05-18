package com.springproject.one.user;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.one.location.Location;






@RestController
public class UserController {

	@Autowired
	private UserService userservice;
	
//	@Cacheable("Users")
	@RequestMapping(value="/users")                      // getting all users
	public List<User> getAllUsers(){
		
		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Calling service to get products data");
		return userservice.getallusers();
	}
	






	@RequestMapping(value="/users/{id}")
	public Optional<User> geteachuser(@PathVariable String id) {             // finding user by id
		
		return userservice.getuser(id);
	}
	
	
	
//	@CacheEvict(value="Users", allEntries=true)
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public void userAdded(@RequestBody User user) {                             // creating a user or adding user
		
		userservice.adduser(user);
	}
	
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
	public void userUpdated(@RequestBody User user,@PathVariable String id) {     // updating user by id
		
		userservice.updateuser(user, id);
	}
	
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
	public void userDelete(@PathVariable String id) {                            // deleting user by id
		                                                
		
		userservice.deleteuser(id);                                        
	}
	
	
	@RequestMapping(value="/users/locations/{id}")
	public List<User> findUserByLocationId(@PathVariable String id) {
		
		return userservice.FindUsersByLocationId(id);
		
		
	}
	
	
	
	@RequestMapping(value="/users/firstname/{firstname}")
	public List<User> finduserByFirstName(@PathVariable String firstname){
		
		
		return userservice.findUsersByfirstName(firstname);
		
	}
	
//	 @RequestMapping(value="/users/firstname/{firstname}")
//		public List<User> getUsersByFirstname(@PathVariable String firstname) {
//			return userService.getUsersByFirstname(firstname);
//		}
	
	
	
}









//@RestController
//public class UserController {
//	
//	@Autowired
//	private UserService userService;
//
//	@RequestMapping(value="/users")
//	public List<User> getAllUsers(){
//		return userService.getAllUsers();
//	}
//	
//	@RequestMapping(value="/users/{id}")
//	public Optional<User> getUser(@PathVariable String id) {
//		return userService.getUser(id);
//	}
//	
//	@RequestMapping(value="/users", method = RequestMethod.POST)	
//	public void addUser(@RequestBody User user) {
//		userService.addUser(user);
//	}
//	
//	
//	@RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
//	public void updateUser(@PathVariable String id, @RequestBody User user) {
//
//	    userService.updateUser(id, user);
//
//	}
//	
//	 @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
//	 public void deleteUser(@PathVariable String id) {
//	      userService.deleteUser(id);
//	 }
//	 
//	 @RequestMapping(value="/users/location/{Id}")
//		public List<User> getUsersByLocationId(@PathVariable String Id) {
//			return userService.getUsersByLocationId(Id);
//	 }
//	 
//	 @RequestMapping(value="/users/firstname/{firstname}")
//		public List<User> getUsersByFirstname(@PathVariable String firstname) {
//			return userService.getUsersByFirstname(firstname);
//		}
//
//
//}




















