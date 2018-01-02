package browsing;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

	public String Base_url = "http://www.amazon.in";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;

	@BeforeTest
	public void WindowHandle() {

		System.out.println("Launching Amazon Page");
		System.setProperty("webdriver.firefox.marionette", driverpath);
		driver = new FirefoxDriver();
		driver.get(Base_url);
		driver.manage().window().maximize();
	}

	@Test
	public void window() throws Exception {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike football size 5");

		Thread.sleep(2000);

		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

		Select Relevence = new Select(driver.findElement(By.name("sort")));
		Relevence.selectByVisibleText("Price: High to Low");

		WebElement results = driver.findElement(By.id("resultsCol"));
		List<WebElement> lis = results.findElements(By.tagName("li"));

		for (WebElement li : lis) {
			List<WebElement> anchors = li.findElements(By.tagName("a"));
			for (WebElement a : anchors) {
				if (a.getAttribute("title").equals("Nike Strike Serie A Football White-Pink")) {
					a.click();
				}
			}
		}

		
		// driver.findElement(By.xpath(".//*[@id='nav-subnav']/a[3]/span")).click();
		//
		// String main_window = driver.getWindowHandle();
		//
		// Set<String> s1 = driver.getWindowHandles();
		// Iterator<String> I1 = s1.iterator();
		//
		// while (I1.hasNext()) {
		// String child_window = I1.next();
		//
		// if (!main_window.equalsIgnoreCase(child_window)) {
		// driver.switchTo().window(child_window);
		//
		// }
		// }
		// driver.switchTo().window(main_window);

	}

}
