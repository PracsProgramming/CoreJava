package Inheritance;

public class C{
public static void main(String[] args) {
	int a = 10;// 2 byte
	long l = 67;// 8 byte
	a = (int) l;
	System.out.println(a);
}
}
