package com.qa.appium.com.qa.appium;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Swipe extends AppiumTest {
	
	@Test
	public void swipeDemo() throws Exception {
		
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
	touch.press(PointOption.point(256, 1115));
	touch .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)));
	touch.perform();
	Thread.sleep(5000);
	touch .moveTo(PointOption.point(256, 600));
	touch .release();
	touch .perform();
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
    Thread.sleep(5000);
    TouchAction touchAction = new TouchAction(driver);
    MobileElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[2]"));
	//Point location = firstImage.getLocation();
	//Dimension size = firstImage.getSize();
	int startX = 500;
	int startY = 1000;
	int endX = 500;
	int endY = 500;
	Duration duration = Duration.ofMillis(500);
	
	touchAction.press(PointOption.point(startX, startY))
    .waitAction(WaitOptions.waitOptions(duration))
    .moveTo(PointOption.point(endX, endY))
    .release()
    .perform();

    
   

	}

}
