package test.apilearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.utils.AppiumDriverEx;

import java.time.Duration;

public class SwipeVertically {
    public static void main(String[] args) {
        //Create a new session
        AppiumDriver<WebElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        //get the toggle label value before interacting with the switch
        WebElement formElement=appiumDriver.findElementByAccessibilityId(("Forms"));
        formElement.click();
        //Make sure I'm on the target screen
        WebDriverWait wait= new WebDriverWait(appiumDriver,30l);
        wait.until(ExpectedConditions.visibilityOf(appiumDriver.findElementByAccessibilityId("switch-text")));

        //Get the mobile screen sizes
        Dimension windowSize=appiumDriver.manage().window().getSize();
        int screenWidth= windowSize.width;
        int screenHeight=windowSize.height;

        //init the start points and get  to touch and relaase
        int xStartPoint=50 * screenWidth/100;
        int xEndPoint=xStartPoint;
        int yStartPoint=90*screenHeight/100;
        int yEndPoint=10*screenHeight/100;
        //Perform Touch Actionn
        PointOption startPoint=new PointOption<>().withCoordinates(xStartPoint,yStartPoint);
        PointOption endPoint=new PointOption().withCoordinates(xEndPoint,yEndPoint);
        TouchAction touchAction=new TouchAction(appiumDriver);
        //Scroll up Swipe from top to buttom
        touchAction.press(startPoint).waitAction(new WaitOptions()
                .withDuration(Duration.ofSeconds(1)))
                .moveTo(endPoint)
                .release()
                .perform();
        // Scroll down Swipe from top to bottom
        touchAction.press(endPoint)
                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(1)))
                .moveTo(startPoint)
                .release()
                .perform();


    }
}
