package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeProject {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		String base_url = "http://www.practiceselenium.com/welcome.html";

		driver.get(base_url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement click = driver
				.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[2]/a"));
		click.click();

		driver.navigate().back();

		WebElement click_Menu = driver
				.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[3]/a"));
		click_Menu.click();

		WebElement click_on_Checkout = driver
				.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000451959280']/span"));
		click_on_Checkout.click();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("qwerty@gmail.com");

		WebElement Full_name = driver.findElement(By.id("name"));
		Full_name.sendKeys("Qwertyuiop Lkjhgfdsa");

		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("79, Michel Jordan, Palo Alto, California, USA ");

		Select s1 = new Select(driver.findElement(By.id("card_type")));
		s1.selectByVisibleText("Visa");
		// s1.selectByIndex(1);

		WebElement card_number = driver.findElement(By.id("card_number"));
		card_number.sendKeys("0987654321");

		WebElement card_holder_name = driver.findElement(By.id("cardholder_name"));
		card_holder_name.sendKeys("Qwertyuiop Lkjhgfdsa");

		if (!Full_name.equals(card_holder_name)) {
			System.out.println("Name Is not match as per full name");
		} else {
			System.out.println("Name is match as per full name");
		}
		
		WebElement Veri_code = driver.findElement(By.id("verification_code"));
		Veri_code.sendKeys("123456");
		
		driver.close();
		

	}

}
