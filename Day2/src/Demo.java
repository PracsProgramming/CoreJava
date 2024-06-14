
public class Demo {
int a =10;
int b =30;
int m1() {
	int a =20;
	System.out.println("hello");
	return a;
}
void m2(int a) {
	int res = m1();
	System.out.println(res+","+a);
}
void m3() {
	m2(29);
	System.out.println("M3");
}
public static void main(String[] args) {
	Demo d = new Demo();
	d.m3();
	//System.out.println("*");
	
}
}
