package acn.pageobjects;

import org.openqa.selenium.WebDriver;
import common.BasePage;
import common.BaseTest;

public class MercuryWelcomePage extends BasePage{

	public MercuryWelcomePage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("userName", "name", value);
		BaseTest.log("Entered value in Userame field...");
	}	
	
	public void enterPasword(int colNum) throws Exception{
		
		String value = BaseTest.getCellData(BaseTest.TestCaseRow, colNum);
		enterText("password", "name", value);
		BaseTest.log("Entered value in Password field...");
	}
	
	public void clickSignInButton(){

		click("login", "name");
		BaseTest.log("Clicked Sign-In button...");
	}
	
}
