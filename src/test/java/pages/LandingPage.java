package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.Driverpage;

public class LandingPage extends Driverpage {

	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriverWait wait = new WebDriverWait(driver, 20);

	// POM definitions
	// @FindBy(xpath = "//a[normalize-space()='Free trial']")
	//@FindBy(xpath = "//a[contains(text(),'Free trial')]")
	@FindBy(xpath = "//a[@title='Free Trial']")
	

	private WebElement freeTrialBtn;

	@FindBy(css = "ul.footer-nav li a")
	private WebElement footerLinks;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement accpetAllBtn;

	public void FreetrialBtn()  {
		try {
			Thread.sleep(2000);
			String actBtnName = freeTrialBtn.getText();
			System.out.println("The size of the btn is: " + freeTrialBtn.getSize());
			System.out.println("The actual btn name is:  " + actBtnName);
			if(freeTrialBtn.isDisplayed()) {
				System.out.println("Btn displayed");
				System.out.println("The location of the btn is : " +freeTrialBtn.getLocation());
			}
			else {
				System.out.println("Btn not displayed");
			}
			
			Assert.assertEquals(actBtnName, "Free trial");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void pageTitle() throws Exception {
		Thread.sleep(2000);
		String actPageTitle = driver.getTitle();
		System.out.println("The page title is: " + actPageTitle);
		if(actPageTitle.equalsIgnoreCase("Innovative Software for Business Needs | Freshworks")) {
			System.out.println("Coorect Page header");
			Assert.assertEquals(actPageTitle, "Innovative Software for Business Needs | Freshworks");
		}
		else {
			System.out.println("Wrong page header");
		}
	}

	public void acceptCookiesBtn() {

		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
		if (accpetAllBtn.isDisplayed()) {
			System.out.println("The accept all btn is present");
			accpetAllBtn.click();
		} else {
			System.out.println("The accept all btn is present not found");
		}
	}
}
