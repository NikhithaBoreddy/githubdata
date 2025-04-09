package Tests;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseOrCommon;
import Pages.Homepage;
import Pages.LoginPage;

public class TC_1_VerifyMedicines extends BaseOrCommon {
	
	Homepage hp;
	 
	 @BeforeSuite
	 public void  launchBrowser() {
		 
		 
		 browserLaunching("chrome");
		 
		// Classname objectname = pagefactory.initElements(web driver object, pagefactoryclass.class)	
		 
		 hp = PageFactory.initElements(driver, Homepage.class);
		 
		 System.out.println("in @BeforeSuite method");	
		 
	 }
	 
	 @BeforeTest
		public void launchURL() {
			
			URLLaunching("https://www.jazzpharma.com/");
			
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
		public void verifyheadertabs() {
			
			hp.verifyabout();
			
			hp.verifyPioneeringPathways();
			
			hp.verifymedicines();
			
			hp.verifyScience();
			
			hp.verifyOurPurpose();
			
			hp.verifyOurstories();
			
			hp.verifyNews();
			
			hp.verifyInvestors();
			
			hp.verifyCareers();
			
			
			System.out.println("in verifyheadertabs method");			

		}
		
		@Test (priority = 2)
		public void mouseovermethod() {
			
			hp.mouseovermedicine();
			
			System.out.println("in enterPassword method");			

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
