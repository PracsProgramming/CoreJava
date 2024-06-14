package InheritedInterface;

public class Test implements Interface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implemented method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implemented method2");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.method1();
		t.method2();
	}
}
