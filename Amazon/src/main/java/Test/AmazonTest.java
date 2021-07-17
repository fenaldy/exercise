package Test;

import Factory.DriverFactory;
import PageRepository.PageDashboard;
import PageRepository.PageRegistry;
import PageRepository.PageResultBirthdayGiftList;

public class AmazonTest {

	public void AmazonTestScenario() {
		DriverFactory.NavigatedToUrl("https://amazon.com/");
		PageDashboard.clickRegistry();
		PageRegistry.verifyNavigatedCorrectlyToRegistryPage();
		PageRegistry.inputName("John");
		PageRegistry.clickRegistryTypeSelectBox();
		PageRegistry.clickBirthdayGiftSelectBox();
		PageRegistry.clickSearchButton();
		PageResultBirthdayGiftList.verifySearchResultShowingProperlyAsExpected("John");
		PageResultBirthdayGiftList.clickdateRangeMonthFrom();
		PageResultBirthdayGiftList.clickFromJanuary();
		PageResultBirthdayGiftList.clickdateRangeYearFrom();
		PageResultBirthdayGiftList.clickFromYear();
		PageResultBirthdayGiftList.clickdateRangeMonthTo();
		PageResultBirthdayGiftList.clickToApril();
		PageResultBirthdayGiftList.clickdateRangeYearTo();
		PageResultBirthdayGiftList.clickToYear();
		PageResultBirthdayGiftList.clicksearchFilterBtn();
	}
	
}
