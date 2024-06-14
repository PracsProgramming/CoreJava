package Day3;

public class Demo {
int value1;
int value2;
Demo(){
	value1=10;
	value2=20;
	System.out.println("Inside Constructor");
}
public void display() {
	System.out.println("value1 == "+value1);
	System.out.println("value2 == "+value2);
}
public static void main(String[] args) {
	Demo d1 = new Demo();
	d1.display();
}
}
