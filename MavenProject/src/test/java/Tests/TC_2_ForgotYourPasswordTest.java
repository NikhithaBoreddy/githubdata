package Tests;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseOrCommon;
import Methods.ForgotYourPasswordMethods;
import Pages.ForgotYourPasswordPage;
import Pages.LoginPage;

public class TC_2_ForgotYourPasswordTest extends BaseOrCommon {
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;
	 
	 @BeforeSuite
	 public void  launchBrowser() throws IOException {
		 
		 
		 browserLaunching("chrome");
		 
		 lp = new LoginPage(driver);		
		 
		 fpm = new ForgotYourPasswordMethods(driver);
		 
		 System.out.println("in @BeforeSuite method");	
		 
		 screenhsot("TC_2_ForgotYourPasswordTest_launchBrowser");
	 }
	 
	 @BeforeTest
		public void launchURL() throws IOException {
			
			URLLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			System.out.println("in @BeforeTest method");
			
			screenhsot("TC_2_ForgotYourPasswordTest_launchURL");
	 }
	 
	 @BeforeClass
	  public void maximizeTheBrowser() {
		 
		 maximizingtheBrowser();
		 
		 System.out.println("in @BeforeClass  method");
		 
		 
	 }
	 
	 @BeforeMethod
		public void waiting() {
			
			waits();
			
			System.out.println("in @BeforeMethod method");			
		}
		
	 @Test (priority = 0)
		public void clickForgotYourPassword() throws IOException {
			
			lp.clickForgotYourPassword();
			
			System.out.println("in clickForgotYourPassword method");
			
			screenhsot("TC_2_ForgotYourPasswordTest_clickForgotYourPassword");

		}
		@Test (priority = 1)
		public void enterUsername() throws IOException {
			
			fpm.enterUsername();
			
			System.out.println("in enterUsername method");

			screenhsot("TC_2_ForgotYourPasswordTest_enterUsername");

		}
		
		@Test (priority = 2)
		public void clickCancelButton() {
			
			fpm.clickCancel();
			
			System.out.println("in clickCancelButton method");			

		}
		
		
		@AfterMethod
		public void waiting1() {
			
			waits();
			
			System.out.println("in @AfterMethod method");			
		}
		
	 
	
		
		@AfterSuite
		public void closeBrowser() {
			
			browserClosing();
			
			System.out.println("in @AfterSuite method");
			
		}
		
		
		
		
}
