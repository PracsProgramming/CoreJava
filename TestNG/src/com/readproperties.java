package com;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readproperties {
	@Test
	public void test01() throws Exception{
		
		FileInputStream fis = new FileInputStream("D:\\Prachi\\JavaByKiran\\TestNG\\config.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String value= prop.getProperty("username");
		System.out.println(value);
	}
	
	@Test
	public void test02() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(getProperty("password"));
		driver.findElement(By.xpath("//button")).click();
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


}
