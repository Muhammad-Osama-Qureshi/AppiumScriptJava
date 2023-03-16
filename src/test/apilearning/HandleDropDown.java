package test.apilearning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import test.utils.AppiumDriverEx;

public class HandleDropDown {
    public static void main(String[] args) {
        AppiumDriver appiumDriver= AppiumDriverEx.getAppiumDriver();
        WebElement forms=appiumDriver.findElementByAccessibilityId("Forms");
        forms.click();
        WebElement ClickDropDown=appiumDriver.findElementByXPath("//android.view.ViewGroup[@content-desc=\'Dropdown\']/android.view.ViewGroup/android.widget.EditText");
        ClickDropDown.click();
        WebElement selectFromMenu=appiumDriver.findElementByXPath("//*[@text='Appium is awesome']");
        selectFromMenu.click();

    }
}
