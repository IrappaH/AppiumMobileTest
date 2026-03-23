package com.example;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import pages.LoginPage;
import util.GestureUtils;

public class LoginTest extends AppiumBaseTest {

	@Test(priority = 1)
	public void AddNum() throws MalformedURLException, InterruptedException {
		 ExtentTest test = extent.createTest("Verify Login Test");
		 test.info("Launching application");
		LoginPage lp = new LoginPage(driver);
		lp.addNumtwo();
		lp.PlusSymbol();
		lp.addNumEight();
		lp.equalSymbol();
		String result = lp.getResult(driver);
		if (result.equals("10")) {
			System.out.println("The addition of 2 and 8 is correct and it is :" + result);
			test.info("The Expected result is "+result);

		} else {
			System.out.println("The addition of 2 and 8 is not correct and it is:" + result);
			test.info("The Expected result is "+result);
		}
		test.pass("Login successful");
	}

	@Test(priority = 2)
	public void Calcwer() throws MalformedURLException, InterruptedException {
		 ExtentTest test = extent.createTest("Verify Login Test");
		 test.info("Launching application");
		 GestureUtils.scrollDown(driver);
		 System.out.println("The scroll down is done");
		test.pass("Login successful");
	}
	
	@Test(priority = 3)
	public void Calc() throws MalformedURLException, InterruptedException {
		 ExtentTest test = extent.createTest("Verify Login Test");
		 test.info("Launching application");
		 GestureUtils.swipeUp(driver);
		test.pass("Login successful");
	}
	

	@Test(priority = 4)
	public void CalcTest() throws MalformedURLException, InterruptedException {
		 ExtentTest test = extent.createTest("Verify Login Test");
		 test.info("Launching application");
		
		test.pass("Login successful");
	}
	
	
}
