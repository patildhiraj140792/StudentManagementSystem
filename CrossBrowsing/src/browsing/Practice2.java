package browsing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice2 {

	
	public static void main(String [] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement chk_bx = driver.findElement(By.id("isAgeSelected"));
		
		Thread.sleep(2000);
		
		chk_bx.click();
		
		
		
		
		// 1)   
		
		WebElement chk_all = driver.findElement(By.id("check1"));
		
		chk_all.click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		// 2)
		
		
		
		
		
		
		
		
		
		
		
	}
}
