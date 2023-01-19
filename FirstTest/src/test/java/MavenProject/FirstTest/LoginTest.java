package MavenProject.FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utility.BaseTest;

public class LoginTest extends BaseTest{

	@BeforeSuite
	public void setup() {
		launchApp("Chrome"); 
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void ValidLogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		
		lp.login();
		Thread.sleep(2000);
		hp.EnterCode();

	}
	
}
