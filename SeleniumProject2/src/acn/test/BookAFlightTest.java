package acn.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import acn.pageobjects.MercuryPurchase2Page;
import acn.pageobjects.MercuryPurchasePage;
import acn.pageobjects.MercuryReservation2Page;
import acn.pageobjects.MercuryReservationPage;
import acn.pageobjects.MercuryWelcomePage;
import common.BaseTest;

public class BookAFlightTest extends BaseTest { 
	
	final public String xcelFilePath = "/Users/jahdielreeve/Downloads/Workspace/SeleniumProjectDebug/src/acn/testdata/SampleTestData.xlsx"; 
	final public String xcelSheetName = "Mercury Tours";
	
		  @Test
	 	  public void BookAFlight() throws Exception{
			  
		  startTest(xcelFilePath, xcelSheetName);	
			
			MercuryWelcomePage login = new MercuryWelcomePage(driver);
			takescreenshot();
			login.enterUsername(2);
			login.enterPasword(3); 
			login.clickSignInButton();
			
			MercuryReservationPage reserve1 = new MercuryReservationPage(driver);
			takescreenshot();
			
			//verify page message message
			assertTextPresentInElement("//div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font", "xpath", 4);
			reserve1.selectAirline(5); 
			reserve1.clickContinueButton();
			
			MercuryReservation2Page reserve2 = new MercuryReservation2Page(driver);
			takescreenshot();
			
			//verify the flight destination
			assertTextPresentInElement("//div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font", "xpath", 6); 
			reserve2.clickContinueButton(); 
			
			MercuryPurchasePage purchase = new MercuryPurchasePage(driver);
			takescreenshot();
			
			//verify the Secure Purchase Button if present
			assertElementPresentInPage("buyFlights", "name"); 
			purchase.enterFirstName(7);
			purchase.enterLastName(8); 
			purchase.enterCreditCardNumber(9);
			purchase.clickSecurePurchase(); 
			
		
			MercuryPurchase2Page purchase2 = new MercuryPurchase2Page(driver);
			takescreenshot();
			
			//verify the flight booking is successful
			assertTextPresentInElement("//div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]", "xpath", 10); 
			
			//verify print button
			assertElementPresentInPage("//div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[1]/img", "xpath"); 
			
			//verify the total payment
			assertTextPresentInElement("//tr[12]/td", "xpath", 12); 
	
//			assertTextPresentInElement("//div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[1]/td[2]/font/font/font/b/font", "xpath", 11); 
//			assertTextPresentInElement("//div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font", "xpath", 12); 
			
//			String value = driver.findElement(By.xpath("//tr[12]/td")).getText();
//			System.out.println(value);
			
			purchase2.clickLogoutButton();

 		  
	 	  }
  }

