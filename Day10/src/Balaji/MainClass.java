package Balaji;



public class MainClass extends AbstClass {

	String name;
	
	 void getVal(String name) {
		this.name = name;
	}
	
	void display() {
		System.out.println("Hello"+name);
	}
}
