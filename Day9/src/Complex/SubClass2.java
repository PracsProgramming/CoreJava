package Complex;

public class SubClass2 extends SubClass1 {
	void display() {
		super.display();
		text = "SubClass2's";
		System.out.println(text+"function called");
	}

}
