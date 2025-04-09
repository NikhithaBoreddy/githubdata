package seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CSSSelector {

	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("  asra");

		driver.findElement(By.cssSelector("#pass")).sendKeys("  anil");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("naveen");
		
		
	}

}
