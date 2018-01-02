package browsing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;

public class SetAttribute {

	public static void Setattribute(WebElement element, String attributename, String value)
	{
		WrapsDriver wrappedelement = (WrapsDriver)element;
		
		JavascriptExecutor driver = (JavascriptExecutor)wrappedelement.getWrappedDriver();
		
		driver.executeScript("arguments[0].setAttribute(argument[1].argument[2])", element, attributename,value);
	}
}
