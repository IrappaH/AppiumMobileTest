package util;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GestureUtils {

   

    // 🔹 Scroll Down
    public static void scrollDown(AppiumDriver driver) {
        driver.executeScript("mobile: scrollGesture", Map.of(
                "left", 100, "top", 100,
                "width", 800, "height", 1200,
                "direction", "down",
                "percent", 0.8
        ));
    }

    // 🔹 Scroll to Element (Text)
    public static void scrollToText(String text,AppiumDriver driver) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"
        ));
    }

    // 🔹 Swipe
    public static void swipeUp(AppiumDriver driver) {
        driver.executeScript("mobile: swipeGesture", Map.of(
                "left", 100, "top", 100,
                "width", 800, "height", 1200,
                "direction", "up",
                "percent", 0.8
        ));
    }

    // 🔹 Long Press
    public static void longPress(WebElement element,AppiumDriver driver) {
        driver.executeScript("mobile: longClickGesture", Map.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "duration", 2000
        ));
    }

    // 🔹 Drag and Drop
    public static void dragAndDrop(WebElement element, int x, int y,AppiumDriver driver) {
        driver.executeScript("mobile: dragGesture", Map.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", x,
                "endY", y
        ));
    }
}