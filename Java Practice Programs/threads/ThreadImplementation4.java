package threads;

public class ThreadImplementation4 {

	public static void main(String[] args) {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
	
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> "
						+ Thread.currentThread().getId());
			};
		};
		Thread t1 = new Thread(r1,"T1");
		t1.start();
		
		Runnable r2 =  new Runnable() {
			@Override
			public void run() {
				System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> "
						+ Thread.currentThread().getId());
			};
		};
		Thread t2 = new Thread(r2,"T1");
		t2.start();
	}
}

