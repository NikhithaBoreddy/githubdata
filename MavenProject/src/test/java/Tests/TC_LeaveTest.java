package Tests;



import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseOrCommon;
import Base.BaseOrCommon2;
import Pages.Leavepage;
import Pages.LoginPage;

public class TC_LeaveTest extends BaseOrCommon2 {
	
	Leavepage lep;
	
	@BeforeSuite
	public void browserLaunching() {
		
		launchBrowser("chrome");
		
		lep= new Leavepage(driver);
		
		System.out.println("in @BeforeSuite method ");
		
		
	}
	
	@BeforeTest
	
	public void LaunchingURL() {
		
		URLLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("in @BeforeTest method ");
		
	}
	
	@BeforeClass
	
	public void Maximizethebrowser() {
		
		maximizingtheBrowser();
		
		 System.out.println("in @BeforeClass  method");
	}
		
	@BeforeMethod
	
	public void waits() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@Test(priority = 0)
	
	public void enterUsername() {
		
		lep.enterUsername();
		
		System.out.println("in enterUsername method");
	}
		
		@Test(priority = 1)
		
		public void enterPassword() {
			
			lep.enterPassword();
			
			System.out.println("in enterPassword method");	
		}
		
         @Test(priority = 2)
		
		public void clickLogin() {
			
			lep.clickLogin();
			
			System.out.println("in clickLogin method");
		}
         @Test(priority = 3)
 		
 		public void clickLeave() {
 			
 			lep.leaveTab();
 			
 			System.out.println("in clickLeave method");
 		}
         
         @Test(priority = 4)
  		
  		public void clickLeaveList() {
  			
  			lep.leaveListTab();
  			
  			System.out.println("in clickLeavelist method");
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
