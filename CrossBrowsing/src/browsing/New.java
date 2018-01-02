package browsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
