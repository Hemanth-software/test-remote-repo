package ManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		
		Teacher hemanth = new Teacher(1,"Hemanth",20000);
		Teacher Sindhu = new Teacher(1,"Sindhu",10000);
		Teacher Usha = new Teacher(1,"Usha",5000);
		List<Teacher>  teachersList = new ArrayList<>();
		teachersList.add(hemanth);
		teachersList.add(Sindhu);
        teachersList.add(Usha);		
		
		
		
		
		
		
		Student Ajay = new Student(100,"Ajay",10);
		Student Dinesh = new Student(100,"Dinesh",10);
		Student Shiva = new Student(100,"Shive",10);
		List <Student> studentsList = new ArrayList<>();
		studentsList.add(Ajay);
		studentsList.add(Dinesh);
		studentsList.add(Shiva);


		
		
		School school = new School(teachersList,studentsList);
		Ajay.payFees(5000);
		Dinesh.payFees(25000);
		Shiva.payFees(30000);
		System.out.println(school.getTotalMoneyEarned());
		
		
		
		hemanth.salaryReceived(hemanth.getSalary());
		Sindhu.salaryReceived(Sindhu.getSalary());
		System.out.println("School has spent salary to "+hemanth.getName()+", "+Sindhu.getName()+", now has $"+school.getTotalMoneyEarned());
        

       System.out.println();
       
       System.out.println(hemanth);

		
		
		
		
	}

}
