package simple;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class TenScreenShots {
	

	
	public static void takescreenshotofscreen(File sfile,String Destfile) throws Exception {
		
		File Destfile1 = new File("D:\\Prachi\\JavaByKiran\\seleniumDay1\\src\\"+Destfile);
		FileUtils.copyFile(sfile, Destfile1);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe");
		System.out.println(22);
		WebDriver driver = new ChromeDriver();

		driver.get("file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html");
		
		///taking screenshot
		takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"BaseUrl.png");
		
	
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.tagName("h4")).getText());
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		
		///taking screenshot
		takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"login.png");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		///taking screenshot
		takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"Dashboard.png");
		
		//for (int i = 1; i < 5; i++) {
		//	System.out.println(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[" + i + "]/div/div[1]/h3")).getText());
		//	System.out.println(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[" + i + "]/div/div[1]/p")).getText());

		//}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		
		///taking screenshot
				takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"Adduser.png");
		
		//username
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("prachi");
		
		///taking screenshot
				takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"username.png");
				
		//mobile
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("1234567890");
		
		///taking screenshot
				takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"mobile.png");
		//Email
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("prachi@gmail.com");
		///taking screenshot
				takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"email.png");
		//course
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Java");
		
		///taking screenshot
				takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"language.png");
				
		//password
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[7]/div/input")).sendKeys("123456");
		
		///taking screenshot
				takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"password.png");
		//radio button 
		WebElement radio = driver.findElement(By.name("gender"));
		radio.click();
		///taking screenshot
				takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"radiobtn_1.png");
		System.out.println(radio.isSelected());
		WebElement radio1 = driver.findElement(By.id("Female"));
		radio1.click();
		///taking screenshot
			takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"radiobtn_2.png");
			
		System.out.println(radio1.isSelected());
		//dropdown element selection with select
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		Select ss = new Select(dropdown);
		
		for (int i = 1; i < 5; i++) {
			//dropdown.get(i).click();
			//System.out.println(dropdown.get(i).getText());

			ss.selectByIndex(i);
			System.out.println(ss.getFirstSelectedOption().getText());
			///taking screenshot
			///taking screenshot
			takescreenshotofscreen(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),"City"+i+".png");
		}
		
		
		//submit
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(100);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	
		driver.close();
		
		
	}
	}

