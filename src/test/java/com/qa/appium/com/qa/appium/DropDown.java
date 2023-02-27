package com.qa.appium.com.qa.appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DropDown extends AppiumTest{
	@Test
	public void dropDownTest() throws Exception {
		
		WebElement element = new WebDriverWait(driver, 10)
		  .until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/spinnerCountry")));

		// Click on the element
		element.click();


		// Wait for the dropdown list to appear
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ListView")));

		// Locate the option to select by its value attribute
		TouchAction touch=	new TouchAction(driver);
		touch.press(PointOption.point(256, 1115));
		touch .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)));
		touch.perform();
		touch .moveTo(PointOption.point(756, 1200));
		touch .release();
		touch .perform();
		WebElement optionToSelect = new WebDriverWait(driver, 5)
				  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")));
		// Click or tap on the option to select
		optionToSelect.click();

		
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Pijus");
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();

	}

}
