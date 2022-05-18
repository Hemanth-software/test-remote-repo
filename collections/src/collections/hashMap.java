package collections;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		
		
		//hashmap = it is useful for key = value pairs or (relationships)
		//          = it only works with java classes and reference types like String, Integer, Bollen, Long etc (java wrapper classes)

     HashMap<String,Integer> employeeId = new HashMap<>();
     
     employeeId.put("Hemanth", 12345);
     employeeId.put("Sindhu", 198765);
     employeeId.put("Usha", 456328);
     System.out.println(employeeId);
		
     
     
     // to get the value by passing the key
     System.out.println(employeeId.get("Hemanth"));
     
     // to see the particular key is present   
    System.out.println(employeeId.containsKey("Sindhu"));
    
    // to see if the value is present in the mapping
    System.out.println(employeeId.containsValue(56345));
     
    // to override the value 
    employeeId.put("Hemanth", 54321);
    System.out.println(employeeId);
    
    // to replace the value , it only replaces if the key is present , if not present it doesn't do anything 
    employeeId.replace("Sindhu", 3456);
    System.out.println(employeeId);
    
    // to add if the key is absent, it doesnt add if its present in mapping
    employeeId.putIfAbsent("Narsingarao", 453675);
    System.out.println(employeeId);
    
    // to remove the key and value from mapping
    employeeId.remove("Narsingarao");
    System.out.println(employeeId);
		
	}

}
