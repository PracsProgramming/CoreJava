
public class Method_Ex1 {
	int x=10,y=20;
	float z;
	void add() {
		z = x +y;
		display(z);
	}
	void sub() {
		z = x-y;
		display(z);
	}
	void multi() {
		z = x*y;
		display(z);
	}
	void div() {
		z = x/y;
		display(z);
	}
	private void display(float ans) {
		System.out.println(ans);
	}
}
