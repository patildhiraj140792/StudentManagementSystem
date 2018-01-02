package browsing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenShot {

	
		
		@Test
		
		public void ScreenShot() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://www.facebook.com");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement first_name = driver.findElement(By.xpath(".//*[@id='u_0_7']"));
			first_name.sendKeys("Learn Automation");
			
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
		
		    FileUtils.copyFile(source, new File("./ScreenShot/facebook.png"));
		    
		    System.out.println("ScreeShot Taken");
		    
		}
		
		
	}


