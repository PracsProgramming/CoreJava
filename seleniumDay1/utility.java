package TenTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class utility {
	public static String baseurl = "file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html";
	public static WebDriver driver ;
	
	public void browserutility(String brname) {
		
		if(brname=="chrome") {
			
			String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",DriverPath);	
			 driver = new ChromeDriver();
		}
		if(brname=="firefox") {
			String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\geckodriver-v0.26.0-win64\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",DriverPath);
			 driver = new FirefoxDriver();
		}
		if(brname=="IE") {
			String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",DriverPath);
			driver = new InternetExplorerDriver();
		}
		
		
		
	}

}
