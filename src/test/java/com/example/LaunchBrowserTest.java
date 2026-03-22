package com.example;

import org.testng.annotations.Test;

public class LaunchBrowserTest extends BaseTest{
	
	
	@Test
	public void LaunchBrowserTest() {
		System.out.println("Hi launched successfully");
		driver.get("");
	}

}
