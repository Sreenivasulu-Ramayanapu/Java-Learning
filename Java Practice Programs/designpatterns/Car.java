package Java.designpatterns;

import java.util.Calendar;
import java.util.concurrent.locks.ReentrantLock;

public class Car {
	
	private static volatile Car car = null;
			
	private Car() {
		
	}
	
	public static Car getInstance() {
		if(car == null) {
			synchronized (Car.class) {
				if(car == null) {
					car = new Car();
				}
			}
		}
		return car;
	}
	
	public String printStatement() {

		return "This is Working";
	}
	
	public static void main(String[] args) {
		System.out.println(Car.getInstance().printStatement());
		X x = new X();
		x.m();
	}
}

class X {
	   private final ReentrantLock lock = new ReentrantLock();
	   public void m() {
		   System.out.println("1");
	     lock.lock();  // block until condition holds
	     System.out.println("2");
	     try {
	       for(int i=0;i<100;i++) {
	    	   System.out.println("i ->" + i);
	       }
	     } finally {
	       lock.unlock();
	       System.out.println("Un lock");
	     }
	     System.out.println("process completed");
	   }
	 }



