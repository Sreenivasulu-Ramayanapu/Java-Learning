package threads;

public class ThreadImplementation2 {

	public static void main(String[] args) {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
	
		//Annonymous class implementation
		Runnable r1 = () -> {System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());};
		Thread t1 = new Thread(r1,"T1");
		t1.start();
		
		Runnable r2 = () -> {System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());};
		Thread t2 = new Thread(r2,"T1");
		t2.start();
	}
}

