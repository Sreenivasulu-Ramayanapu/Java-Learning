package threads;

public class ThreadImplementation3 {

	public static void main(String[] args) {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
	
		Employee1 e1 = new Employee1();
		Thread t1 = new Thread(e1,"t1");
		t1.start();
		//t1.setName("t1");
		
		Manager1 m1 = new Manager1();
		Thread t2 = new Thread(m1,"t2");
		t2.start();
		//t2.setName("t2");
		
	}
	
}

class Employee1 implements Runnable {

	@Override
	public void run() {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
	}
}

class Manager1 implements Runnable {

	@Override
	public void run() {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
	}
}