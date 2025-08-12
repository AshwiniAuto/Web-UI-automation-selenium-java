package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import wrappermethod.AndroidDirverMethods;

public class MobileLeavePage  extends AndroidDirverMethods{
	
	AndroidDriver androidDriver;

	public MobileLeavePage(AndroidDriver driver) {
		super(driver);
		this.androidDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//android.widget.TextView[@text=\"Leaves\"]")
	WebElement leaveicon;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" My Leave Dashboard \"]")
	WebElement myleaveDashboard;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Apply Leave \"]")
	WebElement applyleave;
	
	@FindBy(xpath= "(//android.widget.TextView[@text=\"\"])[1]")
	WebElement fromdateCalandericon;
	
	@FindBy(xpath= "//android.view.View[@content-desc=\"28 February 2024\"]")
	WebElement fromdate;
	
	@FindBy(xpath="//android.widget.Button[@resource-id=\"android:id/button1\"]")
	WebElement fromDateCalanderOk;
	
	@FindBy(xpath= "(//android.widget.TextView[@text=\"\"])[2]")
	WebElement todateCalandericon;
	
	@FindBy(xpath= "//android.view.View[@content-desc=\"29 February 2024\"]")
	WebElement todate;
	
	@FindBy(xpath= "//android.widget.Button[@resource-id=\"android:id/button1\"]")
	WebElement toDateCalanderOk;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\"\"]")
	WebElement leavetypedropdownbutton;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\"Leave Without Pay\"]")
	WebElement leavewithoutpayoption;
	
	@FindBy(xpath= "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[6]/android.view.ViewGroup[2]/android.widget.EditText")
	WebElement enterReamrkTab;
	
	@FindBy(xpath= "//android.widget.EditText[@text=\"Est\"]")
	WebElement test;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Submit \"]")
	WebElement submitButton;
	
	@FindBy(xpath= "//div[@class='_highlighter-box_619e8 _inspected-element-box_619e8']")
	WebElement yearlyButton;
	
	@FindBy(xpath= "(//div[@class='_highlighter-box_619e8'])[82]")
	WebElement currentmonthoption;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" View \"]")
	WebElement viewButton;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\"\"]")
	WebElement crossicon;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\"\"]")
	WebElement backArrowofleaveManagement;
	
	@FindBy(xpath= "(//android.widget.TextView[@text=\" View \"])[1]")
	WebElement viewbuttonofDheerajKumaruser;
	
	@FindBy(xpath= "(//android.widget.TextView[@text=\" View \"])[2]")
	WebElement userleaveviewbutton;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Accept Request \"]")
	WebElement acceptRequestButton;
	
	@FindBy(xpath= "(//android.widget.TextView[@text=\" View \"])[2]")
	WebElement userApprovedviewbutton;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Cancel Leave \"]")
	WebElement cancelLeaveButton;
	
	@FindBy(xpath= "//android.widget.EditText")
	WebElement blanckTab;
	
	@FindBy(xpath= "//android.widget.EditText[@text=\"Testing\"]")
	WebElement testing;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Cancel Leave \"]")
	WebElement cancelLeavebuttonofPopup;
	
	@FindBy(xpath= "(//android.widget.TextView[@text=\" View \"])[1]")
	WebElement otheruserviewbutton;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Reject Request \"]")
	WebElement rejectRequestButton;
	
	@FindBy(xpath= "//android.widget.EditText")
	WebElement remarkTab;
	
	@FindBy(xpath= "//android.widget.EditText[@text=\"Testo\"]")
	WebElement testto;
	
	@FindBy(xpath= "//android.widget.TextView[@text=\" Reject Request \"]")
	WebElement rejectionReasononRejectRequestbutton;
	
	 public void clickleaveicon() {
	    	Assert.assertEquals(true, clickOnElement(leaveicon));
	 }
	 
	 public void clickmyleaveDashboard() {
		    Assert.assertEquals(true, clickOnElement(myleaveDashboard));  
	 }
	 
     public void clickapplyleave() {
		   Assert.assertEquals(true, clickOnElement(applyleave));
     }
     
     public void clickfromdateCalandericon() {
		   Assert.assertEquals(true, clickOnElement(fromdateCalandericon));
     }
     
     
     
	 public void clickfromdate() {
		Assert.assertEquals(true, clickOnElement(fromdate));
	 }
	 
	 public void clickfromDateCalanderOk() {
		Assert.assertEquals(true, clickOnElement(fromDateCalanderOk));
	 }
	 
	 
	 public void clicktodateCalandericon() {
		 Assert.assertEquals(true, clickOnElement(todateCalandericon));
	 }
	 
	 public void clicktoDateCalanderOk() {
			Assert.assertEquals(true, clickOnElement(toDateCalanderOk));  
		}
		 
	public void clicktodate() {
	    Assert.assertEquals(true, clickOnElement(todate));  
	}
		 
	public void clickleavetypedropdownbutton() {
	    Assert.assertEquals(true, clickOnElement(leavetypedropdownbutton));
	}
	     
	     public void clickleavewithoutpayoption() {
			   Assert.assertEquals(true, clickOnElement(leavewithoutpayoption));
	     }
	     
	     public void clickenterReamrkTab() {
			 Assert.assertEquals(true, clickOnElement(enterReamrkTab));  
	     }
	     
		 public void entertesttypeintheremarktab(String est) {
			Assert.assertEquals(true, typeOnElementTwo(test, est));
		}

		public void clicksubmitButton() {
			 Assert.assertEquals(true, clickOnElement(submitButton));
		}
		
		public void clickyearlyButton() {
			 Assert.assertEquals(true, clickOnElement(yearlyButton));
		}			
				 
		public void clickcurrentmonthoption() {
			Assert.assertEquals(true, clickOnElement(currentmonthoption));
		}				
					 
		public void clickviewButton() {
		 Assert.assertEquals(true, clickOnElement(viewButton));
		}
		
	    public void clickcrossicon() {
			 Assert.assertEquals(true, clickOnElement(crossicon));
	    }
	    
	    public void clickbackArrowofleaveManagement() {
			Assert.assertEquals(true, clickOnElement(backArrowofleaveManagement));
	    }
	    
	    public void clickviewbuttonofDheerajKumaruser() {
			Assert.assertEquals(true, clickOnElement(viewbuttonofDheerajKumaruser));
	    }
	    
		public void clickuserleaveviewbutton() {
			Assert.assertEquals(true, clickOnElement(userleaveviewbutton));
		}
		
		public void clickacceptRequestButton() {
			Assert.assertEquals(true, clickOnElement(acceptRequestButton));
		}
		
		public void clickuserApprovedviewbutton() {
			Assert.assertEquals(true, clickOnElement(userApprovedviewbutton));
		}
		
		public void clickcancelLeaveButton() {
			Assert.assertEquals(true, clickOnElement(cancelLeaveButton));
		}
		
		public void clickblanckTab() {
			Assert.assertEquals(true, clickOnElement(blanckTab));
		}
		
		public void enter1testingtypeinthereamrktab()  {
			Assert.assertEquals(true, typeOnElementTwo(acceptRequestButton, "testing"));
		}
		
		public void clickcancelLeavebuttonofPopup() {
			Assert.assertEquals(true, clickOnElement(cancelLeavebuttonofPopup));
		}
		
		public void clickotheruserviewbutton() {
			Assert.assertEquals(true, clickOnElement(otheruserviewbutton));
		}
		
		public void clickrejectRequestButton() {
			Assert.assertEquals(true, clickOnElement(rejectRequestButton));
		}
		
		public void clickremarkTab() {
			Assert.assertEquals(true, clickOnElement(remarkTab));
		}
		
		public void enter2Testtotypeinthereamrktab(String estto) {
			Assert.assertEquals(true, typeOnElement(testto ,estto ));
		}
		
		public void clickrejectionReasononRejectRequestbutton() {
			Assert.assertEquals(true, clickOnElement(rejectionReasononRejectRequestbutton));
		}

		
		}
	


