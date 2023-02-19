package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage VerifyHomePage() 
	{
		boolean displayed =  driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed)
		{
			System.out.println("HomePage is displayed");
		}else
		{
			System.out.println("HomePage is NOT displayed");
		}
			return this;
	}
	
	
	public LoginPage clickLogoutbutton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new LoginPage(driver);
	}
	
	public MyHomePage  clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new MyHomePage(driver);
	}
	

}
