package runner;

import org.testng.annotations.AfterSuite;

import hooks.HooksHandler;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

			features = "src/test/resources/features",
			glue = { "hooks", "stepdefinition" },
			monochrome = true,
			plugin = { "pretty", "html:test-report/cucumber-report.html",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			tags = "@MobileInputInventory",
			dryRun = false
			
	
	)

	/**
	 *
	 * 
	 *   
	 * @author AshwiniBand
	 *
	 */
	public class TestRunner extends AbstractTestNGCucumberTests{
	
	@AfterSuite
	public void tearDown() {
		if(HooksHandler.androidDriver != null)
		{
		HooksHandler.androidDriver.close();
		HooksHandler.androidDriver.quit();
		}
	}
		
	

	}


