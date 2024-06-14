package String;

public class Indexof {
public static void main(String[] args) {
	String s1 = "this is index of example";
	int index1 = s1.indexOf('x');
	int index2 = s1.indexOf("index");
	
	System.out.println(index1+" "+index2);
	
	int index3 = s1.indexOf("index", 4);
	System.out.println(index3);
	}
}
