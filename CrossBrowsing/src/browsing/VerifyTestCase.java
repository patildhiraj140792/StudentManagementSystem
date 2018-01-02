package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		boolean existance = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
		if(existance==true)
		{
			System.out.println("The Gmail website is available on google page== Passed");
		}
		else
		{
			System.out.println("The Gmail website is Not available on google page== Failed");
		}
		
		
		
		
	}

}
