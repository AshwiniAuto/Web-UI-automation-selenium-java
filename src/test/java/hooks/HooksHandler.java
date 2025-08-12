package hooks;


//import org.openqa.selenium.WebDriver;
import base.AndroidDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import wrappermethod.AndroidDirverMethods;

public class HooksHandler {
	AndroidDriverFactory androidDriverFactory;
	public static AndroidDriver androidDriver;

	@Before
	public void before() {
		androidDriverFactory = new AndroidDriverFactory();
		androidDriver = androidDriverFactory.browserSetup();
	}
	
	//@AfterStep
	public void afterStep(Scenario scenario) {
		scenario.attach(AndroidDirverMethods.mailAttachFullPageScreenshot(scenario.getName()), "image/png",
				scenario.getName());
		
	}

	@After
	public void after(Scenario scenario) {

		if (!scenario.isFailed()) {

			System.out.println("==============================================================");
			System.out.println("PASS " + scenario.getName());
			System.out.println("==============================================================");
			scenario.attach(AndroidDirverMethods.mailAttachFullPageScreenshot(scenario.getName()), "image/png",
					scenario.getName());
			// WebDirverMethods.mailAttachFullPageScreenshot(scenario.getName());
		} 
		if (scenario.isFailed()) {
			System.out.println("==============================================================");
			System.out.println("FAIL " + scenario.getName());
			System.out.println("==============================================================");
			scenario.attach(AndroidDirverMethods.mailAttachFullPageScreenshot(scenario.getName()), "image/png",
					scenario.getName());
			System.out.println(scenario.toString());
			// WebDirverMethods.mailAttachFullPageScreenshot(scenario.getName());
		}

	}
}
