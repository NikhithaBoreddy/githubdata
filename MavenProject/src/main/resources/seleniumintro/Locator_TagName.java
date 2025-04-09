package seleniumintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_TagName {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> tagname = driver.findElements(By.tagName("input"));
		
		System.out.println("input tagname web elements count is :" + tagname.size());
		
		 tagname = driver.findElements(By.tagName("div"));
		 
		 System.out.println("div tagname web elements count is :" + tagname.size());
		 
		 tagname= driver.findElements(By.tagName("label"));
		 
		 System.out.println("label tagname web elements count is :" + tagname.size());
		 
		 driver.close();
		
		
		
		
		
		
	}

}
