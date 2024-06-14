package Inheritance;

public class B extends A{
	int b = 30;
	int c = 40;
	 void m1() {
		 System.out.println("M2-A");
	 }
	public void methodB() {
		System.out.println("Child class method");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.methodA();
		obj.methodB();
	}
	}

