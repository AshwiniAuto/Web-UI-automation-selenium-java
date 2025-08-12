package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import wrappermethod.AndroidDirverMethods;

public class MobileExpensePage extends AndroidDirverMethods{
	
	AndroidDriver androidDriver;

	public MobileExpensePage(AndroidDriver driver) {
		super(driver);
		this.androidDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Expense\"]")
	private WebElement expenseicon;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement namedropdownbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"My-Self\"]")
	private WebElement myselfoption;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement jan2024barchart;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement checkBox;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement submitExpensesbutton;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement userDropDownButtontoSelectEmployeename;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Arpan Bezbaruah    \"]")
	private WebElement employeenameArpanBezbaruah;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement employeeexpenseBarchart;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement expenselistCheckBox;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[6]/android.view.ViewGroup")
	private WebElement expenselistviewbutton;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup")
	private WebElement  viewDArReport;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement dRAactivityreportcrossbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"\"]")
	private WebElement editTAButton;
	
	@FindBy(xpath="//android.widget.EditText[@text=\"222.00\"]")
	private WebElement amountTab;
	
	@FindBy(xpath="//android.widget.EditText[@text=\"444\"]")
	private WebElement amount444;
	
	@FindBy(xpath="//android.widget.EditText[@text=\"Enter note\"]")
	private WebElement enternoteTab;
	
	@FindBy(xpath="//android.widget.EditText[@text=\"Test\"]")
	private WebElement  noteTest;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")
	private WebElement submitButton;
	
	@FindBy(xpath="//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup")
	private WebElement detailsButton;
	
	@FindBy(xpath="")
	private WebElement addReceiptbutton;
	
	@FindBy(xpath="")
	private WebElement cameraoption;
	
	@FindBy(xpath="")
	private WebElement cameraCapturebutton;
	
	@FindBy(xpath="")
	private WebElement oKbutton;
	
	@FindBy(xpath="")
	private WebElement enterAmountButtonofPopupwindow;
	
	@FindBy(xpath="")
	private WebElement enterDescriptionofpopupwindow;
	
	@FindBy(xpath="")
	private WebElement  windowSubmitbutton;
	
	@FindBy(xpath="")
	private WebElement editbuttonofattachmentdetails;
	
	@FindBy(xpath="")
	private WebElement amounttabForeditingtheamount;
	
	@FindBy(xpath="")
	private WebElement submitbuttonofediting;
	
	@FindBy(xpath="")
	private WebElement deletebutton;
	
	@FindBy(xpath="")
	private WebElement deletePopupYesbutton;
	
	@FindBy(xpath="")
	private WebElement addNewExpensbutton;
	
	@FindBy(xpath="")
	private WebElement  ownStayCheckbox;
	
	@FindBy(xpath="")
	private WebElement plusAddButton;
	
	@FindBy(xpath="")
	private WebElement backarrowbuttonofEmployee360viewpage;
	
	@FindBy(xpath="")
	private WebElement backArrowofexpansepageoflasttoreturendashboardpage;
	
	
	
	
	public void clickExpenseicon() {
		Assert.assertEquals(true, clickOnElement(expenseicon));
	}
	
	public void clickNamedropdownbutton() {
		Assert.assertEquals(true, clickOnElement(namedropdownbutton));
	}
	
	public void clickMyselfoption() {
		Assert.assertEquals(true, clickOnElement(myselfoption));
	}
	
	public void clickJan2024barchart() {
		Assert.assertEquals(true, clickOnElement(jan2024barchart));
	}
	
	public void clickCheckBox() {
		Assert.assertEquals(true, clickOnElement(checkBox));
	}
	
	public void clickSubmitExpensesbutton() {
		Assert.assertEquals(true, clickOnElement(submitExpensesbutton));
	}
	
	public void clickUserDropDownButtontoSelectEmployeename() {
		Assert.assertEquals(true, clickOnElement(userDropDownButtontoSelectEmployeename));
	}
	
	public void clickEmployeeNameArpanBezbaruah() {
		Assert.assertEquals(true, clickOnElement(employeenameArpanBezbaruah));
	}
	
	public void clickEmployeeExpenseBarchartofJan2024() {
		Assert.assertEquals(true, clickOnElement(employeeexpenseBarchart));
	}
	
	public void clickExpenselistCheckBox() {
		Assert.assertEquals(true, clickOnElement(expenselistCheckBox));
	}
	
	public void clickExpenselistviewbutton() {
		Assert.assertEquals(true, clickOnElement(expenselistviewbutton));
	}
	
	public void clickViewDARReport() {
		Assert.assertEquals(true, clickOnElement(viewDArReport));
	}
	
	public void clickDRAactivityReportCrossButton() {
		Assert.assertEquals(true, clickOnElement(dRAactivityreportcrossbutton));
	}
	
	public void clickEditTAButton() {
		Assert.assertEquals(true, clickOnElement(editTAButton));
	}
	
	public void clickAmountTab() {
		Assert.assertEquals(true, clickOnElement(amountTab));
	}
	
	public void enterTheAmount444() {
		Assert.assertEquals(true, typeOnElement(amount444, addNewExpensbutton));
	}
	
	public void clickEnternoteTab() {
		Assert.assertEquals(true, clickOnElement(enternoteTab));
	}
	
	public void enterNoteTest() {
		Assert.assertEquals(true, clickOnElement(noteTest));
	}
	
	public void clickSubmitButton() {
		Assert.assertEquals(true, clickOnElement(submitButton));
	}
	
	public void clickDetailsButton() {
		Assert.assertEquals(true, clickOnElement(detailsButton));
	}
	
	public void clickAddReceiptbutton() {
		Assert.assertEquals(true, clickOnElement(addReceiptbutton));
	}
	
	public void clickCameraoption() {
		Assert.assertEquals(true, clickOnElement(cameraoption));
	}
	
	public void clickCameraCapturebutton() {
		Assert.assertEquals(true, clickOnElement(cameraCapturebutton));
	}
	
	public void clickOKbutton() {
		Assert.assertEquals(true, clickOnElement(oKbutton));
	}
	
	public void clickEnterAmountButtonofPopupwindow() {
		Assert.assertEquals(true, clickOnElement(enterAmountButtonofPopupwindow));
	}
	
	public void clickEnterDescriptionofpopupwindow() {
		Assert.assertEquals(true, clickOnElement(enterDescriptionofpopupwindow));
	}
	
	public void clickWindowSubmitbutton() {
		Assert.assertEquals(true, clickOnElement(windowSubmitbutton));
	}
	
	public void clickEditbuttonofattachmentdetails() {
		Assert.assertEquals(true, clickOnElement(editbuttonofattachmentdetails));
	}
	
	public void clickAmounttabForeditingtheamount() {
		Assert.assertEquals(true, clickOnElement(amounttabForeditingtheamount));
	}
	
	public void clickSubmitbuttonofediting() {
		Assert.assertEquals(true, clickOnElement(submitbuttonofediting));
	}
	
	public void clickDeletebutton() {
		Assert.assertEquals(true, clickOnElement(deletebutton));
	}
	
	public void clickDeletePopupYesbutton() {
		Assert.assertEquals(true, clickOnElement(deletePopupYesbutton));
	}
	
	public void clickAddNewExpensebutton() {
		Assert.assertEquals(true, clickOnElement(addNewExpensbutton));
	}
	
	public void clickOwnStayCheckbox() {
		Assert.assertEquals(true, clickOnElement(ownStayCheckbox));
	}
	
	public void clickPlusAddButton() {
		Assert.assertEquals(true, clickOnElement(plusAddButton));
	}
	
	public void clickBackarrowbuttonofEmployee360viewpage() {
		Assert.assertEquals(true, clickOnElement(backarrowbuttonofEmployee360viewpage));
	}
	
	public void clickBackArrowofexpansepageoflasttoreturendashboardpage() {
		Assert.assertEquals(true, clickOnElement(backArrowofexpansepageoflasttoreturendashboardpage));
	}
	
}