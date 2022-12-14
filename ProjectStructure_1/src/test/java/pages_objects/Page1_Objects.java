package pages_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSpecificMethods;
import utility.DriverManager;


public class Page1_Objects {
	
	WebDriver driver;
	public Page1_Objects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	/*public static HomePage getInstance() {
		return new HomePage(DriverManager.getDriver());
	}*/
	
	@FindBy(xpath = "//a[contains(text(),'Selenium Example Page')]")
	private WebElement link_Selenium_Example_Page;
	
	
	
	
	
	
	public void click_link() {
		SeleniumSpecificMethods.click(link_Selenium_Example_Page);
	}
	
}
