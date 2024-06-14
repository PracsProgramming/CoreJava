package Encapsulation;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		A aa = new A();
		//System.out.println(aa.a);
		
		Student s = new Student();
		s.setDetails(20, "abcd");
		s.getDetails();
		//Scanner for taking input from console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age1 = sc.nextInt();
		System.out.println("Enter Name");
		String Name2 = sc.next();
		s.setDetails(age1, Name2);
		s.getDetails();
		//validating data
		s.setDetails(-10,"abc");
		s.getDetails();
	}
}
