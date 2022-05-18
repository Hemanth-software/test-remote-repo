package collections;

public class Arrays {

	public static void main(String[] args) {

		
		// Arrays = arrays can hold primitives or objects basically everything
		//        = we can add extra elements to an array , size is fixed
		//        = we can't remove elements due to fixed size
		//        = we cant print easily , we need to itterate through an array to print
		
		
		
		
		String[] fruits = new String[3];            // we can give size when we don't know the values
		String[] bikes = {"yamaha","honda","duke"}; // we can give values in the array if we know them
		
		// to add items to an array that we didn't give values yet
		fruits[0] = "grapes";
		fruits[1] = "apples";
		fruits[2] = "banana";
		
	
		
		// to print items in the array
		for(int i=0; i<fruits.length; i++) {
		System.out.println(fruits[i]);
		
		}
		
		for(int i=0; i<bikes.length; i++) {
			System.out.println(bikes[i]);
		}
		
		
		// to get each item from array
		
		System.out.println(fruits[0]);
		
		
		// to get the size of the array
		
		System.out.println(fruits.length);
		
		
		// setting an element or replacing an element
		fruits[0] = "cranberries";
		System.out.println(fruits[0]);
		
		
		
		
		
	}

}
