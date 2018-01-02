package browsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement user_id = driver.findElement(By.id("user-message"));
		user_id.sendKeys("Hello There");
		
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath(".//*[@id='get-input']/button"));
		btn.click();
		
		Thread.sleep(2000);
		
		
		WebElement val_a = driver.findElement(By.id("sum1"));
		val_a.sendKeys("5");
		
		Thread.sleep(2000);
		
		WebElement val_b= driver.findElement(By.id("sum2"));
		val_b.sendKeys("6");
		
		Thread.sleep(2000);
		
		WebElement get_total = driver.findElement(By.xpath(".//*[@id='gettotal']/button"));
		get_total.click();
		
		driver.close();
		
	}

}
