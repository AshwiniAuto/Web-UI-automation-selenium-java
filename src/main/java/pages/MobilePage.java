package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import wrappermethod.AndroidDirverMethods;

public class MobilePage extends AndroidDirverMethods{
	
	AndroidDriver androidDriver;

	public MobilePage(AndroidDriver driver) {
		super(driver);
		this.androidDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//android.widget.EditText[@text="Enter Mobile number"
	@FindBy(xpath="//android.widget.EditText[@text='Enter Mobile number']")
	WebElement enterMobileNumber;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Send OTP \"]")
	WebElement clickSendOtpButton;
	
	@FindBy(xpath="//android.widget.EditText")
	WebElement apearOTP;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Verify \"]")
	WebElement clickOnVerfyButton;
	
	
	
	
	public void enterMobileNumber(String number) {
		try {
			Thread.sleep(200000);
			Assert.assertEquals(true,typeOnElement(enterMobileNumber,number));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	public void clickSendOTPButton(String otp) {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true,typeOnElement(clickSendOtpButton,otp));
}
	
	public void apearOtpNumber(String otpNumber) {
		Assert.assertEquals(true, typeOnElement(apearOTP,otpNumber ));
	}	
		
		public void clickOnVerifyButton(String verify) {
			Assert.assertEquals(true,typeOnElement(clickOnVerfyButton,verify));
}
}