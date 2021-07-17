package PageRepository;

import org.openqa.selenium.By;

import Factory.DriverFactory;
import Utils.WaitUntilElementIsVisible;

public class PageDashboard extends DriverFactory{

	static By registryLinkText = By.linkText("Registry");
	static By dontChangeAddress = By.xpath("//input[@data-action-params='{\"toasterType\":\"AIS_INGRESS\"}']");
	
	public static void clickRegistry() {
		int size = getDriver().findElements(dontChangeAddress).size();
	    if(size!=0){
	    	 getDriver().findElement(dontChangeAddress).click();
	    }
		
		WaitUntilElementIsVisible.wait(registryLinkText);
		getDriver().findElement(registryLinkText).click();
	}
}
