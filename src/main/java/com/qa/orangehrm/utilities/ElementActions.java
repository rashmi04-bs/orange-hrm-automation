package com.qa.orangehrm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementActions extends BaseUtility{
	public ElementActions(WebDriver driver) {
		super(driver);
	}
   public WebElement getElement(By locator) {
	   return ws.waitForVisibility(locator);
   }
   public void doClick(By locator) {
	   getElement(locator).click();
	   
   }
   public void doClear(By locator) {
	   getElement(locator).clear();
   }
   public void doEnterValue(String value, By locator) {
	   getElement(locator).sendKeys(value);
   }
   public Boolean checkEleDisplayed(By locator) {
	   return getElement(locator).isDisplayed();
   }
   public Boolean checkEleEnabled(By locator) {
	   return getElement(locator).isEnabled();
   }
   public Boolean checkEleSelected(By locator) {
	   return getElement(locator).isSelected();
   }
   public String getEleText(By locator) {
	   return getElement(locator).getText();
   }
   public String getEleAttribute(By locator,String value) {
	   return getElement(locator).getAttribute(value);
	   
   }
}
