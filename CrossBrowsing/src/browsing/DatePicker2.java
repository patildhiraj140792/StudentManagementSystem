package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.redbus.in");

		driver.manage().window().maximize();

		// For From and TO
		// --------------------------------------------------------

		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Shirpur");

		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Pune");

		Thread.sleep(3000);

		// For Onward-Date ---------------------------------------------------

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//label[@class='db text-trans-uc']"))));

		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();

		driver.findElement(By.id("rb-calendar_onward_cal")).click();

		List<WebElement> str = driver.findElement(By.tagName("table")).findElements(By.tagName("tr"));

		for (WebElement tr : str) {
			List<WebElement> td1 = tr.findElements(By.tagName("td"));
			for(WebElement td : td1)
			{
				if(td .getAttribute("class").equals(30))
				{
					td.click();
				}
			}
			
		}

		// driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();

		// List<WebElement> alldates =
		// driver.findElements(By.xpath("//table[@class='rb-monthTable first
		// last']//td"));
		//
		// for (WebElement ele : alldates) {
		// String date = ele.getText();
		// if (date.equalsIgnoreCase("28")) {
		// ele.click();
		// break;
		// }
		// }

		// For Search
		// Button-------------------------------------------------------

		WebElement Search_buses = driver.findElement(By.xpath("//button[starts-with(@id, 'search_btn')]"));
		Search_buses.click();
	}
}
