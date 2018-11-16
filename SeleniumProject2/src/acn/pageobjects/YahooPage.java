package acn.pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage;
import common.BaseTest;

public class YahooPage extends BasePage{

	public YahooPage(WebDriver driver) {
		super(driver);
	}

	public void clickLoginButton(){
		click("uh-signin", "id");
		BaseTest.log("Clicked signin button...");
	}

	
}
