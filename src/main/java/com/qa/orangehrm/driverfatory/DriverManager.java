package com.qa.orangehrm.driverfatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.qa.orangehrm.errors.frameErrors;
import com.qa.orangehrm.frameworkException.FramException;

public class DriverManager {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public  WebDriver initbrowser(String browser) {
		switch (browser) {
		case "chrome":
			driver.set(new ChromeDriver());
			break;
		case "firefox" :
			driver.set(new FirefoxDriver());
			break;
		case "edge" :
			driver.set(new EdgeDriver());
		   break;
		default:Reporter.log(browser+" "+frameErrors.errormsg,true);
			throw new FramException(frameErrors.errormsg);
			
		}
		
	return getDriver();
	}
	public WebDriver getDriver() {
		return driver.get();
	}
}
