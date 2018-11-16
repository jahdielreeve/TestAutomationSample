package acn.pageobjects;

import org.openqa.selenium.WebDriver;
import common.BasePage;
import common.BaseTest;

public class MercuryPurchase2Page extends BasePage{

	public MercuryPurchase2Page(WebDriver driver) {
		super(driver);
	}
	
	public void clickLogoutButton(){

		click("//td[3]/a/img", "xpath");
		BaseTest.log("Clicked LOG OUT button...");
	}
	
}
