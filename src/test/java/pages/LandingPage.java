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

public class LandingPage  extends Driverpage{

	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 20);

	// POM definitions
	@FindBy(xpath = "//a[normalize-space()='Free trial']")
		private WebElement freeTrialBtn;
		
		@FindBy(css = "ul.footer-nav li a")
		private WebElement footerLinks;
		
		@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
		private WebElement accpetAllBtn;
		
		
		
		public void FreetrialBtn() {
			String actBtnName = freeTrialBtn.getText();
			System.out.println("The actual btn name is:  " + actBtnName);
			Assert.assertEquals(actBtnName, "Free trial");
		}
		
		public void pageTitle() {
			String actPageTitle = driver.getTitle();
			System.out.println("The page title is: " + actPageTitle);
			Assert.assertEquals(actPageTitle, "Innovative Software for Business Needs | Freshworks");
		}
		
		public void acceptCookiesBtn() {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
			if(accpetAllBtn.isDisplayed()) {
				System.out.println("The accept all btn is present");
				accpetAllBtn.click();
			}
			else {
				System.out.println("The accept all btn is present not found");
			}
		}
}
