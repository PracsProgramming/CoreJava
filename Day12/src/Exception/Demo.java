package Exception;

public class Demo {
	public static void main(String args[]) {
		try {
			ThrowExample obj = new ThrowExample();
			obj.mymethod(1);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
