package com.qa.appium.com.qa.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropDown extends AppiumTest{
	@Test
	public void dropDownTest() {
		// Locate the dropdown element by its ID
		WebElement dropdownElement = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));

		// Click or tap on the dropdown element to open the dropdown list
		dropdownElement.click();

		// Wait for the dropdown list to appear
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));

		// Locate the option to select by its text
		//WebElement optionToSelect = driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[text()='Option 1']"));

		// Click or tap on the option to select
		//optionToSelect.click();

	}

}
