package MavenProject.FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
     WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;		
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	//driver.findElement(By.id("username")).sendKeys("automationtestacademy@gmail.com");
	@FindBy(id="code")
	WebElement code;
	
	public void EnterCode()
	{
		code.sendKeys("9999");
	}

}
