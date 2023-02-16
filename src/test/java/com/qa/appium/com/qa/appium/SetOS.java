package com.qa.appium.com.qa.appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

public class SetOS extends AppiumTest {
	

	@Test
	public void TestOs() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("OS")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"SMS Messaging\"]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("io.appium.android.apis:id/sms_enable_receiver")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys("7278512269");
		Thread.sleep(5000);
		driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys("Testing");
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Send")).click();
		
	}
    
    
    

}
