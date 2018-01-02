package browsing;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsFind {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.irctc.co.in");
		driver.get("http://gcrit.com/build3/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// ----------------------**************--------------------------------

		// boolean site_exits =
		// driver.findElement(By.linkText("Gmail")).isDisplayed();
		//
		// if(site_exits==true)
		// {
		// System.out.println("Site is displayed");
		// }
		// else{
		// System.out.println("Site is Disapper");
		// }

		// -------------------------------------**********************---------------------------

		// WebElement username = driver.findElement(By.id("usernameId"));
		// username.sendKeys("gcreddy7");
		//
		// WebElement password =
		// driver.findElement(By.xpath("//input[@class='loginPassword' and
		// @type='password']"));
		// password.sendKeys("gld938");
		//
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter Captcha");
		// String captcha = scan.nextLine();
		//
		// WebElement Sendkeys_captcha =
		// driver.findElement(By.xpath("//input[@class='loginCaptcha' and
		// @type='text']"));
		// Sendkeys_captcha.sendKeys(captcha);
		//
		// WebElement login = driver.findElement(By.id("loginbutton"));
		// login.click();
		//
		// String Current_url = driver.getCurrentUrl();
		//
		// if (Current_url.equals("https://www.irctc.co.in/eticketing/home")) {
		// System.out.println("URL is Match");
		// } else {
		// System.out.println("URL doesn't match");
		// }
		//
		// driver.close();

		List<WebElement> uibuttons = driver.findElements(By.xpath("//span[@class='ui-button-text' ]"));

		for (int i = 0; i < uibuttons.size(); i++) {
			WebElement buttons = uibuttons.get(i);
			String button_class = buttons.getText();
			if (button_class.equalsIgnoreCase("My Account")) {
				buttons.click();
			}
		}

		Thread.sleep(3000);
		
		List<WebElement> uibuttons2 = driver.findElements(By.xpath("//span[@class='ui-button-text' ]"));

		for (int i = 0; i < uibuttons2.size(); i++) {
			WebElement buttons2 = uibuttons2.get(i);
			String button_class2 = buttons2.getText();
			if (button_class2.equalsIgnoreCase("Continue")) {
				buttons2.click();
			}
		}

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='radio' and @name='gender']"))));
		
		List<WebElement> Gender = driver.findElements(By.xpath("//input[@type='radio' and @name='gender']"));

		for (int j = 0; j < Gender.size(); j++) {
			WebElement MF = Gender.get(j);
			String Value = MF.getAttribute("value");
			if (Value.equalsIgnoreCase("Male ")) {
				MF.click();
			}
		}
		
		Thread.sleep(3000);
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("XYZ");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.sendKeys("qwert");
		
		WebElement DOB = driver.findElement(By.id("dob"));
		DOB.click();
		
		Thread.sleep(3000);
		
		Select month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByIndex(6);
		
		Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,750)", "");
		
		year.selectByIndex(75);
		
		

	}

}
