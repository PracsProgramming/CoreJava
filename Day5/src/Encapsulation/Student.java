package Encapsulation;

public class Student {
 private int age;
 private String name;
 
 void setDetails(int a,String n) {
	 //validating data
	 if(a>0) {
	 this.age = a;
	 }
	 else {
		 this.age = 0;
	 }
	 this.name = n;
 }
 
 void getDetails() {
	 System.out.println(age);
	 System.out.println(name);
 }
 
 public static void main(String[] args) {
	Student s = new Student();
	s.setDetails(23, "Kiran");
	s.getDetails();
}
}
