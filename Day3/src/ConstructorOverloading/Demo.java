package ConstructorOverloading;

public class Demo {
int value1;
int value2;
Demo(){
	 value1 =10;
	 value2 = 20;
	System.out.println("Inside Constructor 1");
}
Demo(int a){
	value1=a;
	System.out.println("Inside constructor 2");	
}
Demo(int a,int b){
	value1 = a;
	value2 = b;
	System.out.println("Inside Constructor 3");
	}
void display() {
	System.out.println("Value1 == "+value1);
	System.out.println("Value2 == "+value2);
}
public static void main(String[] args) {
	Demo obj = new Demo();
	Demo obj1 = new Demo(30);
	Demo obj2 = new Demo(20,30);
	obj.display();
	obj1.display();
	obj2.display();
}
}
