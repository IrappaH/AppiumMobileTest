package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.lib;

public class LoginPage extends BasePage{
	
	public LoginPage(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="com.google.android.calculator:id/digit_2")
	private WebElement numtwo;
	
	public void addNumtwo() {
		numtwo.click();
		
	}
	@AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
	private WebElement numEight;

	public void addNumEight() {
		numEight.click();
		
	}
	@AndroidFindBy(id="com.google.android.calculator:id/op_add")
	private WebElement plusSymbol;

	public void PlusSymbol() {
		plusSymbol.click();
		
	}
	@AndroidFindBy(id="com.google.android.calculator:id/eq")
	private WebElement equalSymbol;

	public void equalSymbol() {
		equalSymbol.click();
		
	}
	
	@AndroidFindBy(className="android.widget.TextView")
	private WebElement getResult;
	
	
	public String getResult(AppiumDriver driver) {
		waitForElement(driver, getResult, 10);
		return getResult.getText();
		 
		
		
	}
}
