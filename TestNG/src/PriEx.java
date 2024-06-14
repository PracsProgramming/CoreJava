import org.testng.annotations.Test;

public class PriEx {
  @Test
  public void A() {
	  System.out.println(1);
  }
  
  @Test (priority= -2)
  public void B() {
	  System.out.println(2);
  }
  
  @Test(priority= 10)
  public void C() {
	  System.out.println(3);
  }
  
  @Test(priority= -1)
  public void D() {
	  System.out.println(4);
  }
  
}
