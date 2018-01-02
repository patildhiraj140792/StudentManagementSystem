package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) {
System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Shirpur");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Pune");
		
		driver.findElement(By.id("search")).click();
		
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[5]")).click();
	}

}
