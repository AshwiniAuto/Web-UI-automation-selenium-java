package stepdefinition;

import hooks.HooksHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MobileInputInvntoryPage;


public class MobileInputInventoryDef {
	
	MobileInputInvntoryPage  mobileInputInvntoryPage = new MobileInputInvntoryPage	(HooksHandler.androidDriver);
	
	
	@Given("Click on Input Inventory icon")
	public void click_on_input_inventory_icon() {
		mobileInputInvntoryPage.clickInputInventoryicon();
	}
	
	@Then("Should be displayed the Input Inventory page")
	public void should_be_displayed_the_input_inventory_page() {
	}
	
	@Then("Click on Drop Down button")
	public void click_on_drop_down_button() {
		mobileInputInvntoryPage.clickDropDownbutton();
	}
	
	@Then("Click on MD SHAHNAWAZ IMAM Name option")
	public void click_on_md_shahnawaz_imam_name_option() {
		mobileInputInvntoryPage.ClickMDSHAHNAWAZIMAMNameoption();
	}
	
	@Then("Enter the input Name {string}")
	public void enter_the_input_name(String string) {
		mobileInputInvntoryPage.enterInputName();
	}
	
	@Then("Click on the input check box")
	public void click_on_the_input_check_box() throws InterruptedException {
		mobileInputInvntoryPage.clickInputcheckbox();
	}
	
	@Then("Should displayed the Action button on hilighted form")
	public void should_displayed_the_action_button_on_hilighted_form() {
	}
	
	@Then("Enter the input number")
	public void enter_the_input_number() {
		mobileInputInvntoryPage.enterInputnumber();
	}
	
	@Then("Click on Transfer Input button")
	public void click_on_transfer_input_button() {
		mobileInputInvntoryPage.clickTransferInputbutton();
	}
	
	@Then("should Displayed the Transfer Input pop-up window")
	public void should_displayed_the_transfer_input_pop_up_window() {
	}
	
	@Then("Click on the Select drop down button")
	public void click_on_the_select_drop_down_button() {
		mobileInputInvntoryPage.clickSelectdropdownbutton();
	}
	
	@Then("Click on the Any Employee name {string}")
	public void click_on_the_any_employee_name(String string) {
		mobileInputInvntoryPage.clickAnyEmployeename();
	}
	
	@Then("Click on the Remark tab")
	public void click_on_the_remark_tab() {
		mobileInputInvntoryPage.clickRemarktab();
	}
	
	@Then("Enter the any remark name {string}")
	public void enter_the_any_remark_name(String string) {
		mobileInputInvntoryPage.enterRemarkname();
	}
	
	@Then("Click on the Submit Button")
	public void click_on_the_submit_button() {
		mobileInputInvntoryPage.clickSubmitButton();
	}
	
	@Then("Should Displayed the Thanku You pop-up message window")
	public void should_displayed_the_thanku_you_pop_up_message_window() {
	}
	
	@Then("Click on the Thank You Button")
	public void click_on_the_thank_you_button() {
		mobileInputInvntoryPage.clickThankYouButton();
	}
	
	@Then("Should Displayed The Dashboard page")
	public void should_displayed_the_dashboard_page() {
	}
	
	@Then("Click on View Agenda Button")
	public void click_on_view_agenda_button() {
		mobileInputInvntoryPage.clickViewAgendaButton();
	}
	
	@Then("Click on Doctor profile Name")
	public void click_on_doctor_profile_name() {
		mobileInputInvntoryPage.clickDoctorprofileName();
	}
	
	@Then("Should Diplayed the Doctor {int} view")
	public void should_diplayed_the_doctor_view(Integer int1) {
	}
	
	@Then("Should Displayed the Brand Page")
	public void should_displayed_the_brand_page() {
	}
	
	@Then("Click on Next Button")
	public void click_on_next_button() {
		mobileInputInvntoryPage.clickNextButton();
	}
	
	@Then("Check the Transfer Inputs balance same shows in the Input Inventory Tab")
	public void check_the_transfer_inputs_balance_same_shows_in_the_input_inventory_tab() {
	}

}
