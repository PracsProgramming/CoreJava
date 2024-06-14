import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class DataProviderWeb {
  @Test(dataProvider = "dp")
  public void f(String un, String p) {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(p);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	  
  }

  @DataProvider
  public Object[][] dp() {
	  Object[][] data = new Object[2][2];
		
		data[0][0] = "kiran@gmail.com";
		data[0][1] = "123456";
		
		data[1][0] = "amol@gmail.com";
		data[1][1] = "123456";
			
		data[2][0] = "abc@gmail.com";
		data[2][1] = "123456234";
		
		return data;
  }
 
}
