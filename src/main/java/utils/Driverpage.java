package utils;

import org.openqa.selenium.WebDriver;

public class Driverpage {

	protected static WebDriver driver;
	
	
	public Driverpage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
}
