package SuperConstructor;

public class Student extends Person{
	
	 public void message() {
		System.out.println("This is student class");
	}
	// Note that display() is only in Student class
	 void display()
	 {// will invoke or call current class message() method
	 message();
	// will invoke or call parent class message() method
	 super.message();
	 }
	 
	 Student(){
		 super();
		 System.out.println("Student Class constructor");
	 }
	 
}
