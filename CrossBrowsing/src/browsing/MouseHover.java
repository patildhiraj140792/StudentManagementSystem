package browsing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("http:www.toolsqa.com/selenium-webdriver/dropdown-multiple-select-operations/");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/a/span[1]/span/span"));
		
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(ele).perform();
		
		
	}
	

}
