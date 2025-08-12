package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import wrappermethod.AndroidDirverMethods;

public class MtpPage extends AndroidDirverMethods{
	
	AndroidDriver androidDriver;

	public  MtpPage (AndroidDriver driver) {
		super(driver);
		this.androidDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"MTP\"]")
	private WebElement mTPIcon;
	
	@FindBy(xpath = "//div[@class='_highlighter-box_619e8'])[63]")
	private WebElement monthDropDownButton;
	
	@FindBy(xpath = "//div[@class='_highlighter-box_619e8 _inspected-element-box_619e8']")
	private WebElement febmonthoption;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\" Create New MTP \"]")
	private WebElement createNewMTPbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"My Self\"]")
	private WebElement februaryMonthDraftSction;
	
	@FindBy(xpath = "(//android.widget.TextView[@text=\"Plan\"])[1]")
	private WebElement planbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement selectdropdownbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"FW\"]")
	private WebElement fWoption;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"])[2]")
	private WebElement territorySelectdropdownbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Meerut  2 | ABHINAV \"]")
	private WebElement meerut2ABHINAVOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"])[3]")
	private WebElement patchselectdropdownbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Dhampur\"]")
	private WebElement dhampuroption;
	
	@FindBy(xpath = "//div[@class='_highlighter-box_619e8 _inspected-element-box_619e8']")
	private WebElement customercheckboxButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\" Save Data \"]")
	private WebElement saveDatabutton;
	
	@FindBy(xpath = "(//android.widget.TextView[@text=\"\"])[1]")
	private WebElement activitydropdown;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"JW\"]")
	private WebElement jWoption;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Meerut  1 | Mohd Sadik    \"]")
	private WebElement meerut1MohdSadik;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"NCA\"]")
	private WebElement nCAoption;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"])[2]")
	private WebElement nCATypesDropdownbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Transit\"]")
	private WebElement transit;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"])[3]")
	private WebElement townSelectDropdownButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Adalhat\"]")
	private WebElement adalhatoption;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\" Save Data \"]")
	private WebElement saveButtonOfNCA;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"\"]")
	private WebElement backarrowbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Reset\"]")
	private WebElement resetbutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\" Submit MTP \"]")
	private WebElement submitMTPButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Requested\"]")
	private WebElement requestedMTPSection;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\" Approve MTP \"]")
	private WebElement approvedoption;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\" Reject MTP \"]")
	private WebElement rejectbutton;
	
	
	
	 public void clickMTPIcon() {
	    	Assert.assertEquals(true, clickOnElement(mTPIcon));
	 }
	 
	 public void clickMonthDropDownButton() {
		    Assert.assertEquals(true, clickOnElement(monthDropDownButton));  
	 }
	 
  public void clickFebmonthoption() {
		   Assert.assertEquals(true, clickOnElement(febmonthoption));
  }
  
  public void clickCreateNewMTPbutton() {
		   Assert.assertEquals(true, clickOnElement(createNewMTPbutton));
  }
  
	 public void clickFebruaryMonthDraftSction() {
		Assert.assertEquals(true, clickOnElement(februaryMonthDraftSction));
	 }
	 
	 public void clickPlanbutton() {
		Assert.assertEquals(true, clickOnElement(planbutton));
	 }
	 
	 
	 public void clickSelectdropdownbutton() {
		 Assert.assertEquals(true, clickOnElement(selectdropdownbutton));
	 }
		 
	public void clickFWoption() {
	    Assert.assertEquals(true, clickOnElement(fWoption));  
	}
	
	public void clickTerritorySelectdropdownbutton() {
		Assert.assertEquals(true, clickOnElement(territorySelectdropdownbutton));  
	}
		 
	public void clickMeerut2ABHINAVOption() {
	    Assert.assertEquals(true, clickOnElement(meerut2ABHINAVOption));
	}
	     
	     public void clickPatchselectdropdownbutton() {
			   Assert.assertEquals(true, clickOnElement(patchselectdropdownbutton));
	     }
	     
	     public void clickDhampuroption() {
			 Assert.assertEquals(true, clickOnElement(dhampuroption));  
	     }
	     
	     public void clickCustomercheckboxButton() {
			 Assert.assertEquals(true, clickOnElement(customercheckboxButton));  
	     }
		 
		public void clickSaveDatabutton() {
			 Assert.assertEquals(true, clickOnElement(saveDatabutton));
		}
		
		public void clickActivitydropdown() {
			 Assert.assertEquals(true, clickOnElement(activitydropdown));
		}			
				 
		public void clickJWoption() {
			Assert.assertEquals(true, clickOnElement(jWoption));
		}				
					 
		public void clickMeerut1MohdSadik() {
		 Assert.assertEquals(true, clickOnElement(meerut1MohdSadik));
		}
		
	    public void clickNCAoption() {
			 Assert.assertEquals(true, clickOnElement(nCAoption));
	    }
	    
	    public void clickNCATypesDropdownbutton() {
			Assert.assertEquals(true, clickOnElement(nCATypesDropdownbutton));
	    }
	    
	    public void clickTransit() {
			Assert.assertEquals(true, clickOnElement(transit));
	    }
	    
		public void clickTownSelectDropdownButton() {
			Assert.assertEquals(true, clickOnElement(townSelectDropdownButton));
		}
		
		public void clickAdalhatoption() {
			Assert.assertEquals(true, clickOnElement(adalhatoption));
		}
		
		public void clickSaveButtonOfNCA() {
			Assert.assertEquals(true, clickOnElement(saveButtonOfNCA));
		}
		
		public void clickBackarrowbutton() {
			Assert.assertEquals(true, clickOnElement(backarrowbutton));
		}
		
		public void clickResetbutton() {
			Assert.assertEquals(true, clickOnElement(resetbutton));
		}
		
		public void clickSubmitMTPButton()  {
			Assert.assertEquals(true, clickOnElement(submitMTPButton));
		}
		
		public void clickRequestedMTPSection() {
			Assert.assertEquals(true, clickOnElement(requestedMTPSection));
		}
		
		public void clickApprovedoption() {
			Assert.assertEquals(true, clickOnElement(approvedoption));
		}
		
		public void clickRejectbutton() {
			Assert.assertEquals(true, clickOnElement(rejectbutton));
		}
		
		
}