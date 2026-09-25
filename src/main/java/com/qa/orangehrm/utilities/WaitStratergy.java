package com.qa.orangehrm.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.qa.orangehrm.constants.Waitconstants;

public class WaitStratergy {
protected WebDriver driver;
FluentWait<WebDriver> fw;
public WaitStratergy(WebDriver driver) {
	this.driver=driver;
	fw = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(Waitconstants.waittime))
			.pollingEvery(Duration.ofSeconds(Waitconstants.pollingtime)).ignoring(NoSuchElementException.class)
			.ignoring(StaleElementReferenceException.class);
			
}
public WebElement checkforElementPresence(By locator) {
	return fw.until(ExpectedConditions.presenceOfElementLocated(locator));
}
public WebElement waitForVisibility(By locator) {
	return fw.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
public WebElement WaitForClickable(By locator) {
	return fw.until(ExpectedConditions.elementToBeClickable(locator));
}
public Boolean waitForUrl(String url) {
	return fw.until(ExpectedConditions.urlContains(url));
}
public Boolean waitForTitle(String title) {
	return fw.until(ExpectedConditions.titleContains(title));
}
public Alert waitForAlert() {
	return fw.until(ExpectedConditions.alertIsPresent());
}
public WebDriver waitForframe(int index) {
	return fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
}
public WebDriver waitForframe(String nameorid) {
	return fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameorid));
}
}
	