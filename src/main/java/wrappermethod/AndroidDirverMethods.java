package wrappermethod;

import java.io.File;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.nio.file.Files;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class  AndroidDirverMethods {
	
	
	static AndroidDriver driver;
	 WebDriverWait wait;
	
	public  AndroidDirverMethods(AndroidDriver driver) {
		 AndroidDirverMethods.driver=driver;
		
	}
	
	protected boolean scrollInto(final WebElement element) {
		boolean flag = false;
		visibilityOfElement(element);
		try {
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	protected boolean clickOnElement(WebElement element) {
		Assert.assertEquals(true, visibilityOfElement(element));
		boolean flag = false;
		try {
			//scrollInto(element);
			element.click();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	protected boolean clickOnElementJs(WebElement element) {
		boolean flag = false;
		try {
			  wait = new  WebDriverWait(driver, Duration.ofSeconds(160));
			//wait.until(ExpectedConditions.elementToBeClickable(element));
			scrollInto(element);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(" + element.getLocation().x + "," + element.getLocation().y + ")");
			js.executeScript("arguments[0].click();", element);
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}
	
	protected boolean typeOnElement(WebElement element, Object text) {
		Assert.assertEquals(true, visibilityOfElement(element));
		boolean flag = false;
		try {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE) + text);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	protected boolean typeOnElementTwo(WebElement element, String text) {
		Assert.assertEquals(true, visibilityOfElement(element));
		boolean flag = false;
		try {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			element.sendKeys(text);
			element.sendKeys(Keys.ENTER);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	protected String extractElementText(final WebElement element) {
		Assert.assertEquals(true, visibilityOfElement(element));
		String text = null;
		visibilityOfElement(element);
		try {
			
			scrollInto(element);
			text = element.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	
	protected boolean visibilityOfElement(WebElement element) {
		boolean flag = false;
		try {
		
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(160));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.ignoring(NoSuchElementException.class);
			wait.ignoring(StaleElementReferenceException.class);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public static byte[] mailAttachFullPageScreenshot(String serviceName) {
		File file = null;
		byte[] fileContent=null;
		try {
			file = new File("./screenshot/" + serviceName + ".png");
			Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver);
			ImageIO.write(s.getImage(), "PNG", file);
			fileContent = Files.readAllBytes(file.toPath());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fileContent;
	}
}
