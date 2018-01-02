package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/#default");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		Actions act = new Actions(driver);

		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());

		driver.switchTo().frame(iframe);

		WebElement from = driver.findElement(By.id("draggable"));
		System.out.println(from.getLocation());

		WebElement to = driver.findElement(By.id("droppable"));
		System.out.println(to.getLocation());

		act.dragAndDrop(from, to).build().perform();

	}

}
