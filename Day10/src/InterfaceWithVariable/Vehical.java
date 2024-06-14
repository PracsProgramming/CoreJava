package InterfaceWithVariable;

public class Vehical implements Movable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Average speed is "+Avg_Speed);
	}
	public static void main(String[] args) {
		Vehical vc = new Vehical();
		vc.move();
	}

}
