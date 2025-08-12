package stepdefinition;

import hooks.HooksHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MobileLeavePage;

public class MobileLeaveDef {

	MobileLeavePage mobileLeavePage = new MobileLeavePage(HooksHandler.androidDriver);
	
	@Given("Click on leave icon")
	public void click_on_leave_icon() {
		mobileLeavePage.clickleaveicon();
	}
	
	@Then("Should be  displayed the leave Requests page")
	public void should_be_displayed_the_leave_requests_page() {
	}
	
	@Then("Click on My Leave DashBoard Button")
	public void click_on_my_leave_dash_board_button() {
		mobileLeavePage.clickmyleaveDashboard();
	}
	
	@Then("Should be Displayed Leave Management page")
	public void should_be_displayed_leave_management_page() {
	}
	
	@Then("Click on Apply Leave Button")
	public void click_on_apply_leave_button() {
		mobileLeavePage.clickapplyleave();
	}
	
	@Then("Should be displayed the apply leave side page")
	public void should_be_displayed_the_apply_leave_side_page() {
	}
	
	@Then("Click On From date Calander icon")
	public void click_on_from_date_calander_icon() {
		mobileLeavePage.clickfromdateCalandericon();
	}
	
	@Then("Click On from From Date ok button")
	public void click_on_from_from_date_ok_button() {
		mobileLeavePage.clickfromDateCalanderOk();
	}
	
	@Then("Click On from date")
	public void click_on_from_date() {
		mobileLeavePage.clickfromdate();
	}
	
	@Then("click from Date Calander Ok ")
	public void click_from_date_calander_ok() {
		mobileLeavePage.clickfromDateCalanderOk();
	}
	
	
	@Then("Click On To date Calander icon")
	public void click_on_to_date_calander_icon() {
		mobileLeavePage.clicktodateCalandericon();
	}
	
	@Then("Click on To date ok button")
	public void click_on_to_date_ok_button() {
		mobileLeavePage.clicktoDateCalanderOk();
	}
	
	@Then("Click on To date")
	public void click_on_to_date() {
		mobileLeavePage.clicktodate();
	}
	
	@Then("click To Date Calander Ok")
	public void click_to_date_calander_ok() {
		mobileLeavePage.clickfromDateCalanderOk();
	}
	
	@Then("Click on Leave type drop down button")
	public void click_on_leave_type_drop_down_button() {
		mobileLeavePage.clickleavetypedropdownbutton();
	}
	
	@Then("Click on leave without pay option")
	public void click_on_leave_without_pay_option() {
		mobileLeavePage.clickleavewithoutpayoption();
	}
	
	@Then("Click on Enter Reamrk Tab")
	public void click_on_enter_reamrk_tab() {
		mobileLeavePage.clickenterReamrkTab();
	}
	
	@Then("Enter test type in the remark tab ")
	public void enter_test_type_in_the_remark_tab(String string) {
	mobileLeavePage.entertesttypeintheremarktab(string);
	}
	
	@Then("Click on Yearly Button")
	public void click_on_yearly_button() {
		mobileLeavePage.clickyearlyButton();
	}
	
	@Then("Click on Current month option")
	public void click_on_current_month_option() {
		mobileLeavePage.clickcurrentmonthoption();
	}
	
	@Then("Click On View Button")
	public void click_on_view_button() {
		mobileLeavePage.clickviewButton();
	}
	
	@Then("Click on Cross icon")
	public void click_on_cross_icon() {
		mobileLeavePage.clickcrossicon();
	}
	
	@Then("Click on Back Arrow of leave Management")
	public void click_on_back_arrow_of_leave_management() {
		mobileLeavePage.clickbackArrowofleaveManagement();
	}
	
	@Then("Click on view button of Dheeraj Kumar user")
	public void click_on_view_button_of_dheeraj_kumar_user() {
		mobileLeavePage.clickviewbuttonofDheerajKumaruser();
	}
	
	@Then("Click on user leave view button")
	public void click_on_user_leave_view_button() {
		mobileLeavePage.clickuserleaveviewbutton();
	}
	
	@Then("Click on Accept Request Button")
	public void click_on_accept_request_button() {
		mobileLeavePage.clickacceptRequestButton();
	}
	
	@Then("Click on User Approved view button")
	public void click_on_user_approved_view_button() {
		mobileLeavePage.clickuserApprovedviewbutton();
	}
	
	@Then("Click on Cancel Leave Button")
	public void click_on_cancel_leave_button() {
		mobileLeavePage.clickcancelLeaveButton();
	}
	
	@Then("Should be displayed cancellation pop-up window")
	public void should_be_displayed_cancellation_pop_up_window() {
	}
	
	@Then("Click on Blanck Tab")
	public void click_on_blanck_tab() {
		mobileLeavePage.clickblanckTab();
	}
	
	@Then("Enter 1 testing type in the reamrk tab ")
	public void enter_1_testing_type_in_the_remark_tab() {
		mobileLeavePage.enter1testingtypeinthereamrktab();
	}
	
	@Then("Click on Cancel Leave button of pop-up")
	public void click_on_cancel_leave_button_of_pop_up() {
		mobileLeavePage.clickcancelLeavebuttonofPopup();
	}
	
	@Then("Should displayed the Leave Management page")
	public void should_displayed_the_leave_management_page() {
	}
	
	@Then("Click on other user view button")
	public void click_on_other_user_view_button() {
		mobileLeavePage.clickotheruserviewbutton();
	}
	
	@Then("Should displayed the side page of user leave")
	public void should_displayed_the_side_page_of_user_leave() {
	}
	
	@Then("Click on Reject Request Button")
	public void click_on_reject_request_button() {
		mobileLeavePage.clickrejectRequestButton();
	}
	
	@Then("Should displayed the Rejection Reason pop-up window")
	public void should_displayed_the_rejection_reason_pop_up_window() {
	}
	
	@Then("Click on Remark Tab")
	public void click_on_remark_tab() {
		mobileLeavePage.clickremarkTab();
	}
	
	@Then("Enter 2 Testto type in the reamrk tab")
	public void enter_2_testto_type_in_the_remark_tab(String string) {
		mobileLeavePage.enter2Testtotypeinthereamrktab(string);
	}
	
	@Then("Click on Rejection Reason on Reject Request button")
	public void click_on_rejection_reason_on_reject_request_button() {
		mobileLeavePage.clickrejectionReasononRejectRequestbutton();
}
}