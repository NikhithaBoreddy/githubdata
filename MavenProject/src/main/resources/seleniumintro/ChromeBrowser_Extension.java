package seleniumintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_Extension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Syntax: interface objectname = new classname();
		 */

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		
		
	}

}
