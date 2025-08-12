package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import wrappermethod.AndroidDirverMethods;

public class MobileCustomersPage  extends AndroidDirverMethods{
	
	AndroidDriver androidDriver;

	public MobileCustomersPage(AndroidDriver driver) {
		super(driver);
		this.androidDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//android.view.ViewGroup[@resource-id=\"item-Customers\"]")
	private WebElement customersmoduleicon;
	
	@FindBy(xpath= "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement filtericon;
	
	@FindBy(xpath= "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement doctornamecheckbox;
	
	@FindBy(xpath= "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement specialityCheckbox;
	
	@FindBy(xpath= "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement patchcheckbox;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Apply \"]")
	private WebElement applybutton;
	
	@FindBy(xpath= "//android.widget.EditText[@text=\"Search\"]")
	private WebElement searchbox;
	
	@FindBy(xpath= "//android.widget.EditText[@text=\"Search\"]")
	private WebElement enterDoctorname;
	
	@FindBy(xpath= "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement doctorProfile ;
	
	
	@FindBy(xpath= "//android.widget.TextView[@text=\"\"]")
	private WebElement backarrowbuttonofdoctorprofile;
	
	
	
	
	
	public void clickCustomersmoduleicon() {
		Assert.assertEquals(true, clickOnElement(customersmoduleicon));
	}
	
	public void clickFiltericon() {
		Assert.assertEquals(true, clickOnElement(filtericon));
	}
	
	public void clickDoctornamecheckbox() {
		Assert.assertEquals(true, clickOnElement(doctornamecheckbox));
	}
	
	public void clickSpecialityCheckbox() {
		Assert.assertEquals(true, clickOnElement(specialityCheckbox));
	}
	
	public void clickPatchcheckbox() {
		Assert.assertEquals(true, clickOnElement(patchcheckbox));
	}
	
	public void clickApplybutton() {
		Assert.assertEquals(true, clickOnElement(applybutton));
	}
	
	public void clickSearchbox() {
		Assert.assertEquals(true, clickOnElement(searchbox));
	}
	
	public void enterEnterDoctorname(WebElement enterDoctorname) {
		typeOnElement(enterDoctorname, enterDoctorname);
	}
	
	public void clickDoctorProfile() {
		Assert.assertEquals(true, clickOnElement(doctorProfile));
	}
	
	public void clickBackarrowbuttonofdoctorprofile() {
		Assert.assertEquals(true, clickOnElement(backarrowbuttonofdoctorprofile));
	}
	
		
	}
	
