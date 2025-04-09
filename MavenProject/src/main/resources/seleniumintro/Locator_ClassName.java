package seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ClassName {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//webdriverObject.findElement/FindElements(By.locator(“”)).methods();
		
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("saturday");
		
		
	}

}
