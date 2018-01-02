package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		String base_url = "http://toolsqa.com/iframe-practice-page/";

		driver.get(base_url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Numbers of iframe in this WebPage is = "+iframe.size());
		
//		WebElement iframe1 = driver.findElement(By.id("IF1"));
//		iframe1.click();
		
		driver.switchTo().frame(1);
		
		
		

	}

}
