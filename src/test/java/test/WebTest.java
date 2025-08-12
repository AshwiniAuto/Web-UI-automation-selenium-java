package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tspc-alembic.herokuapp.com/");
        
        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        usernameField.sendKeys("sachin.kadam@alembic.co.in");
        passwordField.sendKeys("12345678");
        loginButton.click();
	
	 try {
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

    driver.quit();
}
}