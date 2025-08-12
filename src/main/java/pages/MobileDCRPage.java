package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import wrappermethod.AndroidDirverMethods;

public class MobileDCRPage extends AndroidDirverMethods{
	
	AndroidDriver androidDriver;

	public MobileDCRPage(AndroidDriver driver) {
		super(driver);
		this.androidDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Change Date\"]")
	private WebElement changeDate;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.RadioButton/android.view.ViewGroup")
	private WebElement markDay;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Open \"])[1]")
	private WebElement openButton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Start My Day \"] ")
	private WebElement startMyday;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"] ")
	private WebElement calanderIcon;
	
	@FindBy(xpath="//android.widget.Button[@resource-id=\"android:id/button1\"]")
	private WebElement calanderokbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement chooseTwondropdownbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"adaspur\"]")
	private WebElement startMyDayTownNameOption;
	
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Submit \"]")
	private WebElement submitButton;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" View Agenda \"]")
	private WebElement viewAgendaButton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement fieldworkplusicon;
	
	@FindBy(xpath="//android.widget.EditText[@text=\"Search\"]")
	private WebElement searchTab;
	
	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement  doctornamesection;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Save \"]")
	private WebElement saveButton;
	
	@FindBy(xpath="//android.view.ViewGroup[contains @content-desc,'NCA - 0']")
	private WebElement nCAtab;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement nCAplusicon;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.RadioButton/android.view.ViewGroup")
	private WebElement dFMeetMarkButton ;
	
	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.RadioButton/android.view.ViewGroup")
	private WebElement agraMarkTownButton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Report NCA\"]")
	private WebElement reportNCAButton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement nCAShiftdropdownbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Full Day\"]")
	private WebElement fullDayFunctionName;
	
	@FindBy(xpath="//android.widget.EditText[@text=\"Comment\"]")
	private WebElement commentBox;
	
	/*
	 * @FindBy(xpath="//android.widget.EditText[@text=\"Aaa\"]") private WebElement
	 * aaaName;
	 */
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement nCAsubmitButton;
	
	@FindBy(xpath="//android.view.ViewGroup[contains(@content-desc, 'Field Work')]")
	private WebElement againFieldWorkTab;
	
	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
	private WebElement doctorProfileName;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement startDCRButton;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement nextbutton;
	
	@FindBy(xpath="//android.widget.HorizontalScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[3]")
	private WebElement sGPIInputplusbuttonOfEYCHEMISTBOTTLEJAN;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	private WebElement sGPInextbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Next \"]")
	private WebElement serveypageNextbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Input\"]")
	private WebElement inputFucntion;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Survey\"]")
	private WebElement surveyfunction;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Submit DCR \"]")
	private WebElement submitDCRButton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Yes \"]")
	private WebElement yesButton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement backArrowbutton;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement backArrowbuttonDayPlannerPage;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
	private WebElement sidebarbutton;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]")
	private WebElement  masterSyncbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" End My Day \"]")
	private WebElement endMyDayButton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement calandericontoAdjustTime;
	
	@FindBy(xpath="//android.widget.RadioButton[@resource-id=\"android:id/pm_label\"]")
	private WebElement clockHourHand;
	
	@FindBy(xpath="//android.widget.Button[@resource-id=\"android:id/button1\"]")
	private WebElement pmfunction;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement oKCalanderbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"AAA\"]")
	private WebElement  chooseTownButtonendDay;
	
	@FindBy(xpath="")
	private WebElement aIIMS;
	
	@FindBy(xpath="//android.widget.TextView[@text=\" Submit \"]")
	private WebElement submitbuttonendday;
	
	
	
	
	public void clickChangeDate() {
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		Assert.assertEquals(true, clickOnElement(changeDate));
	}
	
	public void clickMarkDay() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(markDay));
	}

	public void clickOpenButton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(openButton));
	
	}
	
	public void clickStartMyday() {
		Assert.assertEquals(true, clickOnElement(startMyday));
	}
	
	public void clickCalanderIcon() {
		Assert.assertEquals(true, clickOnElement(calanderIcon));
	}
	
	public void clickCalanderokbutton() {
		Assert.assertEquals(true, clickOnElement(calanderokbutton));
	}
	
	public void clickChooseTwondropdownbutton() {
		Assert.assertEquals(true, clickOnElement(chooseTwondropdownbutton));
	}
	
	public void clickStartMyDayTownNameOption() {
		Assert.assertEquals(true, clickOnElement(startMyDayTownNameOption));
	}
	
	public void clickSubmitButton() {
		Assert.assertEquals(true, clickOnElement(submitButton));
	}
	
	public void clickviewAgendaButton() {
		Assert.assertEquals(true, clickOnElement(viewAgendaButton));
	}
	
	public void clickFieldworkplusicon() {
		Assert.assertEquals(true, clickOnElement(fieldworkplusicon));
	}
	
	public void clickSearchTab() {
		Assert.assertEquals(true, clickOnElement(searchTab));
	}
	
	public void clickDoctornamesection() {
		Assert.assertEquals(true, clickOnElement(doctornamesection));
	}
	
	public void clickSaveButton() {
		Assert.assertEquals(true, clickOnElement(saveButton));
	}
	
	public void clickNCAtab() {
		Assert.assertEquals(true, clickOnElement(nCAtab));
	}
	
	public void clickNCAplusicon() {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(nCAplusicon));
	}
	
	public void clickDFMeetMarkButton() {
		Assert.assertEquals(true, clickOnElement(dFMeetMarkButton));
	}
	
	public void clickAgraMarkTownButton() {
		Assert.assertEquals(true, clickOnElement(agraMarkTownButton));
	}
	
	public void clickReportNCAButton() {
		Assert.assertEquals(true, clickOnElement(reportNCAButton));
	}
	
	public void clickNCAShiftdropdownbutton() {
		Assert.assertEquals(true, clickOnElement(nCAShiftdropdownbutton));
	}
	
	public void clickFullDayFunctionName() {
		Assert.assertEquals(true, clickOnElement(fullDayFunctionName));
	}
	
	public void enterAaaNameInCommentBox(String commentText) {
		Assert.assertEquals(true, typeOnElement(commentBox, commentText));
	}
	
	public void clickNCAsubmitButton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(nCAsubmitButton));
	}
	
	public void clickAgainFieldWorkTab() {
		Assert.assertEquals(true, clickOnElement(againFieldWorkTab));
	}
	
	public void clickDoctorProfileName() {
		Assert.assertEquals(true, clickOnElement(doctorProfileName));
	}
	
	public void clickStartDCRButton() {
		Assert.assertEquals(true, clickOnElement(startDCRButton));
	}
	
	public void clickNextbutton() {
		Assert.assertEquals(true, clickOnElement(nextbutton));
	}
	
	public void clickSGPIInputplusbuttonofEYCHEMISTBOTTLEJAN() {
		Assert.assertEquals(true, clickOnElement(sGPIInputplusbuttonOfEYCHEMISTBOTTLEJAN));
	}
	
	public void clickSGPInextbutton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(sGPInextbutton));
	}
	
	public void clickServeypageNextbutton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(serveypageNextbutton));
	}
	
	public void clickInputFucntion() {
		Assert.assertEquals(true, clickOnElement(inputFucntion));
	}
	
	public void clickSurveyfunction() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(surveyfunction));
	}
	
	public void clickSubmitDCRButton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(submitDCRButton));
	}
	
	public void clickYesButton() {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(yesButton));
	}
	
	public void clickBackArrowbutton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(backArrowbutton));
	}
	
	public void clickBackArrowbuttonDayPlannerPage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(backArrowbuttonDayPlannerPage));
	}
	
	public void clickSidebarbutton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(sidebarbutton));
	}
	
	public void clickMasterSyncbutton() {
		try {
			Thread.sleep(90000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(masterSyncbutton));
	}
	
	public void clickEndMyDayButton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, clickOnElement(endMyDayButton));
	}
	
	public void clickCalandericontoAdjustTime() {
		Assert.assertEquals(true, clickOnElement(calandericontoAdjustTime));
	}
	
	public void clickClockHourHand() {
		Assert.assertEquals(true, clickOnElement(clockHourHand));
	}
	
	public void clickPMfunction() {
		Assert.assertEquals(true, clickOnElement(pmfunction));
	}
	
	public void clickOkCalanderbutton() {
		Assert.assertEquals(true, clickOnElement(oKCalanderbutton));
	}
	
	public void clickChooseTownButtonendDay() {
		Assert.assertEquals(true, clickOnElement(chooseTownButtonendDay));
	}
	
	/*
	 * public void clickAAAName() { Assert.assertEquals(true,
	 * clickOnElement(aaaName)); }
	 */
	
	public void clickSubmitbuttonendday() {
		Assert.assertEquals(true, clickOnElement(submitbuttonendday));
	}
}


