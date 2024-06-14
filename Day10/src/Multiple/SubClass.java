package Multiple;

public class SubClass extends AbstractClass_Ex2 {
	
	int x,y,z;
	void get(int a,int b) {
		x=a;
		y=b;
	}
	void add() {
		z= x+y;
	}
	void display() {
		System.out.println("The addition is :"+z);
	}

}
