package browsing;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike football shoes men");

		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

		WebElement main_id = driver.findElement(By.id("resultsCol")).findElement(By.tagName("ul"));
		List<WebElement> lis = main_id.findElements(By.tagName("li"));

		for (WebElement li : lis) {
			List<WebElement> anchors = li.findElements(By.tagName("a"));
			for (WebElement a : anchors) {
				if (a.getAttribute("title")
						.equalsIgnoreCase("Nike Men's Black Bravata II FG Football Shoes (844436-001)"))
					;
			}
		}

		String Main_window = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {
			String Child_window = I1.next();

			if (!Main_window.equalsIgnoreCase(Child_window)) {
				driver.switchTo().window(Child_window);

				Select dropdown = new Select(driver.findElement(By.id("quantity")));

				dropdown.selectByIndex(1);

				driver.findElement(By.id("add-to-cart-button")).click();
			}
		}
		driver.switchTo().window(Main_window);

	}

}
