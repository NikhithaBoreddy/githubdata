package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotYourPasswordPage {
	
	public WebDriver driver;
	
	public ForgotYourPasswordPage(WebDriver driver) {
		
		this.driver=driver;
	}

	
	// Syntax: accessmodifier By webelementname = By.locator(“”)

		// 2ndway way
	
	
	
	public By username_Textbox  =By.xpath("//*[@name='username']");
	
	public By cancel_button  =By.xpath("//button[@type='button']");
	
	public By resetPassword_Button   =By.xpath("//button[@type='submit']");
	
	
	
	
}
