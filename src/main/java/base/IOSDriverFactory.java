package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class IOSDriverFactory {
	
	public static IOSDriver iosDriver;	
	private URL url;

	

    public IOSDriver browserSetup() {
    	//capabilities.setCapability("os_version", "15");
    	//capabilities.setCapability("device", "iPad 9th");
    	
    	DesiredCapabilities cap = new  DesiredCapabilities();
		cap.setCapability("noReset", true);
		cap.setCapability("platformName", "iOS");
		cap.setCapability("platformVersion", "17.4.1");
		cap.setCapability("udid", "");
		cap.setCapability("deviceName", "iPad 9th");
		//cap.setCapability("appPackage", "com.vivo.calculator");
		//cap.setCapability("appActivity", "com.vivo.calculator.Calculator");
		cap.setCapability("appPackage", "com.truesalesmrs");
		cap.setCapability("appActivity", "com.truesalesmrs.MainActivity");
	    //com.google.android.apps.nbu.files
		//com.truesalesmrs.MainActivity
		
		
		try {
			url = new URL("http://localhost:4723/wd/hub");
			iosDriver = new IOSDriver(url, cap);
			iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	return iosDriver;
	
}

}
