package PageRepository;

import org.openqa.selenium.By;

import Factory.DriverFactory;
import Utils.WaitUntilElementIsVisible;

public class PageRegistry extends DriverFactory{
	
	static By registryGiftTxt = By.xpath("//div[normalize-space()='Registry & Gifting']");
	static By nameTxtBox = By.name("name");
	static By registrysSelectBox = By.id("a-autoid-0-announce");
	static By birthdayGiftList = By.id("dropdown1_2");
	static By searchBtn = By.xpath("//button[normalize-space()='Search']");

	public static void verifyNavigatedCorrectlyToRegistryPage() {
		WaitUntilElementIsVisible.wait(registryGiftTxt);
		getDriver().findElement(registryGiftTxt).isDisplayed();
	}
	
	public static void inputName(String name) {
		WaitUntilElementIsVisible.wait(nameTxtBox);
		getDriver().findElement(nameTxtBox).sendKeys(name);
	}
	
	public static void clickRegistryTypeSelectBox() {
		WaitUntilElementIsVisible.wait(registrysSelectBox);
		getDriver().findElement(registrysSelectBox).click();
	}
	
	public static void clickBirthdayGiftSelectBox() {
		WaitUntilElementIsVisible.wait(birthdayGiftList);
		getDriver().findElement(birthdayGiftList).click();
	}
	
	public static void clickSearchButton() {
		WaitUntilElementIsVisible.wait(searchBtn);
		getDriver().findElement(searchBtn).click();
	}

}
