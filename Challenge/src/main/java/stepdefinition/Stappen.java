package stepdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class Stappen {

	WebDriver driver;
	
	@Given ("^I am on the homepage$")
	public void I_am_on_the_homepage() throws Throwable{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
	
	 
}
