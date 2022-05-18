package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class arrayList {

	public static void main(String[] args) {

		
		//ArrayList = it can't hold primitive data types ,it holds objects and wrapper types for primities like Integer etc
		
		
		// if we dont know the values in the ArrayList
		List<String> fruits = new ArrayList<>();     
		
		// Adding items to ArrayList
		fruits.add("mangoes");
		fruits.add("grapes");
		fruits.add("bananas");
		
		//Print the items in ArrayList
		System.out.println(fruits);
		
		
		// if we know the values in arrayList
		List<String> cars = new ArrayList<>(Arrays.asList("BMW","CIVIC","AUDI"));  
		System.out.println(cars);
		
		
		
		//to get each item from ArrayList , we need give index as value
		System.out.println(cars.get(0));
		
		// to get the size of the ArrayList
		System.out.println(cars.size());
		
		// to set an element or replacing an element
		cars.set(0, "SwiftDzire");
		System.out.println(cars.get(0));
		
		// to remove an element 
		
		cars.remove(0);
		System.out.println(cars);
		
		
		
		
		
	}

}
