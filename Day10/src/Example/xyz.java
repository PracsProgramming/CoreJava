package Example;

public class xyz implements MyInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implemented method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("implemented method2");
	}
	
	public static void main(String[] args) {
		MyInterface obj = new xyz();
		obj.method1();
		obj.method2();
	}

}
