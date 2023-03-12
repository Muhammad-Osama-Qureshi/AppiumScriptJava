package test.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverEx {
   public static AppiumDriver<WebElement> getAppiumDriver(){
       AppiumDriver<WebElement> appiumDriver=null;

       try{

           DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
           desiredCapabilities.setCapability(MoblieCapabilityTypeEx.PLATFORM_NAME,"Android");
           desiredCapabilities.setCapability(MoblieCapabilityTypeEx.AUTOMATION_NAME,"uiautomator2");
           desiredCapabilities.setCapability(MoblieCapabilityTypeEx.UDID,"RF8N715KD9T");
           desiredCapabilities.setCapability(MoblieCapabilityTypeEx.APP_PACKAGE,"com.wdiodemoapp");
           desiredCapabilities.setCapability(MoblieCapabilityTypeEx.APP_ACTIVITY,"com.wdiodemoapp.MainActivity");
           desiredCapabilities.setCapability(MoblieCapabilityTypeEx.NEW_COMMAND_TIMEOUT,120);
           URL appiumServer=new URL("http://localhost:4723/wd/hub");
           appiumDriver=new AppiumDriver<>(appiumServer,desiredCapabilities);
           appiumDriver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);


       } catch(Exception e){

           e.printStackTrace();


       }
       return appiumDriver;
   }
}

