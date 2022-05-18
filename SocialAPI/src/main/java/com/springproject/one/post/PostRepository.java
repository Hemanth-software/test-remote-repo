package com.springproject.one.post;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends CrudRepository<Post, String> {

   public List<Post> findByUserId(String userId);

}


//public interface PostRepository extends CrudRepository<Post, String> {
//	
//	public List<Post> findByUserId(String userId);
//
//}