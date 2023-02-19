package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateLeadPage enterFirstname()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
		
	}
	
	public CreateLeadPage enterLastname()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
		
	}

	public CreateLeadPage enterCompanyname()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
		
	}

	
	public ViewLeadPage clickCreateLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
		
	}
	
}
