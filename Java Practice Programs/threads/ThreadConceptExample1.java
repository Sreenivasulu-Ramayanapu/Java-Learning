package Java.threads.concept;

public class ThreadConceptExample1 {
	public static void main(String[] args) {
		new Thread1("1st");
		new Thread1("2nd");
		new Thread1("3rd");
		
		 try {  
	         Thread.sleep(8000);  
	     } catch (InterruptedException excetion) {  
	         System.out.println("Inturruption occurs in Main Thread");  
	     }  
	     System.out.println("We are exiting from Main Thread");  
	}
}

class Thread1 implements Runnable {
	
	String threadname;
	Thread thread;
	
	Thread1(String name){
		this.threadname = name;
		thread = new Thread(this,name);
		System.out.println( "A New thread: " + thread+ "is created\n" );  
		thread.start();
	}
	
	@Override
	public void run() {
		 for(int j = 5; j > 0; j--) {  
	            System.out.println(threadname + ": " + j);  
	            try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}  
	        }  
	}
}