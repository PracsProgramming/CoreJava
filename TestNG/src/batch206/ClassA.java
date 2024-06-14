package batch206;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassA {
	public static WebDriver driver;
	
	// Login

	@BeforeTest
	public void Login() throws WebDriverException, Exception {
		Utility.LoginUtility();
		Utility.verifyusertab();
	}
	
//	// checking mobile number has 10 digits
		@Test
		public void verifyuserMobileNo_new() {
				Utility.Mobilecontain10digits();		
			}
		
	// checking email contains gmail.com
	@Test
	public void verifyuserEmail_new() {
		Utility.Emailcontaingmail();
		}
	

	
	// checking Id is numeric
	@Test
	public void verifyuserId_new() {
			Utility.UserIdIsNumeric();
		}

	}



