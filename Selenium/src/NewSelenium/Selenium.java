package NewSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	public static void main(String[]args)
	{
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("Title is"+title);
		
		String url=driver.getCurrentUrl();
		System.out.println("url is-" +url);
}
}
