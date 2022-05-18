package multiThreading;

public class MultiThreading {

	public static void main(String[] args) {
		
//		multithreading = we can use to execute the threads simultaneously
//		               = there is no guarantee which thread executes first , it executes randomly 
//		               = they are independent , if somethread goes wrong , it doesn't impact other threads
		
		
		
		

		multithreadingthing mything1 = new multithreadingthing(10);
		multithreadingthing mything2 = new multithreadingthing(10);

		// it starts two threads simultaneously
		mything1.start();
		mything2.start();

		// it doesn't do multithreading , one doesn't start until other completes its thread
		mything1.run();
		mything2.run();
		
		// we can also do combination of both
		mything1.run();
		mything1.start();   // sometimes it doesnt work
		
		
		// we can also use for loop to print 5 threads using object		
		 for(int i=1; i<=3; i++) {
		   multithreadingthing mything3 = new multithreadingthing(i);    
		   mything3.start();	
		   try {
				mything3.join();
			} catch (InterruptedException e) {      // we use this to execute one thread first and other thread waits until 1st completes
				e.printStackTrace();
			}
		  }
		
		// we use this to execute one thread first and other thread waits until 1st completes 
		 
//		  try {
//			mything1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}

}
