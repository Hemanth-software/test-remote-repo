package com.springproject.one.location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationservice;
	
	
	
	@RequestMapping(value = "/locations")
	
	public List<Location> getAllLocations(){                     // #1
		
		return locationservice.getalllocations();
		
	}
	
	@RequestMapping(value="/locations/{id}")                          // finding particular ID using pathvariable
	public Optional<Location> geteachLocation(@PathVariable String id) {
		
		return locationservice.geteachlocation(id);
	}
	
	@RequestMapping(value="/locations",method = RequestMethod.POST)   // posting or adding new location 
	public void addLocation(@RequestBody Location location) {
		
		locationservice.addLocation(location);
		
	}
	
	@RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
	public void updateLocation(@RequestBody Location location, @PathVariable String id) {   // putting or updating a location
		
		locationservice.updateLocation(location, id);
		
		
	}
	
	
	@RequestMapping(value = "/locations/{id}", method = RequestMethod.DELETE)
	public void deleteLocation(@PathVariable String id) {                            // deleting a location
		                                                              
 		locationservice.deleteLocation(id);                             
	}
	
	
	
}










//@Controller
//public class LocationController {
//	
//	@Autowired
//	private LocationService locationService;
//
//	 @RequestMapping(value = "/locations")
//	 public List<Location> getAllLocations(){                     // #1
//		
//			return locationService.getAllLocations();
//			
//		}
//	 	 
//	 @RequestMapping(value = "/locations/{id}")
//	 public Optional<Location> getLocation(@PathVariable String id) {
//	 	return locationService.getLocation(id);
//	 }	 
//	 
//	 @RequestMapping(value = "/locations/name/{name}")
//	 public List<Location> getLocationByName(@PathVariable String name) {
//	 	return locationService.getLocationsByName(name);
//	 }	
//	 
//	 @RequestMapping(value = "/locations", method=RequestMethod.POST)
//	 public void addLocation(@RequestBody Location location) {
//		 locationService.addLocation(location);
//	 }
//	 
//	 @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
//	 public void updateLocation(@RequestBody Location location,@PathVariable String id ) {
//		 locationService.updateLocation(id, location);
//	 }
//	 
//	 @RequestMapping(value = "/locations/{id}", method = RequestMethod.DELETE)
//	 public void deleteLocation(@PathVariable String id) {
//		 locationService.deleteLocation(id);
//		 	 
//	 }	 
//}




















