package simple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileNumber {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe");
	System.out.println(22);
	WebDriver driver = new ChromeDriver();
	driver.get("file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.findElement(By.tagName("h4")).getText());
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
	

	
	int rows = driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr")).size();
	System.out.println(rows);
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[4]")).getText());

	for (int j = 2; j <= rows; j++) {
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td[4]")).getText());
		///html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[4]
		///html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[4]
		
		}


	
	driver.close();
	
	
}
}
