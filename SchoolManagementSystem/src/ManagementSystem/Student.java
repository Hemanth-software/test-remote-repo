package ManagementSystem;

public class Student {

	
	private int id;
	private String name;
	private int grade;
	private int feesPaid = 0;
	private int totalFees = 30000;
	
	
	public Student(int id, String name, int grade) {
		
	
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	public int getGrade() {
		return grade;
	}
	
	
	
	
	public void payFees(int fees) {
		
		feesPaid = feesPaid + fees;
		School.updateTotalMoneyEarned(feesPaid);
		
	}
	
	
	public int getfeesPaid() {
		return feesPaid ;
	}
	
	
	public int remainingFees() {
		
		return totalFees-feesPaid;
	}
	
	
}
