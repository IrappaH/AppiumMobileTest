package util;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
	
	protected static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
	
	public static void setDriver(AppiumDriver driverinstance) {
		driver.set(driverinstance);
	}
	
	public static AppiumDriver getDiver() {
		return driver.get();
		}
	
	public static void removeDriver() {
		driver.remove();
	}


}
