package ManagementSystem;

public class Teacher {

	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned = 0;
	
	
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public void salaryReceived(int salary) {
		
		salaryEarned = salaryEarned  + salary;
	    School.setTotalMoneySpent(salary);			
		
	}
	
	
	public String toString() {
		
		return "Teachers name is "+name+" and his salary is " +salaryEarned;
		
	}
	
	
	
	
}
