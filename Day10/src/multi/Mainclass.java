package multi;

public class Mainclass {
public static void main(String[] args) {
	SubClass obj = new SubClass();
	obj.getName("Balaji");
	obj.getGender("Male");
	obj.getCity("Bergen");
	obj.getCountry("India");
	obj.display();
}
}
