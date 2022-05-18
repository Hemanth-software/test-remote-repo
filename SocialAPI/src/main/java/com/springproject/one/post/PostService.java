package com.springproject.one.post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.one.location.Location;
import com.springproject.one.student.StudentRepository;
import com.springproject.one.user.User;




@Service
public class PostService {

	@Autowired
	private PostRepository postrepository;
	
	public List<Post> getallposts(){                                  //getall posts
		
		List<Post> posts = new ArrayList<>();
		postrepository.findAll().forEach(posts::add);
		return posts;
	}
	
	
	
	public List<Post> getAllPostsByUserId(String id){
		
		List<Post> posts = new ArrayList<>();
		postrepository.findByUserId(id).forEach(posts::add);
		return posts;
		
	}
	
	
	
	
	
	
	
	
	public Optional<Post> geteachpost(String id) {
		
	
		  return postrepository.findById(id);
	}


	public void addPosts(Post post) {

         postrepository.save(post);
		
		
	}
	
	
	public void updatePost(Post post, String id) {
		
	   postrepository.save(post);
		
		
	}


	public void deletePost(String id) {

 
		postrepository.deleteById(id);
		
		
	}
	
}










//@Service
//public class PostService {
//	
//	@Autowired
//	private PostRepository postRepository;
//	
//	public List<Post> getAllPosts() {
//	   List<Post> posts = new ArrayList<>();
//	   
//	   postRepository.findAll()
//	   .forEach(posts::add);
//	   
//	   return posts;	 
//	}
//	
//	public List<Post> getPostsByUser(String id) {
//	   List<Post> posts = new ArrayList<>();
//	   
//	   postRepository.findByUserId(id)
//	   .forEach(posts::add);
//	   
//	   return posts;	 
//	}
//	
//	   	   
//	public Optional<Post> getPost(String id) {
//		return postRepository.findById(id);
//	}
//
//	public void addPost(Post post) {
//		postRepository.save(post);
//	}
//	
//	public void updatePost(String id, Post post) {
//		postRepository.save(post);
//	}
//	
//	public void deletePost(String id) {
//	     postRepository.deleteById(id);	
//	}	
//}




















