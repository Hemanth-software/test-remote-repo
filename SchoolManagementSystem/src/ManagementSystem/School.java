package ManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class School {



    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private static int totalMoneyEarned = 0;
    private static int totalMoneySpent = 0;
    
    
    
    
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
	}




	public List<Teacher> getTeaches() {
		return teachers;
	}




	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
		
	}




	public List<Student> getStudents() {
		return students;
	}




	public void addStudents(Student student) {
		students.add(student);
	}




	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}




	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned = totalMoneyEarned + moneyEarned;
	}




	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}




	public static void setTotalMoneySpent(int moneySpent) {
		totalMoneyEarned = totalMoneyEarned - moneySpent;
		
	}
		
		
		
		
	

}
