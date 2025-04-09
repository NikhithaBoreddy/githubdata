package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_2_ClickAdminTab_Chrome {
	
	 public WebDriver driver;
	 
	 @BeforeSuite
	 public void  launchBrowser() {
		 
		 driver = new ChromeDriver();
		 
		 System.out.println("in @BeforeSuite method ");
		 
	 }
	 
	 @BeforeTest
	  public void launchURL() {
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 System.out.println("in @BeforeTest  method");
	 }
	 
	 @BeforeClass
	  public void maximizeTheBrowser() {
		 
		 driver.manage().window().maximize();
		 
		 System.out.println("in @BeforeClass  method");
		 
	 }
	 
	 @BeforeMethod
	  public void waiting() {
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		 
		 System.out.println("in @BeforeMethod  method");
		 
	 }
	 
	 @Test(priority = 1)
	  public void enterUsername(){
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 
		 System.out.println("in enterUsername  method");
		 
	 }
	 
	 @Test(priority = 2)
	  public void enterPassword(){
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			
			System.out.println("in enterPassword method");			

	 }
	 

		@Test(priority = 3)
		public void clickLogin() {
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			System.out.println("in clickLogin method");			

		}
		
		@Test (priority = 4)
		public void clickAdminTab() {
			
			driver.findElement(By.xpath("//span[text()='Admin']")).click();
			
			System.out.println("in clickAdminTab method");			

		}
		
		@AfterMethod
		public void waiting1() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			
			System.out.println("in @AfterMethod method");			
		}
		
		@AfterSuite
		public void closeBrowser() {
			
		//	driver.quit();
			
			System.out.println("in @AfterSuite method");
			
		}
		
		
		
		
}
