package SuperConstructor;

public class Car extends Vehicle{
	int maxSpeed = 170;
	void display()
	{/* print maxSpeed of base class (vehicle) */
	 System.out.println("Maximum Speed: " + super.maxSpeed);
	 }
}
