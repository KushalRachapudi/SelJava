package testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import pages.LandingPage;
import utils.BasePage;

public class TC02_VerifyPageTitle  extends BasePage{


	@Test(priority = 2)
	public void verifypagetile() throws Exception {
		LandingPage lanPgObj = PageFactory.initElements(driver, LandingPage.class);
		lanPgObj.pageTitle();
	
	}

}
