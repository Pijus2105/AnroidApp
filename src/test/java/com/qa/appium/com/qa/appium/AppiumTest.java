package com.qa.appium.com.qa.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class AppiumTest {
	
	public AppiumDriver<MobileElement> driver;
	public AppiumDriverLocalService service;
@Test


	public void test() throws MalformedURLException, InterruptedException {
	//AppiumServiceBuilder builder = new AppiumServiceBuilder();
	
	long startupTimeout = 30; // in seconds
     service = new AppiumServiceBuilder()
            .withAppiumJS(new File("C:\\Users\\Elphill\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
            .withIPAddress("127.0.0.1")
            .usingPort(4723)
            .withStartUpTimeOut(startupTimeout, TimeUnit.SECONDS)
            .build();
             service.start();
              System.out.println("Appium server started");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0");
        caps.setCapability("deviceName", "emulator-5554");
       
        caps.setCapability("app", "C:\\Users\\Elphill\\eclipse-workspace\\com.qa.appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
        

        URL appiumServerUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appiumServerUrl, caps);
        
        Thread.sleep(startupTimeout);
        
       driver.findElement(MobileBy.AccessibilityId("OS")).click();
       


       //driver.quit();
       service.stop();
       System.out.println("Appium server stopped");
    }
}
