package com.qa.appium.com.qa.appium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HybridAppTest extends AppiumTest {
	
	private Object AppiumBy;

	@Test
	public void hybridApp() throws Exception {
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
				touch .moveTo(PointOption.point(256, 1200));
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
				
				Thread.sleep(5000);
				driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
				
				Thread.sleep(3000);
				
				touch.press(PointOption.point(256, 1115));
				touch .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)));
				touch.perform();
				touch .moveTo(PointOption.point(256, 600));
				touch .release();
				touch .perform();
				
				
				
				Thread.sleep(3000);
				int count  = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
				System.out.println(count);
				
				for(int i=0; i<count; i++) {
					
					String product = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
					Thread.sleep(3000);
					if(product.equalsIgnoreCase("Air Jordan 1 Mid SE")) {
						
						driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
						
					}
					
				}
				
				Thread.sleep(3000);
				driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
				
				
				
				Thread.sleep(3000);
				Set<String> contextNames = driver.getContextHandles();
				for (String contextName : contextNames) {
				    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
				    
			    
				}
				driver.context("WEBVIEW_com.androidsample.generalstore");
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys("Elphill Technology pvt. ltd.");
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				
				
	}

}
