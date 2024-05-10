package threads;

public class ThreadImplementation1 {

	public static void main(String[] args) {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
		
		new Employee("T1").start();
		new Employee("T2").start();
	}
}

class Employee extends Thread {
	public Employee(String tName) {
		super(tName);
	}

	@Override
	public void run() {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
		super.run();
	}
}

class Manager extends Thread {
	public Manager(String tName) {
		super(tName);
	}

	@Override
	public void run() {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
		super.run();
	}
}