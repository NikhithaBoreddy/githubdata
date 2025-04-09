package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Leavepage {
	
	public WebDriver driver;
	
	public Leavepage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	// Syntax: accessmodifier By webelementname = By.locator(“”)

			// 1st way
	
	private By username_Textbox = By.xpath("//*[@name='username']");
	
	private By password_Textbox = By.xpath("//*[@name='password']");
	
	private By login_Button = By.xpath("//*[@type='submit']");
	
	private By leave_tab = By.xpath("//*[text()='Leave']");
	
	private By leavelist_tab = By.xpath("//*[text()='Leave List']");
	
	
	

	
   public void enterUsername() {
		
		driver.findElement(username_Textbox).sendKeys("Admin");
	}
    
    public void enterPassword() {
		
		driver.findElement(password_Textbox).sendKeys("admin123");
    }
    
     public void clickLogin() {
		
		driver.findElement(login_Button).click();
    }
    
     public void leaveTab() {
 		
 		driver.findElement(leave_tab).click();
     }
     
     public void leaveListTab() {
  		
  		driver.findElement(leavelist_tab).click();
      }
     

}
