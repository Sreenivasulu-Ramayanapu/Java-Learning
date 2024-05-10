package threads;

public class ThreadImplementation5 {

	public static void main(String[] args) {
		System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
	
		//Annonymous class implementation
		Runnable r1 = () -> {
			for(int i=0;i<10;i++) {
				System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
			}
		};
		
		Runnable r2 = () -> {
			for(int i=0;i<10;i++) {
				System.out.println("TName >> " + Thread.currentThread().getName() + " >> TId >> " + Thread.currentThread().getId());
			}
		};

		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2,"T2");

		
		try {
			t1.start();
			//t1.join();
			//t1.sleep(10000);
			t2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

