package Inheritance;

public class Student {
private int age;
private String name;

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public static void main(String[] args) {
	Student s = new Student();
	s.setAge(23);
	s.setName("abcd");
	
	System.out.println(s.getAge());
	System.out.println(s.getName());
}
}
