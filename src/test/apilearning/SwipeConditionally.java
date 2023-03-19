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

import javax.swing.table.TableRowSorter;
import java.time.Duration;

public class SwipeConditionally{
    public static void main(String[] args) {
        //Create a new session
        AppiumDriver<WebElement> appiumDriver = AppiumDriverEx.getAppiumDriver();
        //get the toggle label value before interacting with the switch
        WebElement SwipeElement=appiumDriver.findElementByAccessibilityId(("Swipe"));
        SwipeElement.click();
        //Make sure I'm on the target screen
        WebDriverWait wait= new WebDriverWait(appiumDriver,30l);
        wait.until(ExpectedConditions.visibilityOf(appiumDriver.findElementByXPath("//*[@text='Swipe horizontal']")));

        //Get the mobile screen sizes
        Dimension windowSize=appiumDriver.manage().window().getSize();
        int screenWidth= windowSize.width;
        int screenHeight=windowSize.height;

        //init the start points and get  to touch and relaase
        int xStartPoint=50 * screenWidth/100;
        int xEndPoint=10 * screenWidth/100;
        int yStartPoint=50*screenHeight/100;
        int yEndPoint=yStartPoint;
        //Perform Touch Actionn
        PointOption startPoint=new PointOption<>().withCoordinates(xStartPoint,yStartPoint);
        PointOption endPoint=new PointOption().withCoordinates(xEndPoint,yEndPoint);
        TouchAction touchAction=new TouchAction(appiumDriver);

        //Swipe From right to Left Until I see the Extendable Card and Swipe Time is less than 6
        int swipeTime=0;
        boolean notSeeingTheTargetCard= true;
        while(notSeeingTheTargetCard && swipeTime<5){
        try{
            boolean isTargetCardDisplayed=appiumDriver.findElementByXPath("//*[@text='EXTENDABLE']").isDisplayed();
            if(isTargetCardDisplayed)
                notSeeingTheTargetCard=false;
        }catch (Exception e){
            //swipe from right to left
            touchAction.press(startPoint).waitAction(new WaitOptions()
                            .withDuration(Duration.ofSeconds(1)))
                    .moveTo(endPoint)
                    .release()
                    .perform();
        }


        swipeTime++;

    }

    }
}
