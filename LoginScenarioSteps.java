package vn.mycompany.auto;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import vn.mycompany.auto.steps.LoginSteps;
public class LoginScenarioSteps {
	@Steps
	LoginSteps loginSteps ;
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
	   loginSteps.open_home_page();
	}

	@When("^I input my account is \"([^\"]*)\"$")
	public void i_input_my_account_is(String email) throws Throwable {
	   loginSteps.input_email(email);
	}
	
	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    loginSteps.click_on_login_btn();
	}
	
	@When("^I click on next button$")
	public void i_click_on_next_button() throws Throwable {
	    loginSteps.click_on_next_btn();
	}
	
	@Then("^I should see alert message \"([^\"]*)\"$") 
	public void i_should_see_alert_message(String msg) throws Throwable {
	   Assert.assertEquals(loginSteps.getAlertMsg(), msg);
	}

}
