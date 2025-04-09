package Tests;



import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseOrCommon;
import Pages.LoginPage;

public class TC_1_LoginTest extends BaseOrCommon {
	
	LoginPage lp;
	 
	 @BeforeSuite
	 public void  launchBrowser() {
		 
		 
		 browserLaunching("chrome");
		 
		 lp = new LoginPage(driver);		
		 
		 
		 System.out.println("in @BeforeSuite method");	
		 
	 }
	 
	 @BeforeTest
		public void launchURL() {
			
			URLLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			System.out.println("in @BeforeTest method");
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
		
		@Test (priority = 1)
		public void enterUsername() {
			
			lp.enterUsername();
			
			System.out.println("in enterUsername method");			

		}
		
		@Test (priority = 2)
		public void enterPassword() {
			
			lp.enterPassword();
			
			System.out.println("in enterPassword method");			

		}
		
		@Test (priority = 3)
		public void clickLogin() {
			
			lp.clickLogin();
			
			System.out.println("in clickLogin method");			

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
