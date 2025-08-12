package stepdefinition;


import hooks.HooksHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MobileDCRPage;


public class MobileDCRDef {
	
	MobileDCRPage mobileDCRPage = new MobileDCRPage(HooksHandler.androidDriver);
	
	@Given("Click on Change Date Button")
	public void click_on_change_date_button() {
		mobileDCRPage.clickChangeDate();
	}
	
	@Then("Select Day to mark attendance pop-up window  should be appeared")
	public void select_day_to_mark_attendance_pop_up_window_should_be_appeared() {
	}
	
	@Then("Click on mark day option icon")
	public void click_on_mark_day_option_icon() {
		mobileDCRPage.clickMarkDay();
	}
	
	@Then("Click on open button")
	public void click_on_open_button() {
		mobileDCRPage.clickOpenButton();
	}
	
	@Then("Click on View Agenda button")
	public void click_on_view_agenda_button() {
		mobileDCRPage.clickviewAgendaButton();
	}
	
	@Then("Click on Start My Day button")
	public void click_on_start_my_day_button() {
		mobileDCRPage.clickStartMyday();
	}
	
	@Then("Mark Your Attendance pop-up window should be appeared")
	public void mark_your_attendance_pop_up_window_should_be_appeared() {
	}
	
	@Then("Click on Calander icon")
	public void click_on_calander_icon() {
		mobileDCRPage.clickCalanderIcon();
	}
	
	@Then("Click on ok Calander ok button")
	public void click_on_ok_calander_ok_button() {
		mobileDCRPage.clickCalanderokbutton();
	}
	
	@Then("Click on Choose Twon drop down button")
	public void click_on_choose_twon_drop_down_button() {
		mobileDCRPage.clickChooseTwondropdownbutton();
	}
	
	/*
	 * @Then("Click on aaa name in the Remark tab") public void
	 * click_on_aaa_name_in_the_remark_tab() { mobileDCRPage.clickAAAName(); }
	 */
	
	@Then("Click on Start My Day Town Name Option")
	public void click_on_start_my_day_town_name_option() {
		mobileDCRPage.clickStartMyDayTownNameOption();
	}
	
	@Then("Click on Submit Button")
	public void click_on_submit_button() {
		mobileDCRPage.clickSubmitButton();
	}
	
	@Then("Day Planner page should be displayed")
	public void day_planner_page_should_be_displayed() {
	}
	
	@Then("Click on Field work + icon")
	public void click_on_field_work_icon() {
		mobileDCRPage.clickFieldworkplusicon();
	}
	
	@Then("Click on Search Tab")
	public void click_on_search_tab() {
		mobileDCRPage.clickSearchTab();
	}
	
	@Then("Click on the Doctor name Section")
	public void click_on_the_doctor_name_section() {
		mobileDCRPage.clickDoctornamesection();
	}
	
	@Then("Click on Save Button")
	public void click_on_save_button() {
		mobileDCRPage.clickSaveButton();
	}
	
	@Then("Click on NCA tab")
	public void clcik_on_nca_tab() {
		mobileDCRPage.clickNCAtab();
	}
	
	@Then("Click on NCA+ icon")
	public void click_on_nca_icon() {
		mobileDCRPage.clickNCAplusicon();
	}
	
	@Then("Select Non Call Activity Pop-up window should be displayed")
	public void select_non_call_activity_pop_up_window_should_be_displayed() {
	}
	
	@Then("Click on DF Meet Mark Button")
	public void click_on_df_meet_mark_button() {
		mobileDCRPage.clickDFMeetMarkButton();
	}
	
	@Then("Select Town pop-up window should be displayed")
	public void select_town_pop_up_window_should_be_displayed() {
	}
	
	@Then("Click on Agra Mark Town Button")
	public void click_on_agra_mark_town_button() {
		mobileDCRPage.clickAgraMarkTownButton();
	}
	
	@Then("Click on Report NCA Button")
	public void click_on_report_nca_button() {
		mobileDCRPage.clickReportNCAButton();
	}
	
	@Then("Report NCA pop-up window should be displayed")
	public void report_nca_pop_up_window_should_be_displayed() {
	}
	
	@Then("Click on NCA Shift drop down button")
	public void click_on_nca_shift_drop_down_button() {
		mobileDCRPage.clickNCAShiftdropdownbutton();
	}
	
	@Then("Select Full Day Function Name")
	public void select_full_day_function_name() {
		mobileDCRPage.clickFullDayFunctionName();
	}
	
	@Then("Enter the {string} name in the Comment textbox")
	public void enter_the_test_name_in_the_remark_tab(String commentText) {
		mobileDCRPage.enterAaaNameInCommentBox(commentText);
	}
	
	@Then("Click on NCA Submit Button")
	public void click_on_nca_submit_button() {
		mobileDCRPage.clickNCAsubmitButton();
	}
	
	@Then("Click again Field work tab")
	public void click_again_Field_work_tab() {
		mobileDCRPage.clickAgainFieldWorkTab();
	}
	
	@Then("Day planner page should be displayed with Field work addition")
	public void day_planner_page_should_be_displayed_with_field_work_addition() {
	}
	
	@Then("Click on Doctor Profile Name")
	public void click_on_doctor_profile_name() {
		mobileDCRPage.clickDoctorProfileName();
	}
	
	@Then("Should Displayed the Dr. {int} view")
	public void should_displayed_the_dr_view(Integer int1) {
	}
	
	@Then("Click on Start DCR Button")
	public void click_on_start_dcr_button() {
		mobileDCRPage.clickStartDCRButton();
	}
	
	@Then("Click on Next button")
	public void click_on_next_button() {
		mobileDCRPage.clickNextbutton();
	}
	
	@Then("Click on SGPI Input button of EY CHEMIST BOTTLE JAN")
	public void click_on_sgpi_input_button_of_ey_chemist_bottle_jan() {
		mobileDCRPage.clickSGPIInputplusbuttonofEYCHEMISTBOTTLEJAN();
	}
	
	@Then("Click on SGPI next button")
	public void click_on_sgpi_next_button() {
		mobileDCRPage.clickSGPInextbutton();
	}
	
	@Then("Click on servey page of Next  button")
	public void click_on_servey_page_of_next_button() {
		mobileDCRPage.clickServeypageNextbutton();
	}
	
	@Then("Click On Input Fucntion")
	public void click_on_input_fucntion() {
		mobileDCRPage.clickInputFucntion();
	}
	
	@Then("Should displayed the given inputs name")
	public void should_displayed_the_given_inputs_name() {
	}
	
	@Then("Click on Survey function")
	public void click_on_survey_function() {
		mobileDCRPage.clickSurveyfunction();
	}
	
	@Then("Should Displayed the survey page")
	public void should_displayed_the_survey_page() {
	}
	
	@Then("Click on Submit DCR Button")
	public void click_on_submit_dcr_button() {
		mobileDCRPage.clickSubmitDCRButton();
	}
	
	@Then("Should Displayed The submit DCR Confimation Pop-up window")
	public void should_displayed_the_submit_dcr_confimation_pop_up_window() {
	}
	
	@Then("Click on Yes Button")
	public void click_on_yes_button() {
		mobileDCRPage.clickYesButton();
	}
	
	@Then("Click on back Arrow button")
	public void click_on_back_arrow_button() {
		mobileDCRPage.clickBackArrowbutton();
	}
	
	@Then("Click on Back Arrow button on Day Planner Page")
	public void click_on_back_arrow_button_on_day_planner_page() {
		mobileDCRPage.clickBackArrowbuttonDayPlannerPage();
	}
	
	@Then("Click on side bar button")
	public void click_on_side_bar_button() {
		mobileDCRPage.clickSidebarbutton();
	}
	
	@Then("Should Displayyed the Side Page")
	public void should_displayyed_the_side_page() {
	}
	
	@Then("Click on Master Sync function name")
	public void click_on_master_sync_function_name() {
		mobileDCRPage.clickMasterSyncbutton();
	}
	
	@Then("Should Displayed Master sync loading Bar")
	public void should_displayed_master_sync_loading_bar() {
	}
	
	@Then("Click on End My Day Button")
	public void click_on_end_my_day_button() {
		mobileDCRPage.clickEndMyDayButton();
	}
	
	@Then("Should displayed the mark your attendace pop-up window for ending day")
	public void should_displayed_the_mark_your_attendace_pop_up_window_for_ending_day() {
	}
	
	@Then("Click on Calander icon to Adjust Time")
	public void click_on_calander_icon_to_adjust_time() {
		mobileDCRPage.clickCalandericontoAdjustTime();
	}
	
	@Then("Click on clock Hour Hand")
	public void click_on_clock_hour_hand() {
		mobileDCRPage.clickClockHourHand();
	}
	
	@Then("Click on pm function")
	public void click_on_pm_function() {
		mobileDCRPage.clickPMfunction();
	}
	
	@Then("Click on OK Calander on button")
	public void click_on_ok_calander_on_button() {
		mobileDCRPage.clickOkCalanderbutton();
	}
	
	@Then("Click on Choose Town Button to end Day")
	public void click_on_choose_town_button_to_end_day() {
		mobileDCRPage.clickChooseTownButtonendDay();
	}
	
	/*
	 * @Then("Click on AAA Name") public void click_on_aaa_name() {
	 * mobileDCRPage.clickAAAName(); }
	 * 
	 */

	
	@Then("Click On Submit button to end day")
	public void click_on_submit_button_to_end_day() {
		mobileDCRPage.clickSubmitbuttonendday();
	}
	
	@Then("Should Displayed the Dashboard Page")
	public void should_displayed_the_dashboard_page() {
	}
	


}
