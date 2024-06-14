package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	static WebDriver driver = null;
	
	
public static void getScreenshot(String name) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
		String date =sdf.format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Prachi\\JavaByKiran\\TestNG\\screenshot\\"+name+date+".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}



public String getProperty(String key) {
	Properties prop = new Properties();
	FileInputStream fis=null;
	try {
		fis = new FileInputStream("config.properties");
		prop.load(fis);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return prop.getProperty(key);
}


  @Test
  public void test01() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver = new ChromeDriver();
		driver.get(getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(getProperty("password"));
		driver.findElement(By.xpath("//button")).click();
	  System.out.println("test1");
  }
  
  @Test
  public void test02() {
	  System.out.println("test2");
	  Assert.assertEquals(true, false);
	  
  }
  @Test
  public void test03() throws Exception {
	  System.out.println("test3");
	  throw new Exception("skipped");
  }
}
