package Simple;

public class Test extends AbstractClass_Demo {
	public void disp2(){
		System.out.println("I'm overriding abstract method");
		}
		public static void main(String[] args) {
		Test obj = new Test();
		obj.disp2();
		obj.disp1();
		}
}
