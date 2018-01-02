package browsing;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlePractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		String base_url = "http://toolsqa.com/automation-practice-switch-windows/";

		driver.get(base_url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		WebElement buttons = driver.findElement(By.tagName("button"));
//		System.out.println("All Buttons = "+buttons.getSize());
		
		driver.findElement(By.linkText("New Browser Window")).click();
		

		driver.getTitle();
		
		String Main_window = driver.getWindowHandle();

		Set<String> S1 = driver.getWindowHandles();
		Iterator<String> I1 = S1.iterator();

		while (I1.hasNext()) {
			String Child_Window = I1.next();
			if (!Main_window.equalsIgnoreCase(Child_Window))
				;
			{
				driver.switchTo().window(Child_Window);
				System.out.println("We are in child window");

				driver.close();
			}

		}
		driver.switchTo().window(Main_window);
		

	}

}
