package Interfac;

public class Tyre  implements ovable,Rollable{
int width;

@Override
public boolean isRollable() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isMovable() {
	// TODO Auto-generated method stub
	return true;
}

public static void main(String[] args) {
	Tyre tr = new Tyre();
	
	System.out.println(tr.isMovable());
	System.out.println(tr.isRollable());
}

}
