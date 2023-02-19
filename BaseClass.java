package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

		public  ChromeDriver driver;  //static is to avoid the nullpoint exception
		
		@BeforeMethod
	  public void precondition() {
		  
			//open the application
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("http://leaftaps.com/opentaps/");
		
		/* 	
	
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click(); */
			
	  }

	  @AfterMethod
	  public void postcondition() {
		  
			driver.close();
	  }

		
		
		
		
		
	}


