package com.qa.appium.com.qa.appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

public class ViewText extends AppiumTest {
	
	@Test
	public void textClass() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Buttons")).click();
		String btn =driver.findElement(MobileBy.AccessibilityId("Normal")).getText();
		System.out.println("Text is the :- " + btn);
		Assert.assertEquals(btn, "NORMAL");
		
		
	}

}
