package browsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise {

	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement user_id = driver.findElement(By.id("user-message"));
		user_id.sendKeys("Hello There");
		
		WebElement btn = driver.findElement(By.className("btn btn-default"));
		btn.click();
		
		
		driver.close();
	}
	
}
