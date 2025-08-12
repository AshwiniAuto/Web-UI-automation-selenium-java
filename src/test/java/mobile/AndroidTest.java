package mobile;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.time.Duration;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AndroidTest { 
	
	
	
	public static AndroidDriver driver;
	
	
	
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new  DesiredCapabilities();
		cap.setCapability("noReset", true);
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "14");
		cap.setCapability("udid", "10BDBB0GQL000US");
		cap.setCapability("deviceName", "vivo V29e");
		//cap.setCapability("appPackage", "com.vivo.calculator");
		//cap.setCapability("appActivity", "com.vivo.calculator.Calculator");
		
		cap.setCapability("appPackage", "com.truesalesmrs");
		cap.setCapability("appActivity", "com.truesalesmrs.MainActivity");
	    //com.google.android.apps.nbu.files
		//com.truesalesmrs.MainActivity
		
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Customers']")).click();
		   
	        WebElement mobileNumberField = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter Mobile number\"]"));
	        mobileNumberField.sendKeys("9674759600");

	        WebElement sendOtpButton = driver.findElement(By.xpath("//android.widget.TextView[@text=\" Send OTP \"]"));
	        sendOtpButton.click();

	       Thread.sleep(3000);
	     
	        WebElement passwordField = driver.findElement(By.xpath("//android.widget.EditText"));
	        passwordField.sendKeys("152535");

	       WebElement verifyButton = driver.findElement(By.xpath("//android.widget.TextView[@text=\" Verify \"]"));
	        verifyButton.click();
	        
	        Thread.sleep(17000);
	        
	       driver.findElement(By.xpath("//android.widget.TextView[@text=\" Change Date\"]")).click();
	       
	       Thread.sleep(1000);
	       
	       driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.RadioButton/android.view.ViewGroup")).click();
	       
	       driver.findElement(By.xpath("(//android.widget.TextView[@text=\" Open \"])[1]")).click();
	       
	       driver.findElement(By.xpath("//android.widget.TextView[@text=\" Start My Day \"]")).click();
	       
	       driver.findElement(By.xpath("//android.widget.TextView[@text=\"-Choose Town-\"]")).click();
	       
	       driver.findElement(By.xpath("//android.widget.TextView[@text=\"AAA\"]")).click();
	       
	       driver.findElement(By.xpath("//android.widget.TextView[@text=\" Submit \"]")).click();
	       

         

	}

}
