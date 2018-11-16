package acn.pageobjects;

import org.openqa.selenium.WebDriver;
import common.BasePage;
import common.BaseTest;

public class MercuryPurchasePage extends BasePage{

	public MercuryPurchasePage(WebDriver driver) {
		super(driver);
	}

	public void enterFirstName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("passFirst0", "name", value);
		BaseTest.log("Entered value in First Name field...");
	}	
	
	public void enterLastName(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("passLast0", "name", value);
		BaseTest.log("Entered value in Last Name field...");
	}
	
	public void enterCreditCardNumber(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("creditnumber", "name", value);
		BaseTest.log("Entered value in Credit Card Number field...");
	}
	
	public void clickSecurePurchase(){

		click("buyFlights", "name");
		BaseTest.log("Clicked Secure Purchase button...");
	}
	
}
