package simple;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe");
	System.out.println(22);
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	

	File sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File Destfile = new File("D:\\Prachi\\JavaByKiran\\seleniumDay1\\src\\image.png");
	
	FileUtils.copyFile(sfile, Destfile);
}
}
