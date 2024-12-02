package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.LoginAppRHPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSuite {

	@Given("Admin is on login page")
	public void admin_is_on_login_page() {
		Config.driver=new ChromeDriver();
		
		Config.ConfChrome();
		
		Config.maximize();
		
		String url="http://192.168.1.58/csi_rh_final/public/login";
		
		 Config.driver.get(url);
	}

	@When("Admin Enter correct username {string} and correct password {string}")
	public void admin_enter_correct_username_and_correct_password(String x, String y) {
		LoginAppRHPage page=new LoginAppRHPage();
		page.connect(x, y);
	    
	}

	@Then("Admin is directed to the home page {string}")
	public void admin_is_directed_to_the_home_page(String Dashboard) {
		LoginAppRHPage page=new LoginAppRHPage();
		page.verifTitleS(Dashboard);
	}

	@When("Admin enter correct username {string} and incorrect password {string}")
	public void admin_enter_correct_username_and_incorrect_password(String x, String n) {
		LoginAppRHPage page=new LoginAppRHPage();
		page.connect(x, n);
	}

	@Then("admin is still on loginpage {string}")
	public void admin_is_still_on_loginpage(String Oops) {
		LoginAppRHPage page=new LoginAppRHPage();
		page.verifTitlesD(Oops);
	}	
	
}
