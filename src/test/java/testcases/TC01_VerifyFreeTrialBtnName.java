package testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import pages.LandingPage;
import utils.BasePage;

public class TC01_VerifyFreeTrialBtnName  extends BasePage{

	@Test(priority = 1)
	public void verifyCompanyLogo() {
		LandingPage lanPgObj = PageFactory.initElements(driver, LandingPage.class);
		lanPgObj.FreetrialBtn();
	
	}

}
