package com.qa.appium.com.qa.appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ToastMessage extends AppiumTest {
	
	@Test
	public void toastMessage() throws Exception {
		
		WebElement element = new WebDriverWait(driver, 10)
				  .until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/spinnerCountry")));
				
				element.click();
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ListView")));

				
				TouchAction touch=	new TouchAction(driver);
				touch.press(PointOption.point(256, 1115));
				touch .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)));
				touch.perform();
				touch .moveTo(PointOption.point(756, 1200));
				touch .release();
				touch .perform();
				WebElement optionToSelect = new WebDriverWait(driver, 5)
						  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")));
		
	
				optionToSelect.click();
				
				Thread.sleep(3000);
				driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
				
				// Wait for the toast message to be displayed
				WebDriverWait waite = new WebDriverWait(driver, 10);
				waite.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//anroid.widget.Toast)[1]")));

				// Locate the toast message element and get its text
				String toastMsg = driver.findElement(By.xpath("(//anroid.widget.Toast)[1]")).getText();

				// Verify that the toast message text is correct
				Assert.assertEquals(toastMsg, "Please enter your name");
	}


}
