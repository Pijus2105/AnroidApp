package com.qa.appium.com.qa.appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class LongPress extends AppiumTest {
	
	@Test
	public void longPressButton() throws Exception {
		Thread.sleep(5000);
		
		TouchAction touch=	new TouchAction(driver);
		touch.press(PointOption.point(256, 1115));
		touch .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)));
		touch.perform();
		touch .moveTo(PointOption.point(256, 600));
		touch .release();
		touch .perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
        
        WebElement elem = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
        	    "elementId", ((RemoteWebElement) elem).getId(), "duration", "2000"));
        
        String peopeleText = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
        Assert.assertEquals(peopeleText, "Sample menu");
        
        
        
        
        

        
        
        
	}

}
