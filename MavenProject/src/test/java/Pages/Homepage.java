package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	
	public WebDriver driver;
	
	Actions act ;
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//1st way
	
	/*@FindBy(how = How.XPATH, using ="//*[@class='oxd-userdropdown-name']")
	public WebElement user_Dropdown; */
	
	@FindBy(how = How.XPATH,using = "(//*[text()='About' and @href='/about'])[1]")
	
	public WebElement about_Tab; 
	
	
    @FindBy(how = How.XPATH,using = "(//*[text()='Pioneering Pathways' and @href='/PioneeringPathways'])[1]")
	
	public WebElement pioneeringPathways_Tab; 
    
    

    @FindBy(how = How.XPATH,using = "(//*[text()='Medicines' and @href='/medicines'])[1]")
	
	public WebElement Medicines_Tab; 
    
    //2nd way
    
   /* @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logout_Tab;*/
    
    @FindBy(xpath = "(//*[text()='Science' and @href='/science'])[1]")
    
    public WebElement science_Tab;

    @CacheLookup
    @FindBy(xpath = "(//*[text()='Our Purpose' and @href='/our-purpose'])[1]")
    
    public WebElement OurPurpose_Tab;

    @FindBy(xpath = "(//*[text()='Our Stories' and @href='/our-stories'])[1]")
    
    public WebElement Ourstories_Tab;
    
    @CacheLookup
    @FindBy(xpath = "(//*[text()='News'])[1]")
    
    public WebElement News_Tab;
    
    @FindBy(xpath = "(//*[text()='Investors'])[1]")
    
    public WebElement Investors_Tab;
    
    
    @FindBy(xpath = "(//*[text()='Careers'])[1]")
    
    public WebElement Careers_Tab;

    
    public void verifyabout() {
		
    	about_Tab.isDisplayed();
    }

    public void verifyPioneeringPathways() {
		
    	pioneeringPathways_Tab.isDisplayed();
    }

     public void verifymedicines() {
		
    	 Medicines_Tab.isDisplayed();
     }
    	
     public void verifyScience() {
    			
    	 science_Tab.isDisplayed();
     }
     
     public void verifyOurPurpose() {
			
    	 OurPurpose_Tab.isDisplayed();
     }
     
     public void verifyOurstories() {
			
    	 Ourstories_Tab.isDisplayed();
  }
     
     public void verifyNews() {
			
    	 News_Tab.isDisplayed();
}
     
     public void verifyInvestors() {
			
    	 Investors_Tab.isDisplayed();
}
     
     public void verifyCareers() {
			
    	 Careers_Tab.isDisplayed();
}
     
     public void mouseovermedicine() {
    	 
    	 act= new Actions(driver);
    	 
    	 act.moveToElement(Medicines_Tab).build().perform();
			
    	
}
}
