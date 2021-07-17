package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	static WebDriver driver;
	
	public void initialization(String browser) {
		
		//to support multi browser
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	public static void NavigatedToUrl(String url) {
		driver.get(url);
	}
	
	public void DriverQuit() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
