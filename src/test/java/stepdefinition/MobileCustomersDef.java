package stepdefinition;

import hooks.HooksHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import pages.MobileCustomersPage;


public class MobileCustomersDef {
	
	MobileCustomersPage mobileCustomersPage = new MobileCustomersPage(HooksHandler.androidDriver);
	
	
	
	@Given("Click on customers module icon")
	public void click_on_customers_module_icon() {
		mobileCustomersPage.clickCustomersmoduleicon();
	}
	
	@Then("Should displayed the Customers page")
	public void should_displayed_the_customers_page() {
	}
	
	@Then("Click on filter icon")
	public void click_on_filter_icon() {
		mobileCustomersPage.clickFiltericon();
	}
	
	@Then("Should displayed the filter by pop-up window")
	public void should_displayed_the_filter_by_pop_up_window() {
	}
	
	@Then("Click on Doctor name check box")
	public void click_on_doctor_name_check_box() {
		mobileCustomersPage.clickDoctornamecheckbox();
	}
	
	@Then("Click on Speciality Check box {string}")
	public void click_on_speciality_check_box(String string) {
		mobileCustomersPage.clickSpecialityCheckbox();
	}
	
	@Then("Click on Patch check box {string}")
	public void click_on_patch_check_box(String string) {
		mobileCustomersPage.clickPatchcheckbox();
	}
	
	@Then("Click on Apply button")
	public void click_on_apply_button() {
		mobileCustomersPage.clickApplybutton();
	}
	
	@Then("Should displayed the selected path and Speciality Doctors list")
	public void should_displayed_the_selected_path_and_speciality_doctors_list() {
	}
	
	@Then("Click on Search box")
	public void click_on_search_box() {
		mobileCustomersPage.clickSearchbox();
	}
	
	@Then("Enter the Doctor name {string}")
	public void enter_the_doctor_name(String string) {
	     mobileCustomersPage.enterEnterDoctorname(null);
    }

	@Then("Should Displayed the Doctor  profile")
	public void should_displayed_the_doctor_profile() {
	}
	
	@Then("Click on Doctor Profile")
	public void Click_on_Doctor_Profile() {
		mobileCustomersPage.clickDoctorProfile();
	}
	
	@Then("Should Displayed the same customer page")
	public void should_displayed_the_same_customer_page() {
	}
	
	@Then("Click on back arrow button of doctor profile")
	public void Click_on_back_arrow_button_of_doctor_profilee() {
		mobileCustomersPage.clickBackarrowbuttonofdoctorprofile();
	}
	
	@Then("Should displayed the Dashboard")
	public void should_displayed_the_dashboard() {
	}	
	
}
