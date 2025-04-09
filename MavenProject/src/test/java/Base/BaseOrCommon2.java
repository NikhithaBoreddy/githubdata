package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseOrCommon2 {
	
	public WebDriver driver;
	
	public void launchBrowser(String Browsername) {
		
		if(Browsername.equalsIgnoreCase("chrome")) {
			
		driver = new ChromeDriver();
		
		}
		
		else if(Browsername.equalsIgnoreCase("edge")){
			
		 driver = new EdgeDriver();
		}
		
		else {
			
			driver = new FirefoxDriver();
		}
	}
	
	public void URLLaunching(String url) {
		
		driver.get(url);
	}
	
     public void maximizingtheBrowser() {
		
		driver.manage().window().maximize();
	}
     
     public void browserClosing() {
 		
 		driver.quit();
 	}
 	
 	public void waits() {
 		
 		
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
 	}
 	
 	public void screenshot(String screenshot) throws IOException {
 		
 		File screen =( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		
 		FileUtils.copyFile(screen,new File("C:\\Users\\hp\\eclipse-workspace\\Automation Testing\\MavenProject\\src\\test\\java\\Screenshots\\"+screenshot+".png"));
 	}
}
