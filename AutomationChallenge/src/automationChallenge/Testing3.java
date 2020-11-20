package automationChallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
class Testing3 {

	@Test
	void activity3() {
		      
		String expectedOption = "Option 1";
		
		// Setting system property for ChomeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationChallenge-2020\\chromeDriver\\chromedriver.exe");
				
		// new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
				
		// open the home page
		driver.get("C:\\AutomationChallenge-2020\\index.html");
		
		// Fetching the drop down button
		WebElement button = driver.findElement(By.id("dropdownMenuButton"));
		
		// Assert
		Assert.assertEquals(expectedOption, button.getText());
		
		button.click();
		WebElement dropDownMenu = driver.findElement(By.className("dropdown-menu"));
		WebElement option = dropDownMenu.findElements(By.className("dropdown-item")).get(2);
		option.click();
		
		
	}

}
