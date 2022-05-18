package exceptionHandling;

public class tryCatch {

	public static void main(String[] args) {

  //   try and catch = it tries for the code , when it is invalid then it catches and excutes whats in the catch
  //    video link  = https://www.youtube.com/watch?v=1XAfapkBQjk	
		
		
		
		try {
			getInt();


		}catch(Exception e) {                                                   // we can also use two exceptions by using | , refer to the video for more details                                 
			System.out.println("Hi bro, you cant change integer to string");    
		
			
		}	finally {
			System.out.println("I am the king");    // it alaways executes whether there is an exception error or not
			
		}
			
	}	
			
		public static void getInt() {
		
		int myint1 = Integer.parseInt("Pants");
		System.out.println(myint1);
		}
		

		
		
	}


