package acn.pageobjects;

import org.openqa.selenium.WebDriver;
import common.BasePage;
import common.BaseTest;

public class MercuryReservationPage extends BasePage{

	public MercuryReservationPage(WebDriver driver) {
		super(driver);
	}

	public void selectAirline(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		selectDropdownByVisibleText("airline", "name", value);
		BaseTest.log("Selected value in Airline...");
	}	
		
	public void clickContinueButton(){

		click("findFlights", "name");
		BaseTest.log("Clicked Continue button...");
	}
	
}
