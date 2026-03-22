package com.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.time.Duration;
import util.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBaseTest {
	protected AppiumDriver driver;
	
	
	 public static ExtentReports extent;

	    @BeforeSuite
	    public void setupReport() {
	        extent = ExtentManager.getReporter();
	    }

	    @AfterSuite
	    public void tearDownReport() {
	        extent.flush();
	    }
	
	@BeforeTest
	public void  LaunchAndroidApp() throws InterruptedException, MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("ZA222Q59MB");
		options.setPlatformName("Android");
		options.setAppPackage("com.google.android.calculator");
		options.setAppActivity("com.android.calculator2.Calculator");
		options.setAutomationName("UiAutomator2");
		options.setUiautomator2ServerLaunchTimeout(Duration.ofSeconds(60));		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);		
		System.out.println("calculator App Launched Successfully");
		
		util.DriverManager.setDriver(driver);

	}
	@AfterTest
	public void tearDown() {
		util.DriverManager.getDiver().quit();
		util.DriverManager.removeDriver();
		
	}

}
