package automationChallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class Testing4 {

	@Test
	void test() {
		// Setting system property for ChomeDriver
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
						
				// new ChromeDriver instance
				WebDriver driver = new ChromeDriver();
						
				// open the home page
				driver.get("C:\\index.html");
				
				
				// Enabled Button
				WebElement div4 = driver.findElement(By.id("test-4-div"));
				WebElement button1 = div4.findElement(By.cssSelector("button[class='btn btn-lg btn-primary']"));
				
				
				/// Assert
				Assert.assertTrue(button1.isEnabled());
				
				//Disabled Button
				WebElement button2 = div4.findElement(By.cssSelector("button[class='btn btn-lg btn-secondary']"));
				
				//Assert 
				Assert.assertFalse(button2.isEnabled());
				
				
				
		
	}

}
