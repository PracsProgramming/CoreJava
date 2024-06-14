package StaticFinal;

public class B extends Final{
	 
	 void m1(int a) {
		System.out.println("M1-B");
	}
	
	public static void main(String[] args) {
		B aa = new B();
		System.out.println(aa.a);
		System.out.println(aa.b++);
	aa.m1();
	}

}
