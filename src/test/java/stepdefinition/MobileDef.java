package stepdefinition;


import hooks.HooksHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MobilePage;

public class MobileDef {
	
	MobilePage mobilePage = new MobilePage(HooksHandler.androidDriver);

	@Given("Click on application icon, it should be opened")
	public void click_on_appliconton_icon_it_should_be_opened() {

	}

	@When("Enter mobile number {string}")
	public void enter_mobile_number(String number) {
		mobilePage.enterMobileNumber(number);	
	
	}

	@When("Click on Send OTP button")
	public void click_on_send_otp_button() {
		mobilePage.clickSendOTPButton(null);
	}
	
	@Then("OTP should be appeared {string}")
	public void otp_should_be_appeared(String string) {
		mobilePage.apearOtpNumber("152535");
	}

	@Then("Click on verify button")
	public void click_on_verify_button() {
		mobilePage.clickOnVerifyButton(null);
	}

}
