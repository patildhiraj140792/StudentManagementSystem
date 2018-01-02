package browsing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Radio Button

		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));

		for (int i = 0; i < radio.size(); i++) {
			WebElement local_radio = radio.get(i);

			String value = local_radio.getAttribute("value");

			System.out.println("Values from radio button======>>>>" + value);

			if (value.equalsIgnoreCase("Java")) {
				local_radio.click();
			}

			// CheckBoxes

			List<WebElement> chk_bx = driver.findElements(By.xpath(".//*[@type='checkbox']"));

			for (int j = 0; j < chk_bx.size(); j++) {
				WebElement local_chk = chk_bx.get(i);

				String id = local_chk.getAttribute("id");

				if (id.equalsIgnoreCase("code")) {
					local_chk.click();
					break;
				}
			}
		}
	}
}
