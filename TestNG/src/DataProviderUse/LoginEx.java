package DataProviderUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginEx {
	public static String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe";
	public static String baseurl = "file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html";
	public static WebDriver driver= null;


 @BeforeSuite
 public void Setup() {
	 System.setProperty("webdriver.chrome.driver",DriverPath);	
	  driver = new ChromeDriver();
	  driver.get(baseurl);
	  
 }
	
 @AfterSuite
 public void teardown() {
	 driver.close();
 }
	
 @AfterMethod
 public void clickLogout() {
	 
	 driver.navigate().refresh();
 }
 
  @Test(dataProviderClass = DataProviderUse.dpEx.class, dataProvider= "LoginData")
  public void LoginTest(String uname, String password , String title) {
	  
	  if (driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText().contains("already"))
		  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	 
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	  
	  Assert.assertEquals(driver.getTitle(), title);
	 
	  if(driver.getTitle().contains("Dashboard"))
		  driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a")).click();
//	  else {
//		  driver.findElement(By.id("email")).clear();
//		  driver.findElement(By.id("password")).clear();
//		  
//	  }
//	 
  }
  
  @Test(dataProviderClass = DataProviderUse.dpEx.class, dataProvider= "AddNewMember")
  public void AddNewMemberTest(String uname,String mobile,String Email,String Password) {

	 
	  if(driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText().contains("new membership"))
		  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	  
	  	  
	  driver.findElement(By.id("name")).sendKeys(uname);
	  driver.findElement(By.id("mobile")).sendKeys(mobile);
	  driver.findElement(By.id("email")).sendKeys(Email);
	  driver.findElement(By.id("password")).sendKeys(Password);
	 
	  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[5]/div/button")).click();
	  
	  	System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		 driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("email")).clear();
		  driver.findElement(By.id("password")).clear();
		  driver.findElement(By.id("mobile")).clear();
	  
  }

  

}
