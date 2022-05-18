package com.springproject.one.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	public List<Student> getallstudents(){
		                                                            // get all students
		List<Student> students = new ArrayList<>();
		
		studentrepository.findAll().forEach(students::add);
		
		return students;
		
		
	}
	
	
	public void addstudent(Student student) {                // Creating a student or save a student
		studentrepository.save(student);                           // #3
	}
	
	public Optional<Student> getstudent(String id) {                      // Reading a student using id or find by id
		                                                                  // #2
		return studentrepository.findById(id);
	}
	
	public void updatestudent(Student student,String id) {              // Updating a student
		
 		studentrepository.save(student);
		
	}
	                                                                      // delete a student
	public void deletestudent(String id) {
		studentrepository.deleteById(id);
	}
}













//@Service
//public class StudentService {
//	
//	@Autowired
//	private StudentRepository studentRepository;
//	
//	public List<Student> getAllStudents() {
//		
//		List<Student> students  = new ArrayList<>();
//		
//		studentRepository.findAll()
//		.forEach(students::add);
//		
//		return students;
//		
//	}
//	
//	public void addStudent(Student student) {
//	     studentRepository.save(student);
//	}
//	
//	
//	public Optional<Student> getStudent(String id) {
//	     return studentRepository.findById(id);
//	}
//	
//	
//	public void updateStudent(String id, Student student) {
//	     studentRepository.save(student);
//	}
//	
//	public void deleteStudent(String id) {
//	     studentRepository.deleteById(id);
//	}
//}




















    


