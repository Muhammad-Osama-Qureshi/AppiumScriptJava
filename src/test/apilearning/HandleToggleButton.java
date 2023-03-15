package test.apilearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import test.utils.AppiumDriverEx;

public class HandleToggleButton {
    public static void main(String[] args) {
        AppiumDriver<WebElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        //get the toggle label value before interacting with the switch
        WebElement formElement=appiumDriver.findElementByAccessibilityId(("Forms"));
        formElement.click();
        WebElement switchTextElement=appiumDriver.findElementByAccessibilityId("switch-text");
        System.out.println("Label Text before interacting the switch toggle bar"+ switchTextElement.getText());

        WebElement switchElement=appiumDriver.findElementByAccessibilityId("switch");
        switchElement.click();
        System.out.println("Label text after interacting with toggle button"+ switchTextElement.getText());


        //click on toggle button
    }
}
