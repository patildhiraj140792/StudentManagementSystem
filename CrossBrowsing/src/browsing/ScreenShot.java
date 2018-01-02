package browsing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {


	
	
	public void FacebookScreenShot() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Capture SnapShot");
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./ScreenShot/facebook.png"));
		
		System.out.println("ScreeShot Taken");
		 
		driver.quit();
	}
}
