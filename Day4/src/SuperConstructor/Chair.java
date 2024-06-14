package SuperConstructor;

public class Chair extends Furniture{

	String color="black";
	void printColor(){
	System.out.println(color);//prints color of Chair class
	System.out.println(super.color);//prints color of	Furniture class
	}
	
	void color(){
		System.out.println(" Chair color...");
		}
		void height()
		{
		System.out.println(" 5 ft ...");
		}
		void work()
		{
			 super.color();
			 height();
			}

		Chair(){
			super();
			System.out.println("Chair class Constructor");
			}

	}
	

