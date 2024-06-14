package Day3;

public class Student {
int id;
String name;
int age;

Student(int i,String n,int a){
	id = i;
	name=n;
	age=a;	
}
void display() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(age);
}
public static void main(String[] args) {
	Student s=new Student(1,"Kiran",23);
	s.display();
	Student s1=new Student(2,"JBK",21);
	s1.display();
	
}
}
