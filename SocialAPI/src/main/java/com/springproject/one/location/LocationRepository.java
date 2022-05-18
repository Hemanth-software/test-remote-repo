package com.springproject.one.location;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location,String> {

//	public List<Location> findByName(String name);

	
	
}


//public interface LocationRepository extends CrudRepository<Location, String> {
//	
//	public List<Location> findByName(String name);
//
//}