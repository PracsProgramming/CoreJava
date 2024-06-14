package batch206;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class ThreeTestcases {

	public static WebDriver driver;
	

	// Login

	@BeforeTest
	public void Login() throws WebDriverException, Exception {
		Utility.LoginUtility();
		Utility.verifyusertab();
	}

	// checking email as per expected values in array list
	@Test
	public void verifyuserEmail() {

		Assert.assertEquals(Utility.ActualEmail, Utility.expectedEmail);

	}


	// checking mobile number as per array list
	@Test
	public void verifyuserMobileNo() {

		Assert.assertEquals(Utility.ActualMobileNo, Utility.expectedMobileNo);

	}


	// checking Ids as per array list
	@Test
	public void verifyUserId() {

		Assert.assertEquals(Utility.ActualId, Utility.expectedId);
	}


}
