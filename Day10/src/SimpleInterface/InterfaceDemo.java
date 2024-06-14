package SimpleInterface;

public class InterfaceDemo implements InterfaceA,InterfaceB{

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance example using interfaces");
	}
	
	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		id.myMethod();
	}

}
