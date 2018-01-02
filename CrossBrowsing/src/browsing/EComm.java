package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EComm {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		String base_url = "http://automationpractice.com/index.php";

		driver.get(base_url);

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement tshirt = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a"));
		tshirt.click();

		Thread.sleep(2000);

		WebElement check_size = driver.findElement(By.id("layered_id_attribute_group_2"));
		check_size.click();

		Thread.sleep(2000);

		WebElement color = driver.findElement(By.id("layered_id_attribute_group_14"));
		color.click();

		Thread.sleep(2000);

		WebElement coton = driver.findElement(By.id("layered_id_feature_5"));
		coton.click();

		Thread.sleep(2000);

		WebElement properties = driver.findElement(By.id("layered_id_feature_17"));
		properties.click();

		Thread.sleep(2000);

		Actions action = new Actions(driver);

		WebElement drag = driver.findElement(By.xpath(".//*[@id='layered_price_slider']/a[1]"));

		action.clickAndHold(drag).moveByOffset(70, 0).release(drag).build().perform();

		Thread.sleep(2000);

		WebElement drag1 = driver.findElement(By.xpath(".//*[@id='layered_price_slider']/a[2]"));

		action.clickAndHold(drag1).moveByOffset(-30, 0).release(drag).build().perform();

		// Thread.sleep(2000);

		// action.clickAndHold(drag).moveByOffset(-40,
		// 0).release(drag).build().perform();

		// WebElement slider =
		// driver.findElement(By.id("layered_price_slider"));
		// Actions move = new Actions(driver);
		// Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
		// ((Actions) action).perform();
		//
		// WebElement from =
		// driver.findElement(By.xpath(".//*[@id='layered_price_slider']/a[1]"));
		//
		// WebElement To =
		// driver.findElement(By.xpath(".//*[@id='layered_price_slider']/a[1]"));
		//
		// Actions Builder = new Actions(driver);
		//
		// Actions draganddrop = (Actions)
		// Builder.clickAndHold(from).moveToElement(To).release(To).build();
		//
		// draganddrop.perform();
		//

	}

}
