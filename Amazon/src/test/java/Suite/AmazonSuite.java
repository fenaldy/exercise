package Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Factory.DriverFactory;
import Test.AmazonTest;

public class AmazonSuite extends DriverFactory{
	
	AmazonTest amazonTest = new AmazonTest();
	
	@Parameters({"browser"})
	@BeforeSuite
	public void SetUp(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			initialization(browser);
		}
		if(browser.equalsIgnoreCase("chrome")) {
			initialization(browser);
		}
	}
	
	@Test
	public void Test1() {
		amazonTest.AmazonTestScenario();
	}
	
	@AfterSuite
	public void SuiteTearDown() {
		DriverQuit();
	}

}
