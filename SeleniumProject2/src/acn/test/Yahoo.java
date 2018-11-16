package acn.test;

import org.testng.annotations.Test;

import acn.pageobjects.YahooPage;
import common.BaseTest;
import common.BasePage;

public class Yahoo extends BaseTest {
	
	final public String xcelSheetName = "Yahoo";
	final public String xcelFilePath = "/Users/jahdielreeve/Downloads/Workspace/SeleniumProjectDebug/src/acn/testdata/SampleTestData.xlsx";
	
	@Test
	public void Yahoo() throws Exception{
		
	startTest(xcelFilePath, xcelSheetName);	
	
	YahooPage actions = new YahooPage(driver);
	
	takescreenshot();
	assertElementPresentInPage("uh-signin", "id");
	actions.clickLoginButton();
	takescreenshot();
	
	
	}
	 	  
  }