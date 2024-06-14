import org.testng.annotations.Test;

public class DependEx {
	 @Test(priority = -1)
	  public void A() {
		  System.out.println(1);
	  }
	  
	  @Test 
	  public void B() {
		  System.out.println(2);
	  }
	  
	  @Test(dependsOnMethods= {"D"}, priority = -2)
	  public void C() {
		  System.out.println(3);
	  }
	  
	  @Test(dependsOnMethods= {"B"})
	  public void D() {
		  System.out.println(4);
	  }
	  @Test
	  public void AB() {
		  System.out.println(5);
	  }
	  
}
