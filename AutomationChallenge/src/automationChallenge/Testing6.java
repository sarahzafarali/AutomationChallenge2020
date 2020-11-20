package automationChallenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class Testing6 {

	@Test
	void test() {
		
		String cellText = "";
		String expectedCellText = "Ventosanzap";
		
		// Setting system property for ChomeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
		// new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
				
		// open the home page
		driver.get("C:\\index.html");
		
		cellText = findingGridValues(driver, 2, 2);
		System.out.println("The cell text in the main is " + cellText);
		
		Assert.assertEquals(cellText, expectedCellText);
		
	
	}
	
	public static  String findingGridValues(WebDriver driver, int x, int y) {
		 x = x+1;
		 y = y+1;
		String cellValue = "";
		
		//Fetching Cell value
		WebElement cellValue2 = driver.findElement(By.xpath("//*[@id=\"test-6-div\"]/div/table/tbody/tr[" + x + "]/td[" + y + "]"));
		//System.out.println("The cell text  is " + cellValue2.getText());
		
		cellValue = cellValue2.getText();
				
		return cellValue;
	  }

}
