package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.DriverFactory;

public class WaitUntilElementIsVisible extends DriverFactory{

	public static WebElement el;
	public static WebDriverWait wait;

	//explicit wait implementation
	public static WebElement wait(By element) {
		wait  = new WebDriverWait(getDriver(), 30);
		
		el = wait.until(ExpectedConditions.visibilityOfElementLocated(element));

		return el;
	}
}
