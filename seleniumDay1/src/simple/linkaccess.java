package simple;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkaccess {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe");
	System.out.println(22);
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());

	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	String ParentWindow = driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	//access link 
	//driver.findElement(By.linkText("More info")).click();
	driver.findElement(By.partialLinkText("More")).click();
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(10);
	// window handle
	Set <String> windohandle = driver.getWindowHandles();
	System.out.println(windohandle.size());

	driver.switchTo().window(ParentWindow);
	System.out.println(driver.getCurrentUrl());
		
	Iterator<String> WindowIterator = windohandle.iterator();
	
	while (WindowIterator.hasNext())
	{
		String ChildWindow = WindowIterator.next();
		
		if(!ParentWindow.equals(ChildWindow))
		{
			driver.switchTo().window(ChildWindow);
			System.out.println(driver.switchTo().window(ChildWindow).getCurrentUrl());
			driver.close();
		}
	}
	
	driver.switchTo().window(ParentWindow);
	
}
}
