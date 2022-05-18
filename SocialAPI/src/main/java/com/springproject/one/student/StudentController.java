package com.springproject.one.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> getallstudents(){                             // get all students
		
		return studentservice.getallstudents();
	}
	
	@RequestMapping(value="/students/{id}")
	public Optional<Student> getstudent(@PathVariable String id) {            // #2
		
		return studentservice.getstudent(id);
		
	}
	
	
	@RequestMapping(value="/students", method=RequestMethod.POST)          //#3
	public void addstudent(@RequestBody Student student) {
		
		studentservice.addstudent(student);
		
	}
	
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.PUT)
	public void updatestudent(@RequestBody Student student,@PathVariable String id) {
		
		studentservice.updatestudent(student, id);
	}
	
	
	@RequestMapping(value="/student/{id}",method=RequestMethod.DELETE)
	public void deletestudent(@PathVariable String id) {
		
		
		studentservice.deletestudent(id);
	}
	
	
}












//@RestController
//public class StudentController {
//	
//	@Autowired
//	private StudentService studentService;
//	
//	@RequestMapping(value = "/students", method = RequestMethod.GET)
//	public List<Student> getAllStudents(){
//		
//		return studentService.getAllStudents();
//	}
//	
//	 
//	 @RequestMapping(value = "/students/{id}")
//	 public Optional<Student> getStudent(@PathVariable String id) {
//	 	return studentService.getStudent(id);
//	 }
//	
//	 @RequestMapping(value = "/students", method=RequestMethod.POST)
//	 public void addStudent(@RequestBody Student student) {
//		 studentService.addStudent(student);
//	 }
//	 
//	 @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
//	 public void updateStudent(@RequestBody Student student,@PathVariable String id ) {
//		 studentService.updateStudent(id, student);
//	 }
//	 
//	 @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
//	 public void deleteStudent(@PathVariable String id) {
//		 studentService.deleteStudent(id);
//		 	 
//	 }
//	 
//	 
//	 
//}




