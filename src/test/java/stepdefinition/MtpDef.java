package stepdefinition;

import hooks.HooksHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MtpPage;

public class MtpDef {
	
	MtpPage mtpPage = new MtpPage(HooksHandler.androidDriver);

	
	@Given("Click on MTP Icon")
	public void click_on_mtp_icon() {
		mtpPage.clickMTPIcon();
	}
	
	@Then("Should Displayed the MTP Page")
	public void should_displayed_the_mtp_page() {
	}
	
	@Then("Click on Month Drop Down Button")
	public void click_on_month_drop_down_button() {
		mtpPage.clickMonthDropDownButton();
	}
	
	@Then("Click on Feb month option")
	public void click_on_feb_month_option() {
		mtpPage.clickFebmonthoption();
	}
	
	@Then("Click on Create New MTP button")
	public void click_on_create_new_mtp_button() {
		mtpPage.clickCreateNewMTPbutton();
	}
	
	@Then("Click on February Month Draft Sction")
	public void click_on_february_month_draft_sction() {
		mtpPage.clickFebruaryMonthDraftSction();
	}
	
	@Then("Click on Plan button")
	public void click_on_plan_button() {
		mtpPage.clickPlanbutton();
	}
	
	@Then("Click on select drop down button")
	public void click_on_select_drop_down_button() {
		mtpPage.clickSelectdropdownbutton();
	}
	
	@Then("Click on FW option")
	public void click_on_fw_option() {
		mtpPage.clickFWoption();
	}
	
	@Then("Click on Territory Select drop down button")
	public void click_on_territory_select_drop_down_button() {
		mtpPage.clickTerritorySelectdropdownbutton();
	}
	
	@Then("Click on Meerut {int} ABHINAV Option")
	public void click_on_meerut_abhinav_option(Integer int1) {
		mtpPage.clickMeerut2ABHINAVOption();
	}
	
	@Then("Click on Patch select drop down button")
	public void click_on_patch_select_drop_down_button() {
		mtpPage.clickPatchselectdropdownbutton();
	}
	
	@Then("Click on Dhampur option")
	public void click_on_dhampur_option() {
		mtpPage.clickDhampuroption();
	}
	
	@Then("Click on customer check box Button")
	public void click_on_customer_check_box_button() {
		mtpPage.clickCustomercheckboxButton();
	}
	
	@Then("Click on Save Data button")
	public void click_on_save_data_button() {
		mtpPage.clickSaveDatabutton();
	}
	
	@Then("Should be displayed the FW Data on same page")
	public void should_be_displayed_the_fw_data_on_same_page() {
	}
	
	@Then("Click on Activity drop down")
	public void click_on_activity_drop_down() {
		mtpPage.clickActivitydropdown();
	}
	
	@Then("Click on JW option")
	public void click_on_jw_option() {
		mtpPage.clickJWoption();
	}
	
	@Then("Click on Meerut {int} Mohd Sadik")
	public void click_on_meerut_mohd_sadik(Integer int1) {
		mtpPage.clickMeerut1MohdSadik();
	}
	
	@Then("Click On NCA option")
	public void click_on_nca_option() {
		mtpPage.clickNCAoption();
	}
	
	@Then("Click on NCA Types Drop down button")
	public void click_on_nca_types_drop_down_button() {
		mtpPage.clickNCATypesDropdownbutton();
	}
	
	@Then("Click on Transit")
	public void click_on_transit() {
		mtpPage.clickTransit();
	}
	
	@Then("Click On Town Select Drop down Button")
	public void click_on_town_select_drop_down_button() {
		mtpPage.clickTownSelectDropdownButton();
	}
	
	@Then("Click on Adalhat option")
	public void click_on_adalhat_option() {
		mtpPage.clickAdalhatoption();
	}
	
	@Then("Click on Click On Save Button Of NCA")
	public void click_on_click_on_save_button_of_nca() {
		mtpPage.clickSaveButtonOfNCA();
	}
	
	@Then("Should Be displayed the NCA Data")
	public void should_be_displayed_the_nca_data() {
	}
	
	@Then("Click on Reset button")
	public void click_on_reset_button() {
		mtpPage.clickResetbutton();
	}
	
	@Then("Should displayed the empaty plan MTP Page")
	public void should_displayed_the_empaty_plan_mtp_page() {
	}
	
	@Then("Click on back arrow button")
	public void click_on_back_arrow_button() {
		mtpPage.clickBackarrowbutton();
	}
	
	@Then("Should Displayed the Monthly Tour Plan Page")
	public void should_displayed_the_monthly_tour_plan_page() {
	}
	
	@Then("Click on Submit MTP Button")
	public void click_on_submit_mtp_button() {
		mtpPage.clickSubmitMTPButton();
	}
	
	@Then("Should Displayed the MTP page with requested and Draft MTPs Are visible")
	public void should_displayed_the_mtp_page_with_requested_and_draft_mt_ps_are_visible() {
	}
	
	@Then("Click on Requested MTP Section")
	public void click_on_requested_mtp_section() {
		mtpPage.clickRequestedMTPSection();
	}
	
	@Then("Should Displayed the mtp page with Reject option and Approved option")
	public void should_displayed_the_mtp_page_with_reject_option_and_approved_option() {
	}
	
	@Then("Click on Approved option")
	public void click_on_approved_option() {
		mtpPage.clickApprovedoption();
	}
	
	@Then("should dispalyed the approved MTP page")
	public void should_dispalyed_the_approved_mtp_page() {
	}
	
	@Then("Click on Reject button")
	public void click_on_reject_button() {
		mtpPage.clickRejectbutton();
	}
	@Then("Should displayed the MTP page With Reject option")
	public void should_displayed_the_mtp_page_with_reject_option() {
	}
	
}
