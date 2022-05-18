package lamdaExpressions;

public class Lamdas {

	public static void main(String[] args) {

		cat mycat = new cat();
//		mycat.print();
		
		Printable lamdaPrintable =  (P,S)-> System.out.println("Meow"+S+P);
		printThing(lamdaPrintable);
					
				
				
				
				
	}

	
	public static void printThing(Printable thing) {
		thing.print("!","@");
	}
	
	
}
