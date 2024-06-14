package SuperConstructor;

public class test {
	int a;
	int b;
	test(){
		this(10,20);
		System.out.println("Inside Default Constructor\n");
	}
	test(int a,int b){
		this.a = a;
		this.b = b;	
		System.out.println("Inside Parameterised constructor");
	}
void display() {
	System.out.println("a= "+a+" b= "+b);
}
}
