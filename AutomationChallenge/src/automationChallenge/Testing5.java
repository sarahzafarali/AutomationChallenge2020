package automationChallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Testing5 {

	@Test
	void test() {
		
		String expectedText = "You clicked a button!";
		
		// Setting system property for ChomeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
		// new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
				
		// open the home page
		driver.get("C:\\index.html");
		
		// Fetching the Button
		WebElement div5 = driver.findElement(By.id("test-5-div"));
		WebElement invisibleButton = div5.findElement(By.cssSelector("button[class='btn btn-lg btn-primary']"));
		
		
		
		
		while(!invisibleButton.isDisplayed()){
			//System.out.println("button showing not");
			
		}
		
		
		invisibleButton.click();
		
		WebElement divAlert = driver.findElement(By.id("test5-alert"));
		
		/// assert equals for the text
		Assert.assertEquals(expectedText, divAlert.getText());
		
		/// assert true for visibility
		Assert.assertTrue(divAlert.isDisplayed());
		
	}

}
