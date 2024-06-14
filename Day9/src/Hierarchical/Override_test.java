package Hierarchical;

public class Override_test {
public static void main(String[] args) {
	Bank b = new Bank();
	System.out.println("Bank Rate of Interest :"+b.getRateOfInterest()+"%");
	Bank b1= new SBI();
	System.out.println("SBI Rate of Interest :"+b1.getRateOfInterest()+"%");
	Bank b2 = new ICICI();
	System.out.println("ICICI Rate of Interest :"+b2.getRateOfInterest()+"%");
	Bank b3 = new Axis();
	System.out.println("Axis Rate of Interest :"+b3.getRateOfInterest()+"%");
	
}
}
