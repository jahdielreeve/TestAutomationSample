package acn.test;

import org.testng.annotations.Test;

import acn.pageobjects.GooglePage;
import common.BasePage;
import common.BaseTest;

public class GoogleTest extends BaseTest {
	
	final public String xcelSheetName = "Sample Sheet";
	final public String xcelFilePath = "/Users/jahdielreeve/Downloads/Workspace/SeleniumProjectDebug/src/acn/testdata/SampleTestData.xlsx";
	
	
	@Test
	public void Googletest() throws Exception{
		
		
	startTest(xcelFilePath, xcelSheetName);	
	
	GooglePage actions = new GooglePage(driver);
	
	takescreenshot();
	assertElementPresentInPage("q", "name");
	actions.enterSearchBar(2);
	takescreenshot();
	actions.clickSearchButton();
	//Thread.sleep(5000);
	//assertTextPresentInElement("//div[@role='heading']/div", "xpath", 3);
	//takescreenshot();
	
	actions.writeTestData(xcelFilePath, "//span[@class='abs']", "xpath", "GoogleTest", 4);
	
	}
	 	  
  }







