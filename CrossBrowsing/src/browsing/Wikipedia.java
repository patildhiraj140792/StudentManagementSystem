package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		WebElement English = driver.findElement(By.xpath("//strong[contains(text(),'English')]"));
//		English.click();
		
		WebElement create_acc = driver.findElement(By.xpath("//a[contains(text(),'Create account')]"));
		create_acc.click();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		driver.navigate().back();
		
		WebElement Seleniumhq = driver.findElement(By.xpath("//a[contains(text(),'Selenium - Web Browser Automation')]"));
		Seleniumhq.click();
		
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		
	}

}
