package generics;

import java.util.ArrayList;
import java.util.List;

public class genericsExample {

	public static void main(String[] args) {

//		generics = we can specify refernce type directly in the object by using <> 
		
		
		
		
		Printer<Integer> print1 = new Printer<>(23);
		print1.print();
		
		Printer<Double> print2 = new Printer<>(25.77);
		print2.print();
		
		Printer<String> print3 = new Printer<>("Hello");
	    print3.print();
	    
	    
//     we already use generics for ArrayList , we pass the object directly into the dimond operator
//     before we were Passing Object into diamond operator , with this we need to explicitly cast, with enerics we dont have to
	    	    
	    ArrayList<Cat> cat = new ArrayList<>();
	    cat.add(new Cat());
	    
	    // if we are calling the specific item in the arraylist , we use index
	    Cat newcat = cat.get(0);               // here we dont have to cast , if we use object we have to cast explicitly
		
	    
	    shout("john","Hemanth");
	    shout(57,78);
	    
	    // wild cards execution
	    List<Integer> intList = new ArrayList<>();
	    intList.add(3);
	    printList(intList);
	    
	}

	// generic method , it takes any type of object and it prints it out
	// it can also take two multiple generic type as parameters
	private static <T, V> void shout (T thingtoshout, V otherthingstoshout) {
		
		System.out.println(thingtoshout + "!!!!!!!");
		System.out.println(otherthingstoshout + "!!!!!!!!!!!!!");
		
		
	}
	
	// using wild cars with ?
	// we can also have bound wild cards , refer to the generic video to understand
	public static void printList(List<?> mylist) {
		
		
		System.out.println(mylist);
	}
	
	
	
	
	
	
}
