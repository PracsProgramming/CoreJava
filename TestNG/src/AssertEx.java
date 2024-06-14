import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class AssertEx {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test
  public void Test1() {
	  softAssert.assertEquals(1, 1);
	  System.out.println(1);
	  softAssert.assertEquals("hi", "hello");
	  System.out.println(2);
	  softAssert.assertEquals(1, 12, "Check");
	  System.out.println(3);
	  //Assert.assertEquals(1, 2,"check");
	  //System.out.println(34);
	  softAssert.assertEquals(true, false, "Check");
	  System.out.println(4);
	  softAssert.assertEquals(false, false, "Check");
	  System.out.println(5);
	  softAssert.assertEquals(1.5, 2.5, "Check");
	  System.out.println(1.2);
	  
	  
	  softAssert.assertAll();
  }
  
	/*
	 * @Test public void Test2() { System.out.println(11); Assert.assertEquals(1,
	 * 3); System.out.println(12); }
	 * 
	 * @Test public void Test3() { Assert.assertTrue(true,"pass"); }
	 * 
	 * @Test public void Test4() { Assert.assertTrue(false,"fail"); }
	 * 
	 * @Test public void Test5() { Assert.assertFalse(true,"fail"); }
	 * 
	 * @Test public void Test6() { Assert.assertFalse(false,"pass"); }
	 */
}
