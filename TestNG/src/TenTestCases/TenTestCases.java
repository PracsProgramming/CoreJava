package TenTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TenTestCases {
	
	public static String baseurl = "file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html";
	public static WebDriver driver ;
	public static String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe";
	
	@BeforeTest
    public void launchBrowser() {
        System.out.println("launching chrome browser"); 
        System.setProperty("webdriver.chrome.driver",DriverPath);
        driver = new ChromeDriver();
        driver.get(baseurl);
    }
	
	  @AfterTest
	    public void terminateBrowser(){
	        driver.close();
	    }
	  
    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "JavaByKiran | Log in";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
   }
    
    @Test
    public void verifyHomepageImage() {
        String expectedvalue = "img";
        WebElement HomepageImage = driver.findElement(By.xpath("/html/body/div/center/img"));
        String actualvalue = HomepageImage.getTagName();
        Assert.assertEquals(actualvalue, expectedvalue);
   }

//    @Test
//    public void verifyLoginLogo() {
//        String expectedvalue = "Java By Kiran";
//        WebElement LoginLogo = driver.findElement(By.xpath("/html/body/div/div[1]"));
//        String actualvalue = LoginLogo.getText();
//        Assert.assertEquals(actualvalue.contains(expectedvalue),"True");
//   }

//    @Test
//    public void verifyLoginEditBox() {
//        String expectedvalue = "";
//        WebElement LoginEditBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        String actualvalue = LoginEditBox.getText();
//        Assert.assertEquals(actualvalue, expectedvalue);
//   }
//    
//    @Test
//    public void verifyPasswordEditBox() {
//        String expectedvalue = "";
//        WebElement PasswordEditBox = driver.findElement(By.id("password"));
//        String actualvalue = PasswordEditBox.getText();
//        Assert.assertEquals(actualvalue, expectedvalue);
//   }
//    
//    @Test
//    public void verifySubmitButton() {
//        String expectedvalue = "Sign In";
//        WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
//        String actualvalue = SubmitButton.getText();
//        Assert.assertEquals(actualvalue, expectedvalue);
//   }
//    
//    @Test
//    public void verifyLoginName() {
//    	SoftAssert softAssert = new SoftAssert();
//    	
//        String expectedEmail = "kiran@gmail.com";
//       
//        WebElement LoginEditBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//        LoginEditBox.sendKeys("kiran@gmail.com");
//        //123456
//        WebElement PasswordEditBox = driver.findElement(By.id("password"));
//        PasswordEditBox.sendKeys("123456");
//        String actualEmail = LoginEditBox.getText();
//        softAssert.assertEquals(actualEmail, expectedEmail);
//        
//        WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
//        SubmitButton.click();
//   }
    
    @Test
    public void verifyLogin() {  
       
    	  WebElement LoginEditBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        LoginEditBox.clear();
        LoginEditBox.sendKeys("kiran@gmail.com");       
        WebElement PasswordEditBox = driver.findElement(By.id("password"));
       PasswordEditBox.clear();
        PasswordEditBox.sendKeys("123456");  
        WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
        SubmitButton.click();
        
        String expectedvalue = "Dashboard Courses Offered";
       WebElement Dashboard = driver.findElement(By.xpath("html/body/div/div[1]/section[1]/h1"));
        String actualvalue = Dashboard.getText();
        
       Assert.assertEquals(actualvalue, expectedvalue); 	        
        
   }
    
    
    @Test
    public void verifySelenium() {
    	
    	String expectedvalue = "Selenium";
    	WebElement Selenium = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3"));
    	String actualvalue = Selenium.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
    
    @Test
    public void verifyJavaJ2EE() {
    	
    	String expectedvalue = "Java / J2EE";
    	WebElement JAVAJ2EE = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3"));
    	String actualvalue = JAVAJ2EE.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
    
    @Test
    public void verifyPython() {
    	
    	String expectedvalue = "Python";
    	WebElement Python = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3"));
    	String actualvalue = Python.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
    
    @Test
    public void verifyphp() {
    	
    	String expectedvalue = "Php";
    	WebElement PHP = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3"));
    	String actualvalue = PHP.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
    
    @Test
    public void verifyusertab() {
    	///html/body/div[1]/aside/section/ul/li[3]/a/span
    	String expectedvalue = "Users";
    	WebElement User = driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[3]/a/span"));
    	String actualvalue = User.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
   
    @Test
    public void verifyOperatorstab() {
    	
    	String expectedvalue = "Operators";
    	WebElement Operators = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a/span"));
    	String actualvalue = Operators.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
    
    @Test
    public void verifyusefullinksstab() {

    	String expectedvalue = "Useful Links";
    	WebElement usefullinks = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[5]/a/span"));
    	String actualvalue = usefullinks.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
    
    @Test
    public void verifydownloadsstab() {

    	String expectedvalue = "Downloads";
    	WebElement downloads = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[6]/a/span"));
    	String actualvalue = downloads.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
    
    @Test
    public void verifylogouttab() {

    	String expectedvalue = "Logout";
    	WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[7]/a/span"));
    	String actualvalue = logout.getText();
    	  Assert.assertEquals(actualvalue, expectedvalue); 	
    }
    
    
}
