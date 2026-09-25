package com.qa.orangehrm.utilities;

import org.openqa.selenium.WebDriver;



public class BaseUtility {
	
	protected WebDriver driver;
	protected WaitStratergy ws;
	public BaseUtility(WebDriver driver) {
	this.driver=driver;
	ws = new WaitStratergy(driver);
	}
}
