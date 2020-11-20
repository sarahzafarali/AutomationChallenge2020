package automationChallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class Testing1 {

	@Test
	void test() {
		// Setting system property for ChomeDriver
				System.setProperty("webdriver.chrome.driver", "C:\\AutomationChallenge-2020\\chromeDriver\\chromedriver.exe");
				
				// new ChromeDriver instance
				WebDriver driver = new ChromeDriver();
				
				// open the home page
				driver.get("C:\\AutomationChallenge-2020\\index.html");

				// Finding page Elements
				WebElement emailAdd = driver.findElement(By.id("inputEmail"));
				WebElement pswd = driver.findElement(By.id("inputPassword"));
				WebElement signin  = driver.findElement(By.xpath("//*[text() = 'Sign in']"));
				
				boolean email = emailAdd.isDisplayed();
				boolean password = pswd.isDisplayed();
				boolean sign = signin.isDisplayed();
				
				//Assert for Email Address
				Assert.assertTrue(email);
				
				//Assert for Password
				Assert.assertTrue(password);
				
				//Assert for Sign in
				Assert.assertTrue(sign);
				
						
				//Populating email field
				emailAdd.clear();
			    emailAdd.sendKeys("Test Email");
			            
			    //Populating password field
			    pswd.clear();
			    pswd.sendKeys("Enter Password");

				
	
	}

}
