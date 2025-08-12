package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import wrappermethod.AndroidDirverMethods;

public class MobileInputInvntoryPage extends AndroidDirverMethods{
	
	AndroidDriver androidDriver;

	public MobileInputInvntoryPage(AndroidDriver driver) {
		super(driver);
		this.androidDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath= "//android.widget.TextView[@text=\"Input Inventory\"]")
		WebElement inputInventoryicon;

		@FindBy(xpath = "//android.widget.TextView[@text=\"\"]")   
		WebElement dropDownbutton;
		
		@FindBy(xpath = "//android.widget.TextView[@text=\"MD SHAHNAWAZ IMAM\"])[7]") 
		WebElement mDSHAHNAWAZIMAMNameoption ;
		
		@FindBy(xpath = "//android.widget.EditText[@text=\"Search SGPI by Name and Type\"]")
		WebElement searchTab;
		
		@FindBy(xpath = "//android.widget.EditText[@text=\"EY RESYNC BP MONITOR \"]")  
		WebElement inputName;
		  
		@FindBy(xpath = "//div[@class='_highlighter-box_619e8'])[217]") 
		WebElement inputcheckbox;
		
		@FindBy(xpath= "//android.widget.EditText[@text=\"1\"]")
		WebElement inputnumber;

		@FindBy(xpath = "//android.widget.TextView[@text=\" Transfer Input \"]")   
		WebElement transferInputbutton;
		
		@FindBy(xpath = "//android.widget.TextView[@text=\"\"]") 
		WebElement  selectdropdownbutton;
		
		@FindBy(xpath = "//android.widget.TextView[@text=\"Dheeraj Kumar\"]")
		WebElement anyEmployeename;
		
		@FindBy(xpath = "//android.widget.EditText")  
		WebElement remarktab;
		  
		@FindBy(xpath = "//android.widget.EditText[@text=\"Test\"]") 
		WebElement remarkname;
		
		@FindBy(xpath= "//android.widget.TextView[@text=\" Submit \"]")
		WebElement submitButton;

		@FindBy(xpath = "//android.widget.TextView[@text=\" Thank You \"]")   
		WebElement thankYouButton;
		
		@FindBy(xpath = "//android.widget.TextView[@text=\" View Agenda \"]") 
		WebElement  viewAgendaButton;
		
		@FindBy(xpath = "//android.widget.TextView[@text=\"Dr Bhawani Patro\"]")
		WebElement doctorprofileName;
		
		@FindBy(xpath = "//android.widget.TextView[@text=\" Start DCR \"]")  
		WebElement startDCRButton;
		  
		@FindBy(xpath = "//android.widget.TextView[@text=\" Next \"]") 
		WebElement nextButton;
		
	
		public void clickInputInventoryicon() {
			Assert.assertEquals(true, clickOnElement(inputInventoryicon));
		}
		
		
		public void clickDropDownbutton() {
			Assert.assertEquals(true, clickOnElement(dropDownbutton));
		}
		
		public void ClickMDSHAHNAWAZIMAMNameoption() {
			Assert.assertEquals(true, clickOnElement(mDSHAHNAWAZIMAMNameoption));
		}
		
		
		public void clickSearchTab() {
			Assert.assertEquals(true, clickOnElement(searchTab));
		}
		
		public void enterInputName() {
			Assert.assertEquals(true, typeOnElementJs(inputName));
		}
		
		private Boolean typeOnElementJs(WebElement inputName2) {
			return null;
		}


		public void clickInputcheckbox() throws InterruptedException {
			Assert.assertEquals(true, clickOnElement(inputcheckbox));
		}
		
		public void enterInputnumber() {
			Assert.assertEquals(true, typeOnElementJs(inputnumber));
		}
		
		public void clickTransferInputbutton() {
			Assert.assertEquals(true, clickOnElement(transferInputbutton));
		}
		
		public void clickSelectdropdownbutton() {
			Assert.assertEquals(true, clickOnElement(selectdropdownbutton));
		}
		
		public void clickAnyEmployeename() {
			Assert.assertEquals(true, clickOnElement(anyEmployeename));
		}
		
		public void clickRemarktab() {
			Assert.assertEquals(true, clickOnElement(remarktab));
		}
		
		public void enterRemarkname() {
			Assert.assertEquals(true, clickOnElement(remarkname));
		}
		
		public void clickSubmitButton() {
			Assert.assertEquals(true, clickOnElement(submitButton));
		}
		
		public void clickThankYouButton() {
			Assert.assertEquals(true, clickOnElement(thankYouButton));
		}
		
		public void clickViewAgendaButton() {
			Assert.assertEquals(true, clickOnElement(viewAgendaButton));
		}
		
		public void clickDoctorprofileName() {
			Assert.assertEquals(true, clickOnElement(doctorprofileName));
		}
		
		public void clickStartDCRButton() {
			Assert.assertEquals(true, clickOnElement(startDCRButton));
		}
		
		public void clickNextButton() {
			Assert.assertEquals(true, clickOnElement(nextButton));
		}
	}


