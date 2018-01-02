package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		WebDriver driver = new FirefoxDriver();

		

		driver.get("http://www.amazon.in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		
		
	}

}
