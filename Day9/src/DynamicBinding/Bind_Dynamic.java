package DynamicBinding;

public class Bind_Dynamic {
	protected String val;
	
	void display(String str) {
		val = "Base Class Function ".concat(str);
		System.out.println(val);
	}

}
