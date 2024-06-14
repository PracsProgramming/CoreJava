package methodOverride;

public class Override {
	
	public static void main(String[] args) {
		DerivedClass der =  new DerivedClass();
		der.method();
		BaseClass base = new BaseClass();
		base.method();
		BaseClass base1 = new DerivedClass();
		base1.method();
	}

}
