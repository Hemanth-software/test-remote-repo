package multiThreading;

public class multithreadingthing extends Thread {
// we can also use implements Rubbable but we need create a different object in main class and pass the value as an argument
	
	private int threadNumber;
	
	
	
	// to know which threading it is executing from
	public multithreadingthing(int threadNumber) { 
		this.threadNumber = threadNumber;
	}




	@Override
	public void run() {
		
	
		
		for(int i=1; i<=3; i++) {
			System.out.println(i+" from thread "+threadNumber);
			
//			if(threadNumber == 3) {
//				throw new RuntimeException();   // to throw an exception when threadnumber equals to 3
//			}
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
		
		
		
		
	}
	
	
}
