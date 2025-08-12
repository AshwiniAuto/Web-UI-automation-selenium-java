package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class AndroidDriverFactory {
	
	public static AndroidDriver androidDriver;	
	private URL url;

	

    public AndroidDriver browserSetup() {
    	
    	DesiredCapabilities cap = new  DesiredCapabilities();
    	try {
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
		
		
		
			url = new URL("http://localhost:4724/wd/hub");
			androidDriver = new AndroidDriver(url, cap);
			androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	return androidDriver;
	
}

}
