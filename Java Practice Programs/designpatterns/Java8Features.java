package Java.designpatterns;

import java.io.PrintWriter;
import java.io.Serializable;
import java.rmi.Remote;

interface A {
	void show(String test,String test2);
}

interface B{
	void A1();
	void b1();
}

abstract class C{
	
}

public class Java8Features {

	public static void main(String[] args) throws MyOWnException {
		A a = (p1, p2) -> System.out.println("Hey bro its Lambda expression -> " + p1 + "- " + p2);
		a.show("One parameter method", "Two parameter method");

		Test t = new ExecuteTest();
		t.test1("Sreenivas", 29);
		t.testImplementation();
		Test.testStatic();
		
		
		Test t1 = new SampleTest() {};
		t1.test1("Sreenivas", 29);
		
		int  i = 1;
		
		if(i != 0) {
			throw new MyOWnException("Hey Boss its my own exception");
		}
	}
}

class Sample implements B{

	@Override
	public void A1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Test {
	void test1();

	void test1(String name, int age);

	static final String TEST_CONSTANT = "";

	default void testImplementation() {
		
		System.out.println("This Test implementation in Interface");
	}

	static long testStatic() {
		System.out.println("This is test static");
		return 0l;
	}
}


 abstract class SampleTest implements Test{
	
	 @Override
	public void test1() {
		System.out.println("This Implmentation is in Abstract");
		
	}
	 @Override
	public void test1(String name, int age) {
		 System.out.println("name:-> " + name +" :: Age :-> " + age);
		
	}
 }
 
 class ExecuteTest implements Test{

	@Override
	public void test1() {
		System.out.println("1");
	}

	@Override
	public void test1(String name, int age) {
		System.out.println("Name :->" + name +" :: Age :-> " + age);
	}
	 
 }

 
 class Execute{
	 public static void main(String[] args) {
		Test t = new ExecuteTest();
		t.test1("Sreenivas", 29);
		t.testImplementation();
		Test.testStatic();
	}
 }
 
 class MyOWnException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 public MyOWnException(String message) {
		 
		 super("This is my own exceptions");
	 }
	
 }
 
 
 interface SampleInterface extends Serializable,Cloneable,Remote{
 }