package acn.pageobjects;

import org.openqa.selenium.WebDriver;
import common.BasePage;
import common.BaseTest;

public class GooglePage extends BasePage{


	public GooglePage(WebDriver driver) {
		super(driver);
	}

	
	public void enterSearchBar(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("q", "name", value);
		BaseTest.log("Entered value in google search bar...");
	}	
	
	
	public void clickSearchButton(){

		click("//input[@value='Google Search']", "xpath");
		BaseTest.log("Clicked search button...");
	}
	
	
	public void writeTestData(String xcelFilePath, String locator, String locType, String rowName,int colNumberToWrite) throws Exception {
		int currow = BaseTest.getRowContains(0, rowName);//gets the row number needed using test case name
		System.out.println("current row is "+currow);
		String text = findElement(locator, locType).getText();
		BaseTest.log("text from element: "+text);
		BaseTest.setCellValue(xcelFilePath, currow, colNumberToWrite, text);		
		BaseTest.log("wrote the text in excel");	
		
	}

		
		

	
}




