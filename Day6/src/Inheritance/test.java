package Inheritance;

public class test {
public static void main(String[] args) {
	//example of dynamic dispatch
	B bb = new B();
	System.out.println(bb.a);
	System.out.println(bb.b);
	bb.m1();
	System.out.println("\n");
	
	A aa= new B();
	System.out.println(aa.a);
	System.out.println(aa.b);
	aa.m1();
	System.out.println("\n");
	
	A aa1= new A();
	B bb1 = new B();
	aa1=bb1;
	System.out.println(aa1.a);
	System.out.println(aa1.b);
	aa1.m1();
	System.out.println("\n");
	
	A aa2= new A();
	B bb2 = new B();
	System.out.println(aa2.a);
	System.out.println(aa2.b);
	bb2.m1();
	System.out.println("\n");
	// can not cast child to parent
	/*B bbb = (B) new A();
	System.out.println(bbb.a);
	System.out.println(bbb.b);
	bbb.m1();*/
	
	Car b1 = new Car();
	b1.color = "Blue";
	 b1.speed = 200 ;
	 b1.size = 22;
	 b1.cc = 1000;
	 b1.gears = 5;
	 b1.displaycar();

	
}
}
