package com.qa.appium.com.qa.appium;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ViewText extends AppiumTest {
	
	@Test
	public void textClass() throws InterruptedException {
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
		driver.findElement(MobileBy.AccessibilityId("Buttons")).click();
		Thread.sleep(5000);
		String normalButton = driver.findElement(MobileBy.AccessibilityId("Normal")).getText();
		Assert.assertEquals(normalButton, "NORMAL");
       System.out.println("Get Text Is The : - " + normalButton);

	}

}
