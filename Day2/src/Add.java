import LetMeCalculate.Calculater;

public class Add {
	
public static int add_int (int x, int y) {
	return x +y;
}

public static void main(String[] args) {
	int z;
	z = add_int(2,4);
	System.out.println(z);
	
	Calculater obj = new Calculater();
	System.out.println(obj.add(100,200));
}
}
