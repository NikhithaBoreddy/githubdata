package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.ForgotYourPasswordPage;

public class ForgotYourPasswordMethods {
	
	public WebDriver driver;
	
	public ForgotYourPasswordMethods(WebDriver driver) {
		
		this.driver=driver;
	}

	
	ForgotYourPasswordPage fp = new ForgotYourPasswordPage(driver);
	
     public void enterUsername() {
		
		driver.findElement(fp.username_Textbox).sendKeys("Admin");
	}
     
     public void clickCancel() {
 		
 		driver.findElement(fp.cancel_button).click();
 	}
     
     public void clickResetPassword() {
  		
  		driver.findElement(fp.resetPassword_Button).click();
  	}
}
