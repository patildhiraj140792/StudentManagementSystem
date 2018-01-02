package browsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DynamicHandle {

	WebDriver driver;

	@Test

	public void DynamicTableHandle() {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		String Company = "Magazzini Alimentari Riuniti";
		String Country = "Italy";

		String xpath_start = ".//*[@id='customers']/tbody/tr[";
		String xpath_end = "]/td[2]";

		int i = 2;

		while (isElementPresent(xpath_start + i + xpath_end)) {
			String cmp = driver.findElement(By.xpath(xpath_start + i + xpath_end)).getText();

			if (cmp.equalsIgnoreCase(Company)) {
				System.out.println("company is found check further class name = " + cmp);

				String con = driver.findElement(By.xpath(xpath_start + i + xpath_end.replace("td[2]", "td[3]")))
						.getText();

				if (con.equalsIgnoreCase(Country)) {
					System.out.println("Country is also found=" + con);
				}
			}
			i++;
		}
	}

	public boolean isElementPresent(String elementxpath) {

		int count = driver.findElements(By.xpath(elementxpath)).size();

		if (count == 0)
			return false;
		else
			return true;
	}
}
