package Java.designpatterns;

class TestSingleton {

	private TestSingleton() {
	}

	private static volatile TestSingleton obj = null;

	public static TestSingleton getInstance() {

		System.out.println("Obj -> " + obj);
		if (obj == null) {
			System.out.println("Obj 1-> " + obj);
			synchronized (TestSingleton.class) {
				System.out.println("Obj 2-> " + obj);
				if (obj == null)
                    obj = new TestSingleton();
			}
		}

		return obj;
	}

	public String printStatement() {

		return "This is Working";
	}

}

public class TestSingleton1{
	public static void main(String[] args) {
		System.out.println(TestSingleton.getInstance().printStatement());
		System.out.println(TestSingleton.getInstance().printStatement());
	}
}