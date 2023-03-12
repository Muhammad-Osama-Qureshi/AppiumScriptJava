package test.apilearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import test.utils.AppiumDriverEx;

public class setValues {
    public static void main(String[] args) {
        AppiumDriver<WebElement> appiumDriver=AppiumDriverEx.getAppiumDriver();
        WebElement loginLabel=appiumDriver.findElementByAccessibilityId("Login");
        loginLabel.click();
        WebElement usernamebtn=appiumDriver.findElementByAccessibilityId("input-email");
        usernamebtn.sendKeys("Osama@gmail.com");
        WebElement pass=appiumDriver.findElementByAccessibilityId("input-password");
        pass.sendKeys("wdjasdja");
        WebElement loginBtn=appiumDriver.findElementByAccessibilityId("button-LOGIN");
        loginBtn.click();


        //1: Launch the target app
        // Click on Login
        // input username
        // input password
        // click on login
    }
}
