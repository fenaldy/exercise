package PageRepository;

import org.openqa.selenium.By;
import org.testng.Assert;

import Factory.DriverFactory;
import Utils.WaitUntilElementIsVisible;

public class PageResultBirthdayGiftList extends DriverFactory{
	
	static By resultTxt = By.id("gr-search-result-title-id");
	static By dateRangeMonthFrom = By.id("a-autoid-1-announce");
	static By dateRangeYearFrom = By.id("a-autoid-2-announce");
	static By dateRangeMonthTo = By.id("a-autoid-3-announce");
	static By dateRangeYearTo = By.id("a-autoid-4-announce");
	static By fromJanuary = By.id("gr-search-from-month-dropdown_1");
	static By fromYear = By.id("gr-search-from-year-dropdown_3");
	static By toApril = By.id("gr-search-to-month-dropdown_4");
	static By toYear = By.id("gr-search-to-year-dropdown_3");
	static By searchFilterBtn = By.className("a-button-input");

	public static void verifySearchResultShowingProperlyAsExpected(String exp) {
		WaitUntilElementIsVisible.wait(resultTxt);

		Assert.assertEquals(getDriver().findElement(resultTxt).getText(), "Search results for \""+exp+"\"");
	}
	
	public static void clickdateRangeMonthFrom() {
		getDriver().findElement(dateRangeMonthFrom).click();
	}
	
	public static void clickdateRangeYearFrom() {
		getDriver().findElement(dateRangeYearFrom).click();
	}
	
	public static void clickdateRangeMonthTo() {
		getDriver().findElement(dateRangeMonthTo).click();
	}
	
	public static void clickdateRangeYearTo() {
		getDriver().findElement(dateRangeYearTo).click();
	}
	
	public static void clickFromJanuary() {
		WaitUntilElementIsVisible.wait(fromJanuary);
		getDriver().findElement(fromJanuary).click();
	}
	
	public static void clickFromYear() {
		WaitUntilElementIsVisible.wait(fromYear);
		getDriver().findElement(fromYear).click();
	}
	
	public static void clickToApril() {
		WaitUntilElementIsVisible.wait(toApril);
		getDriver().findElement(toApril).click();
	}
	
	public static void clickToYear() {
		WaitUntilElementIsVisible.wait(toYear);
		getDriver().findElement(toYear).click();
	}
	
	public static void clicksearchFilterBtn() {
		getDriver().findElement(searchFilterBtn).click();

	}

}
