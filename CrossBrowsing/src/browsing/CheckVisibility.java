package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckVisibility {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String Expected_title = "Google";

		String Actual_title = driver.getTitle();

		if (Expected_title.equals(Actual_title)) {
			System.out.println("Title is Successfully Verify");
		} else {
			System.out.println("Title is Not Successfully Verify");
		}

		boolean SubmitButtonisPresence = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]"))
				.isDisplayed();
		System.out.println(SubmitButtonisPresence);

		WebElement TextBox = driver.findElement(By.id("gs_htif0"));
		TextBox.sendKeys("Selenium");

		boolean searchiconpresence = driver.findElement(By.name("Google Search")).isDisplayed();

		boolean searchiconEnable = driver.findElement(By.name("Google Search")).isEnabled();

		if (searchiconpresence == true && searchiconEnable == true) {
			WebElement searchIcon = driver.findElement(By.name("Google Search"));
			searchIcon.click();
		}

		
	}

}
