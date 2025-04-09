package seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Id {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//webdriverObject.findElement/FindElements(By.locator(“”)).methods();
		
		driver.findElement(By.id("email")).sendKeys("livetech");
		
		
		
		
	}

}
