package exceloperations;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class DPWithExcel {

	public static String DriverPath = "D:\\Prachi\\Resume_Prachi\\Resume17Jan2021\\JBK_Assignments\\chromedriver.exe";
	public static String baseurl = "file:///D:/Prachi/Resume_Prachi/Resume17Jan2021/JBK_Assignments/Offline%20Website/Offline%20Website/index.html";
	public static WebDriver driver = null;

	@BeforeSuite
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", DriverPath);
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

	@Test(dataProvider = "dp")
	public void logintest(String uname, String password) {

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		if (driver.getTitle().contains("Dashboard"))
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a")).click();

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");

	}

	@DataProvider
	public Object[][] dp() throws BiffException, IOException {

		Workbook wb = null;

		try {
			FileInputStream fis = new FileInputStream(
					"D:\\\\Prachi\\\\JavaByKiran\\\\TestNG\\\\src\\\\exceloperations\\\\TestData.xls");
			wb = Workbook.getWorkbook(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Sheet sh = wb.getSheet("Sheet1");
		int rows = sh.getRows();
		int cols = sh.getColumns();
		String[][] logindata = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Cell c = sh.getCell(j, i);
				logindata[i][j] = c.getContents();
			}
		}
		return logindata;

	}
}
