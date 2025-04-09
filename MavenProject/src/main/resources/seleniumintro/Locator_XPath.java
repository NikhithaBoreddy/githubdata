package seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XPath {

	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//absolute XPath
				
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("harshitha");

		//Relative XPath
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("nikhitha");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("  asra");

	}

}
