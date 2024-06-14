import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;


public class testng1st {

	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod");
	  }


	 
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterClass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("beforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("afterTest");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("beforeSuite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("afterSuite");
	  }
	  
	  @Test
	  public void Test() {
		  System.out.println("Test");
		  assertEquals(1, 1);
	  }
	  
	  @Test
	  public void Test1() {
		  System.out.println("Test1");
		  assertEquals(0, 1);
	  }

}
