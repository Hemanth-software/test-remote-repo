package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tutionbalance;
	private int costofCourse = 600;
	private int id = 1000;
	
	
	
	
	
	
	// Constructor: prompt user to enter student's name and grade year
	
	public Student() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Student's FirstName: ");
		this.firstName = scanner.next();
		System.out.print("Enter Student's LastName: ");
		this.lastName = scanner.next();
		System.out.print(" 1 - freshmen\n 2 - Sophmore\n 3 - Junior\n 4 - Senior\nEnter Student's collegeYear: ");
		this.gradeYear = scanner.nextInt();
		
        setStudentId();		
		

	    	
		
		
		
	}
	
	
	
	
	
	
	// Generate an ID
	
	
	private void setStudentId() {
		
		id++;
		this.studentId = gradeYear +""+ id;
		
		
	}
	
	
	
	
	
	
	
	//  Enroll in course
	
	
	public void courseEnroll() {
		
	do {
		
		System.out.print("Enter courses to entroll(q for quit ): ");
		Scanner scanner2 = new Scanner(System.in);
		String course = scanner2.nextLine();
		
		if (!(course.equals("q") || course.equals("Q"))) {
			
			courses = courses +"\n"+ course;
			tutionbalance = tutionbalance + costofCourse;
			
	     
	}else {
		 
		 System.out.println("Thank you");
		 break;
	}
	
}while(1 != 0);
	


	}
	
	

	
	
	
	// view Balance
	
	public void viewBalance() {
		
		System.out.println("your remaining Balance :"+tutionbalance);
		
	}
	
	
	
	// Pay tution
	
	public void payTution() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the payment: ");
		int payment = scanner.nextInt();
		tutionbalance = tutionbalance - payment;
		System.out.println("Thank you for making a payment of $"+payment);
		System.out.println("your remaining balance is $"+tutionbalance);
		
	}
	
	// show status
	
	@Override
	public String toString() {
		
		return "================================= STATUS======================================="+"\n"+
			   "Name :" + firstName + "" +lastName+ "\n" +
		       "Grade year :"+gradeYear+"\n"+
			   "Student ID :"+studentId+"\n"+	
			   "Course Enrolled :"+courses + "\n"+
			   "Balance :"+tutionbalance;
		       
	}
	
	
	
	
	
}
