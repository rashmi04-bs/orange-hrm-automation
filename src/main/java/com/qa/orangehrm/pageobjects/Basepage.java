package com.qa.orangehrm.pageobjects;

import org.openqa.selenium.WebDriver;


import com.qa.orangehrm.utilities.DriverMethods;
import com.qa.orangehrm.utilities.ElementActions;



public class Basepage {
	protected WebDriver driver;
	protected ElementActions ea;
	protected DriverMethods act;
	public Basepage(WebDriver driver) {
		this.driver=driver;
		ea = new ElementActions(driver);
		act = new DriverMethods(driver);
	}
}
