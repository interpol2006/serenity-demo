package vn.mycompany.auto.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://accounts.google.com") 
public class LoginPage extends PageObject {

	@FindBy(id="identifierId")
	WebElement emailField ;
	
	@FindBy(xpath="//div[@id='password']/div[@class='LXRPh']/div[@class='dEOOab RxsGPe']")
	WebElement errMsg;
	
	@FindBy(id="identifierNext")
	WebElement signInbtn ;
	
	@FindBy(id="passwordNext")
	WebElement nextbtn ;
	public void enter_email(String email) {
		// TODO Auto-generated method stub
		emailField.sendKeys(email);
	}
	public String getErrMsg() {
		// TODO Auto-generated method stub
		return errMsg.getText();
	}
	public void clickLoginBtn() {
		// TODO Auto-generated method stub
		signInbtn.click();
	}
	public void clickNextBtn() {
		// TODO Auto-generated method stub
		nextbtn.click();
	}
	

}
