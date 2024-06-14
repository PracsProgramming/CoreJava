package simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Listener {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		
		trackchanges tc = new trackchanges();
		
		eventDriver.register(tc);
		
		eventDriver.get("file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html");
	}

}
