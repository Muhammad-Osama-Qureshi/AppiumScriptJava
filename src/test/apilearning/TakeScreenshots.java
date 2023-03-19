package test.apilearning;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import test.utils.AppiumDriverEx;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {
    public static void main(String[] args) {
        //Create a session
        AppiumDriver<WebElement> appiumDriver = AppiumDriverEx.getAppiumDriver();

        //Navigate to form screen
        WebElement formLabel = appiumDriver.findElementByAccessibilityId("Forms");
        formLabel.click();

        // click on toggle button if it is OFFz
        WebElement switchElement = appiumDriver.findElementByAccessibilityId("switch");
        WebElement switchTextElement = appiumDriver.findElementByAccessibilityId("switch-text");
        final boolean isSwitchOn = switchTextElement.getText().equals("Click to turn the switch ON");
        if (isSwitchOn) {
            switchElement.click();
        }
        //click on dropdown menu --> select first option
        WebElement ClickDropDown = appiumDriver.findElementByXPath("//android.view.ViewGroup[@content-desc='Dropdown']/android.view.ViewGroup/android.widget.EditText");
        ClickDropDown.click();
        WebElement selectFromMenu = appiumDriver.findElementByXPath("//*[@text='Appium is awesome']");
        selectFromMenu.click();


        // taking a screenshot
        File formScreenBase64Data = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.FILE);
        String formScreenFilePath = System.getProperty("user.dir") + "/screenshot/" + "ScreenTake.png";
        try {
            FileUtils.copyFile(formScreenBase64Data, new File(formScreenFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}