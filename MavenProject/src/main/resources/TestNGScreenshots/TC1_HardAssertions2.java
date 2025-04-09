package TestNGScreenshots;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v132.page.model.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestNG.BaseOrCommon;

public class TC1_HardAssertions2 extends BaseOrCommon {
	
	
	 
	 @BeforeSuite
	 public void  launchBrowser() throws IOException {
		 
		 browserLaunching("chrome");
		 
		 screenhsot("TC_1_HardAssertion2_Launchbrowser");

		 System.out.println("in @BeforeSuite method");	
		 
	 }
	 
	 @BeforeTest
		public void launchURL() {
			
			URLLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			System.out.println("in @BeforeTest method");
	 }
	 
	 @BeforeClass
	  public void maximizeTheBrowser() throws IOException {
		 
		 maximizingtheBrowser();
		 
		 screenhsot("TC_1_HardAssertion2_maximizeTheBrowser");
		 
		 System.out.println("in @BeforeClass  method");
		 
	 }
	 
	 @BeforeMethod
	  public void waiting() {
		 
		 waits();
		 
		 System.out.println("in @BeforeMethod  method");
		 
	 }
	 
	 @Test(priority = 0)
	 
	 public void VerifyTitle() {
		 
		 String expectedValue = "OrangeHRM";
		 
		 String actualValue = driver.getTitle();
		 
		 assertEquals(expectedValue, actualValue);
		 
		 System.out.println("hi livetch team");
	 }
	 
	 @Test (priority = 1)
		public void enterUsername() {
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			
			System.out.println("in enterUsername method");			

		}
		
		@Test (priority = 2)
		public void enterPassword() throws IOException {
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			
			screenhsot("TC_1_HardAssertion2_enterPassword");
			
			System.out.println("in enterPassword method");			

		}
		
		@Test (priority = 3)
		public void clickLogin() {
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			System.out.println("in clickLogin method");			

		}
		
		@Test (priority = 4)
		public void clickAdminTab() throws IOException {
			
			driver.findElement(By.xpath("//span[text()='Admin']")).click();		
			
			screenhsot("TC_1_HardAssertion2_clickAdminTab");

			System.out.println("in clickAdminTab method");
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
