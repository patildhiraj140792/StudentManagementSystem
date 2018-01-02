package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe11 {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.guru99.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println(size);
		
//		for (int i = 0; i <= size; i++) {
//			driver.switchTo().frame(i);
//			int total = driver.findElements(By.xpath("")).size();
//
//			System.out.println(total);
//			driver.switchTo().defaultContent();
//		}

	}

}
