package vn.mycompany.auto.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import vn.mycompany.auto.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	LoginPage loginPage;

	@Step
	public void open_home_page() {
		// call open browser function
		loginPage.open();
	}

	@Step
	public void input_email(String email) {
		loginPage.enter_email(email);

	}

	@Step
	public String getAlertMsg() {
		// TODO Auto-generated method stub
		return loginPage.getErrMsg();
	}
	
	@Step
	public void click_on_login_btn() {
		loginPage.clickLoginBtn();
		
	}
	
	@Step
	public void click_on_next_btn() {
		
		loginPage.clickNextBtn();
	}

	

}
