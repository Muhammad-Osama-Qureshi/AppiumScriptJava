package test.apilearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import test.utils.AppiumDriverEx;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class clickonElement {
    public static void main(String[] args) {
            AppiumDriver<WebElement>appiumDriver= AppiumDriverEx.getAppiumDriver();
            WebElement loginLabel=appiumDriver.findElementByAccessibilityId("Login");
            loginLabel.click();

        }
    }

