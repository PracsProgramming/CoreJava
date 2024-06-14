package Exception;

public class Example1 {
@SuppressWarnings("unused")
public static void main(String[] args) {
	int num1,num2;
	
	try {
		num1=0;
		num2=62/num1;
		System.out.println("try block message");
	}catch(ArithmeticException e) {
		System.out.println("Error: Don't divide a number by zero");
	}
	System.out.println("out of try catch block of java");
}
}
