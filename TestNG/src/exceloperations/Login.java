package exceloperations;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Login {
	
	public String getData(int row , int col)throws Exception {
		FileInputStream fis = new FileInputStream("D:\\Prachi\\JavaByKiran\\TestNG\\src\\exceloperations\\TestData.xls");
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet sh= wb.getSheet("Sheet1");
		
		Cell c = sh.getCell(col, row);
		return c.getContents();
	}
	
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
 
  @Test
  public void LoginTest() throws Exception {
	  
	  if (driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText().contains("already"))
		  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	 
	  driver.findElement(By.id("email")).sendKeys(getData(0,0));
	  driver.findElement(By.id("password")).sendKeys(getData(0,1));
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();	 
  }
  

}
