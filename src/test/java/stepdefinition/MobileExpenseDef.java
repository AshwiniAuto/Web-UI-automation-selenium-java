package stepdefinition;

import hooks.HooksHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MobileExpensePage;

public class MobileExpenseDef {
	
	MobileExpensePage mobileExpensePage = new MobileExpensePage(HooksHandler.androidDriver);

	
	@Given("Click on Expense icon")
	public void click_on_expense_icon() {
		mobileExpensePage.clickExpenseicon();
	}
	
	@Then("Should display the expense page")
	public void should_display_the_expense_page() {
	}
	
	@Then("Click on Name drop down button")
	public void click_on_name_drop_down_button() {
		mobileExpensePage.clickNamedropdownbutton();
	}
	
	@Then("Click on {int} option")
	public void click_on_option(String string) {
		mobileExpensePage.clickMyselfoption();
	}
	
	@Then("Click on {int} bar chart")
	public void click_on_bar_chart(String string) {
		mobileExpensePage.clickJan2024barchart();
	}
	
	@Then("Should displayed the {string} Expense list")
	public void should_displayed_the_expense_list(String string) {
	}
	
	@Then("Click on Check Box")
	public void click_on_check_box() {
		mobileExpensePage.clickCheckBox();
	}
	
	@Then("Click on Submit Expenses button")
	public void click_on_submit_expenses_button() {
		mobileExpensePage.clickSubmitExpensesbutton();
	}
	
	@Then("Should Displayed Same Page")
	public void should_displayed_same_page() {
	}
	
	@Then("Click on user Drop Down Button to Select Employee name")
	public void click_on_user_drop_down_button_to_select_employee_name() {
		mobileExpensePage.clickUserDropDownButtontoSelectEmployeename();
	}
	
	@Then("Click On Employee name {int}")
	public void click_on_employee_name(String string) {
		mobileExpensePage.clickEmployeeNameArpanBezbaruah();
	}
	
	@Then("Click on Employee expense Bar chart of {string}")
	public void click_on_employee_expense_bar_chart_of(String string) {
		mobileExpensePage.clickEmployeeExpenseBarchartofJan2024();
	}
	
	@Then("Click on Expense list Check Box")
	public void click_on_expense_list_check_box() {
		mobileExpensePage.clickExpenselistCheckBox();
	}
	
	@Then("Click on Expense list view button")
	public void click_on_expense_list_view_button() {
		mobileExpensePage.clickExpenselistviewbutton();
	}
	
	@Then("Should displayed the Employee same date page")
	public void should_displayed_the_employee_same_date_page() {
	}
	
	@Then("Click on View DAR Report")
	public void click_on_view_dar_report() {
		mobileExpensePage.clickViewDARReport();
	}
	
	@Then("Click on DRA activity report cross button")
	public void click_on_dra_activity_report_cross_button() {
		mobileExpensePage.clickDRAactivityReportCrossButton();
	}
	
	@Then("Click on Edit TA Button")
	public void click_on_edit_ta_button() {
		mobileExpensePage.clickEditTAButton();
	}
	
	@Then("Should displayed the Approved amount pop-up window")
	public void should_displayed_the_approved_amount_pop_up_window() {
	}
	
	@Then("Click on Amount Tab")
	public void click_on_amount_tab() {
		mobileExpensePage.clickAmountTab();
	}
	
	@Then("Enter the amount {int}")
	public void enter_the_amount(String string) {
		mobileExpensePage.enterTheAmount444();
	}
	
	@Then("Click On Enter note Tab")
	public void click_on_enter_note_tab() {
		mobileExpensePage.clickEnternoteTab();
	}
	
	@Then("Enter note {int}")
	public void enter_note(String string) {
		mobileExpensePage.enterNoteTest();
	}
	
	@Then("Should Displayed the Amount Edited Message")
	public void should_displayed_the_amount_edited_message() {
	}
	
	@Then("Click on Details Button")
	public void click_on_details_button() {
		mobileExpensePage.clickDetailsButton();
	}
	
	@Then("Should displayed the Add Receipt button")
	public void should_displayed_the_add_receipt_button() {
	}
	
	@Then("Click on Add Receipt button")
	public void click_on_add_receipt_button() {
		mobileExpensePage.clickAddReceiptbutton();
	}
	
	@Then("Should Displayed the Camera and Gallery pop-up")
	public void should_displayed_the_camera_and_gallery_pop_up() {
	}
	
	@Then("Click on Camera option")
	public void click_on_camera_option() {
		mobileExpensePage.clickCameraoption();
	}
	
	@Then("Should open camera")
	public void should_open_camera() {
	}
	
	@Then("click on Camera Capture button")
	public void click_on_camera_capture_button() {
		mobileExpensePage.clickCameraCapturebutton();
	}
	
	@Then("Click on OK button")
	public void click_on_ok_button() {
		mobileExpensePage.clickOKbutton();
	}
	
	@Then("Should dispalyed the pop-up window with image")
	public void should_dispalyed_the_pop_up_window_with_image() {
	}
	
	@Then("Click on Enter Amount Button of Pop-up window")
	public void click_on_enter_amount_button_of_pop_up_window() {
		mobileExpensePage.clickEnterAmountButtonofPopupwindow();
	}
	
	@Then("Click on Enter Description of pop-up window")
	public void click_on_enter_description_of_pop_up_window() {
		mobileExpensePage.clickEnterDescriptionofpopupwindow();
	}
	
	@Then("Click on Submit button")
	public void click_on_submit_button() {
		mobileExpensePage.clickSubmitButton();
	}
	
	@Then("Click on Edit button of attachment details")
	public void click_on_edit_button_of_attachment_details() {
		mobileExpensePage.clickEditbuttonofattachmentdetails();
	}
	
	@Then("Should displayed the same attachment for editing")
	public void should_displayed_the_same_attachment_for_editing() {
	}
	
	@Then("Click on Amount tab For editing the amount")
	public void click_on_amount_tab_for_editing_the_amount() {
		mobileExpensePage.clickAmounttabForeditingtheamount();
	}
	
	@Then("Click on Submit button of editing")
	public void click_on_submit_button_of_editing() {
		mobileExpensePage.clickSubmitbuttonofediting();
	}
	
	@Then("Click on Delete button")
	public void click_on_delete_button() {
		mobileExpensePage.clickDeletebutton();
	}
	
	@Then("Should Displayed the Delete Expnese Pop-up Window")
	public void should_displayed_the_delete_expnese_pop_up_window() {
	}
	
	@Then("Click on Delete Pop-up Yes button")
	public void click_on_delete_pop_up_yes_button() {
		mobileExpensePage.clickDeletePopupYesbutton();
	}
	
	@Then("Click on Add New Expense button")
	public void click_on_add_new_expense_button() {
		mobileExpensePage.clickAddNewExpensebutton();
	}
	
	@Then("Should displayed the Add more expenses pop-up window")
	public void should_displayed_the_add_more_expenses_pop_up_window() {
	}
	
	@Then("Click on Own Stay Check box")
	public void click_on_own_stay_check_box() {
		mobileExpensePage.clickOwnStayCheckbox();
	}
	
	@Then("Click on  Plus Add Button")
	public void click_on_plus_add_button() {
		mobileExpensePage.clickPlusAddButton();
	}
	
	@Then("Should Displayed the Employee {int} view page of expense")
	public void should_displayed_the_employee_view_page_of_expense(Integer int1) {
	}
	
	@Then("Click on Back arrow button of Employee {int}view page")
	public void click_on_back_arrow_button_of_employee_view_page(Integer int1) {
		mobileExpensePage.clickBackarrowbuttonofEmployee360viewpage();
	}
	
	@Then("Should Displayed the Expense page of back time")
	public void should_displayed_the_expense_page_of_back_time() {
	}
	
	@Then("Click Back Arrow of expanse page of last to returen dashboard page")
	public void click_back_arrow_of_expanse_page_of_last_to_returen_dashboard_page() {
		mobileExpensePage.clickBackArrowofexpansepageoflasttoreturendashboardpage();
	}
	
	@Then("Should Displayed the Home page of application")
	public void should_displayed_the_home_page_of_application() {
		
	}
	
	
}
