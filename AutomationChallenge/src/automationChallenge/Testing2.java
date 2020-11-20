package automationChallenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class Testing2 {

	@Test
	void activity2() {
		
		// Setting system property for ChomeDriver
				System.setProperty("webdriver.chrome.driver", "C:\\AutomationChallenge-2020\\chromeDriver\\chromedriver.exe");
						
				// new ChromeDriver instance
				WebDriver driver = new ChromeDriver();
						
				// open the home page
				driver.get("C:\\AutomationChallenge-2020\\index.html");
				
				WebElement div2 = driver.findElement(By.id("test-2-div"));
				
				// Fetching List items
				List<WebElement>ul_list = div2.findElements(By.className("list-group"));
				List<WebElement> li_list = ul_list.get(0).findElements(By.tagName("li"));
				
				//Asserting the list contains 3 elements
				Assert.assertTrue(li_list.size() == 3);
				
				String listItem2Ex = "List Item 2 ";
				String badgeValueListItem = "";
				String textWithoutBadge = "";
				
				//Badge Value
				List<WebElement> badge = li_list.get(1).findElements(By.cssSelector("li > span"));
				badgeValueListItem = badge.get(0).getText();
				
				// Assert 2nd List item value
				textWithoutBadge = li_list.get(1).getText().replace(badgeValueListItem, "");
				Assert.assertEquals(listItem2Ex,textWithoutBadge);
				
				//Assert Badge value for 2nd list item
				Assert.assertEquals("6",badgeValueListItem);
				
				
	}
	
	

}
