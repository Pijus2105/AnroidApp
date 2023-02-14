package com.qa.appium.com.qa.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {
@Test
   
	public void test() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0");
        caps.setCapability("deviceName", "emulator-5554");
       
        caps.setCapability("app", "C:\\Users\\Elphill\\eclipse-workspace\\com.qa.appium\\src\\test\\java\\resources\\General-Store.apk");
        

        URL appiumServerUrl = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver<MobileElement> driver = new AndroidDriver<>(appiumServerUrl, caps);



       // driver.quit();
    }
}
