package stepDefinations;


import org.openqa.selenium.WebDriver;

import commonMethods.SeleniumSpecificMethods;
import io.cucumber.java.en.*;
import pages_objects.HomePage;
import pages_objects.SeleniumTestExamplesPage;
import utility.DriverManager;


public class DataDriven_SD {
	
	
	
	@Given("user is on {string} page")
	public void user_is_on_home_page_with_title(String expectedPageTitle) {
		
		System.out.println("given");
		SeleniumSpecificMethods.validate_PageTitle(expectedPageTitle);
	}
	
	
	@When("user clicks on {string} page")
	
	public void user_clicks_on_page(String string) {
		System.out.println("when");
	    
	  HomePage obj_HomePage=new HomePage(DriverManager.getDriver());
	    obj_HomePage.click_link();
	}
	@When("user enters names on text box and clicks on Submit button")
	public void user_enters_on_text_box_and_clicks_on_button() {
		System.out.println("when");

	SeleniumTestExamplesPage obj_SeleniumTestExamplesPage=new SeleniumTestExamplesPage(DriverManager.getDriver());
	obj_SeleniumTestExamplesPage.fillTheForm();
	}
	
	@When("user enters names on text box as per {int} and clicks on Submit button")
	public void user_enters_names_on_text_box_as_per_and_clicks_on_submit_button(Integer rowNumber) {
		
		System.out.println("user is on*************user enters names on text box as per {int} and clicks on Submit button ");
		SeleniumTestExamplesPage obj_SeleniumTestExamplesPage=new SeleniumTestExamplesPage(DriverManager.getDriver());
		obj_SeleniumTestExamplesPage.filltheForm(rowNumber);
		
		
	}
	

}
