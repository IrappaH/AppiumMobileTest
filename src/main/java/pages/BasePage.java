package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {
	
	public void waitForElement(AppiumDriver driver, WebElement element, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    wait.until(ExpectedConditions.visibilityOf(element));
	}

}
