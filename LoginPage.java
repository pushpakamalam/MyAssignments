package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		
	}


	          //action+ElementName
	public LoginPage enterUsername() throws InterruptedException
	{
		 
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 Thread.sleep(10000);		 
		 return this;   //this keyword represent the object of the same page so change to pagename LoginPage instead of void as it does//
		 					
	}
	
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		return this;
	}
	
	public HomePage	clickLoginbutton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//HomePage hp = new HomePage();  
				//returns hp;  -- the above 2 lines can be done or can abt done in below as one line
		
		return new HomePage(driver);
	}
}
