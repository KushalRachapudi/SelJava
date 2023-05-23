package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	protected WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setupBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		
			
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("start-maximized"); 
			 * options.addArguments("headless");
			 * options.addArguments("window-size=1920x1080"); 
			 * driver = new ChromeDriver(options);
			 */
			
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("--headless=new"); driver = new ChromeDriver(options);
			 */
			
			
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
