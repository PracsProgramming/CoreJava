package DynamicBinding;

public class SubClass extends Bind_Dynamic{
	void display(String str) {
		super.display(str);
		if(val == null) {
			str = "Derived Class Function ".concat(str);
			System.out.println(str);
		}
	}

}
