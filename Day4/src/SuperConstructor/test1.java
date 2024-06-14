package SuperConstructor;

public class test1 {

	void display() {
		this.show();
		System.out.println("Inside display method");
	}
	void show() {
		System.out.println("Inside show method");
	}
	public static void main(String[] args) {
		
		test1 object = new test1();
				object.display();
	}
}
