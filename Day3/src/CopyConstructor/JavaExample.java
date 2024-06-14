package CopyConstructor;

public class JavaExample {
String Web;
JavaExample(String w){
	Web = w;
}
/* This is the Copy Constructor, it
 * copies the values of one object
 * to the another object (the object
 * that invokes this constructor)*/

JavaExample(JavaExample je){
	Web = je.Web;
}
void display() {
	System.out.println("Website :"+Web);
}
public static void main(String[] args) {
	JavaExample obj = new JavaExample("www.javabykiran.com");
	JavaExample obj2 = new JavaExample(obj);
	obj.display();
	obj2.display();
}
}
