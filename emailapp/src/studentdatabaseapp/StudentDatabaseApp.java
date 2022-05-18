package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
//
//		Student student1 = new Student();
//        student1.courseEnroll();
//        student1.viewBalance();
//        student1.payTution();
//        System.out.println(student1.toString());
		
		// Ask how many users you want to add
		
		System.out.print("How many students you want to Enroll : ");
		Scanner scanner = new Scanner(System.in);
		int totalStudents = scanner.nextInt();
		Student[] students = new Student[totalStudents];
		
		for(int i=0; i<totalStudents; i++) {
			students[i]= new Student();
	        students[i].courseEnroll();
	        students[i].viewBalance();
	        students[i].payTution();
				
		}
        
        
        for(int i=0; i<totalStudents; i++) {
	        System.out.println(students[i].toString());

        }
        
		
		// Create n number of new students
		
	}
	
	
	
}
