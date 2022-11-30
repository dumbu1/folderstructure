package stepDefinations;

import io.cucumber.java.en.When;
import pages.HomePage;
import utility.DriverManager;

public class HomePage_SD {
	
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String login) {
		HomePage obj_HomePage=new HomePage(DriverManager.getDriver());
		obj_HomePage.click_Login();
		
	}

}
