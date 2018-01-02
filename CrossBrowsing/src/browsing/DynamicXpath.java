package browsing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicXpath {

	public String Base_url = "http://www.amazon.in";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;

	@BeforeTest

	public void SystemData() {
		System.out.println("Launching Amazon Page");
		System.setProperty("webdriver.firefox.marionette", driverpath);
		driver = new FirefoxDriver();
		driver.get(Base_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test

	public void WindowHandler() {

		WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("Shutter Island");

		WebElement Clcik_Object = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		Clcik_Object.click();

		WebElement Actual_result = driver
				.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2"));

		Actual_result.click();

		String Main_window = driver.getWindowHandle();

		Set<String> S1 = driver.getWindowHandles();
		Iterator<String> I1 = S1.iterator();

		while (I1.hasNext()) {
			String Child_window = I1.next();

			if (!Main_window.equalsIgnoreCase(Child_window)) {
				driver.switchTo().window(Child_window);
			}
			
			
			WebElement Click_on_Book = driver
					.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[1]/div/div/a/img"));

			Click_on_Book.click();

			String Child_Window2 = I1.next();
			if (!Child_window.equalsIgnoreCase(Child_Window2)) {
				driver.switchTo().window(Child_Window2);
			}
			driver.close();

		}
		driver.close();
	}
}
