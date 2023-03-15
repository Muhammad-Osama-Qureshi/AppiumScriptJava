package test.apilearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import test.utils.AppiumDriverEx;

import java.util.List;

public class HandlemultiplematchedElement {
    public static void main(String[] args) {
        AppiumDriver appiumDriver= AppiumDriverEx.getAppiumDriver();
        //click on login Label
        WebElement loginLabel=appiumDriver.findElementByAccessibilityId("Login");
        loginLabel.click();
        //Find element those are matched //*[@text="Login"]
        List<WebElement> loginTextElements=appiumDriver.findElementsByXPath("//*[@text='Login']");
        System.out.println("How many elements matched "+ loginTextElements.size());
        WebElement firstloginTestElem=appiumDriver.findElementByXPath("//*[@text='Login']");
        firstloginTestElem.click();
        final int LOGIN_TEXT_FORM_INDEX=0;
        final int LOGIN_MENU_TEXT_INDEX=1;
        loginTextElements.get(LOGIN_TEXT_FORM_INDEX).click();
        loginTextElements.get(LOGIN_MENU_TEXT_INDEX).getText();


    }
}
