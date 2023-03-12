package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Runapp {
    public static void main(String args[]){
       try{
           AppiumDriver<WebElement>appiumDriver;
           DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
           desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
           desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
           desiredCapabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
           desiredCapabilities.setCapability("appPackage","com.wdiodemoapp");
           desiredCapabilities.setCapability("appActivity","com.wdiodemoapp.MainActivity");

           URL appiumServer=new URL("http://localhost:4724/wd/hub");
           appiumDriver=new AppiumDriver<>(appiumServer,desiredCapabilities);

       } catch(Exception e){

e.printStackTrace();


       }
    }}
