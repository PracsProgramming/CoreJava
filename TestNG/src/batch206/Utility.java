package batch206;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class Utility {
	public static String baseurl = "file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html";
	public static WebDriver driver;
	public static String strEmail = "kiran@gmail.com";
	public static String strPassword = "123456";
	public static boolean result;
	public static String MobileNo;
	public static String Email;
	public static String Id;
	

	static ArrayList<String> expectedEmail = new ArrayList<>();
	static ArrayList<String> ActualEmail = new ArrayList<>();

	static ArrayList<String> expectedMobileNo = new ArrayList<>();
	static ArrayList<String> ActualMobileNo = new ArrayList<>();

	static ArrayList<String> expectedId = new ArrayList<>();
	static ArrayList<String> ActualId = new ArrayList<>();

	public static void takescreenshotofscreen(File sfile, String Destfile) throws Exception {

		File Destfile1 = new File("D:\\Prachi\\JavaByKiran\\TestNG\\src\\" + Destfile);
		FileUtils.copyFile(sfile, Destfile1);

	}

	public static void browserselect(String brname) {

		if (brname == "chrome") {

			String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", DriverPath);
			driver = new ChromeDriver();
		}
		if (brname == "firefox") {
			String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\geckodriver-v0.26.0-win64\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", DriverPath);
			driver = new FirefoxDriver();
		}
		if (brname == "IE") {
			String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", DriverPath);
			driver = new InternetExplorerDriver();
		}

	}

	public static void LoginUtility() throws WebDriverException, Exception {
		Utility.browserselect("chrome");
		driver.get(Utility.baseurl);
		Utility.takescreenshotofscreen(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), "BaseUrl.png");
		WebElement LoginEditBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		LoginEditBox.clear();
		LoginEditBox.sendKeys(Utility.strEmail);
		WebElement PasswordEditBox = driver.findElement(By.id("password"));
		PasswordEditBox.clear();
		PasswordEditBox.sendKeys(Utility.strPassword);
		WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		SubmitButton.click();

	}

	public static void verifyusertab() throws WebDriverException, Exception {

		WebElement User = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span"));
		User.click();
		Utility.takescreenshotofscreen(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), "User.png");
	}

	public static void userEmaildata() {
		expectedEmail.add("kiran@gmail.com");
		expectedEmail.add("sagar@gmail.com");
		expectedEmail.add("monica@gmail.com");
		expectedEmail.add("kimaya@gmail.com");

		ActualEmail.add(driver.findElement(By.xpath("//tr[2]/td[3]")).getText());
		ActualEmail.add(driver.findElement(By.xpath("//tr[3]/td[3]")).getText());
		ActualEmail.add(driver.findElement(By.xpath("//tr[4]/td[3]")).getText());
		ActualEmail.add(driver.findElement(By.xpath("//tr[5]/td[3]")).getText());

	}

	public static void usermobiledata() {
		expectedMobileNo.add("9898989898");
		expectedMobileNo.add("999999999");
		expectedMobileNo.add("1111111111");
		expectedMobileNo.add("999999999");

		ActualMobileNo.add(driver.findElement(By.xpath("//tr[2]/td[4]")).getText());
		ActualMobileNo.add(driver.findElement(By.xpath("//tr[3]/td[4]")).getText());
		ActualMobileNo.add(driver.findElement(By.xpath("//tr[4]/td[4]")).getText());
		ActualMobileNo.add(driver.findElement(By.xpath("//tr[5]/td[4]")).getText());

	}

	public static void userIddata() {
		expectedId.add("1");
		expectedId.add("2");
		expectedId.add("3");
		expectedId.add("4");

		ActualId.add(driver.findElement(By.xpath("//tr[2]/td[1]")).getText());
		ActualId.add(driver.findElement(By.xpath("//tr[3]/td[1]")).getText());
		ActualId.add(driver.findElement(By.xpath("//tr[4]/td[1]")).getText());
		ActualId.add(driver.findElement(By.xpath("//tr[5]/td[1]")).getText());

	}
	
	


	public static void Emailcontaingmail() {
		List<WebElement> list = driver.findElements(By.xpath("//tr"));
		int rows = list.size();

		for (int j = 2; j <= rows; j++) {
			WebElement email = driver.findElement(By.xpath("//tr[" + j + "]/td[3]"));
			 Email = email.getText();
			 result = Email.contains("gmail.com");
		
				System.out.println("Actual Email is " + Utility.Email + " result is " + Utility.result);
				Assert.assertEquals(Utility.result, true);
		}
	}
	
	public static void Mobilecontain10digits (){
		List<WebElement> list = driver.findElements(By.xpath("//tr"));
		int rows = list.size();

		System.out.println(rows);
		for (int j = 2; j <= rows; j++) {
		
			WebElement mobile = driver.findElement(By.xpath("//tr[" + j + "]/td[4]"));
			MobileNo = mobile.getText();

			int resultlen = MobileNo.length();
			if (resultlen == 10) {
				result = true;
			} else {
				result = false;
			}
			
			 System.out.println("Actual Mobile number " + Utility.MobileNo + " result is " + Utility.result);
				Assert.assertEquals(Utility.result, true);
		}
	}
	
	
	public static void UserIdIsNumeric() {
		List<WebElement> list = driver.findElements(By.xpath("//tr"));
		int rows = list.size();

		 result = true;
		@SuppressWarnings("unused")
		int res;
		for (int j = 2; j <= rows; j++) {

			//String isNumeric;
			WebElement id = driver.findElement(By.xpath("//tr[" + j + "]/td[1]"));
			Id = id.getText();
			try {
				res = Integer.parseInt(Id);
			} catch (NumberFormatException e) {
				result = false;
			}
			
			System.out.println("Actual Id is " + Utility.Id + " result is " + Utility.result);
			Assert.assertEquals(Utility.result, true);
			
		}
	}
	
}
