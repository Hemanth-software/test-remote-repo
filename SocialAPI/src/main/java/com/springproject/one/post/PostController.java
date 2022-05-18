package com.springproject.one.post;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PostController {

	
	@Autowired
	private PostService postservice;
	
	 
		@RequestMapping(value="/posts")
			
		
		public List<Post> getAllPosts(){
			
			return postservice.getallposts();
		}
						
		
		@RequestMapping(value="/posts/{id}")
		public Optional<Post> geteachpost(@PathVariable String id) {
			
			return postservice.geteachpost(id);
		}
		
		@RequestMapping(value="posts", method=RequestMethod.POST)
		public void addPost(@RequestBody Post post) {
			
			postservice.addPosts(post);
			
		}
		
	    @RequestMapping(value="/posts/{id}",method=RequestMethod.PUT)
		public void updatePost(@RequestBody Post post, @PathVariable String id) {
			
			
			postservice.updatePost(post, id);
		}
	
	
	    @RequestMapping(value="/posts/{id}",method=RequestMethod.DELETE)
	    public void deletePost(@PathVariable String id) {
	    	
	    	postservice.deletePost(id);
	    	
	    }
	    
	    
	    
}











//@Controller
//public class PostController {
//		
//	  @Autowired
//	  private PostService postService;
//	
//	  @RequestMapping(value = "/posts")
//	  public String getAllPost() {
//		  //return postService.getAllPosts();
//		  return "posts";
//	  }	  
//	  
//	  @RequestMapping(value = "/posts/{id}")
//	  public Optional<Post> getPost(@PathVariable String id) {
//	      return postService.getPost( id);
//	  }
//	  
//	  
//	  @RequestMapping(value = "/posts", method = RequestMethod.POST)	  
//	  public void addPost(@RequestBody Post post) {
//		  postService.addPost(post);
//	  }
//	  
//	  @RequestMapping(value="/posts/{id}", method = RequestMethod.PUT)
//	  public void updatePost(@PathVariable String id, @RequestBody Post post) {
//
//	        postService.updatePost(id, post);
//
//	  }
//	  
//	  
//	  @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
//	  public void deletePost(@PathVariable String id) {
//	      postService.deletePost(id);
//	  }
//	 
//	  
//	  
//
//}










