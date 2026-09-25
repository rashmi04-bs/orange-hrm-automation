package com.qa.orangehrm.basetest;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangehrm.configreader.ConfigReader;
import com.qa.orangehrm.driverfatory.DriverManager;
import com.qa.orangehrm.pageobjects.DashBoardPage;
import com.qa.orangehrm.pageobjects.LoginPage;
import com.qa.orangehrm.pageobjects.PIMPage;
import com.qa.orangehrm.pageobjects.RecruitmentPage;
import com.qa.orangehrm.utilities.DriverMethods;

public class BaseTest {
protected WebDriver driver;
protected DriverManager dm;
protected DriverMethods dms;
protected DashBoardPage dbg;
protected RecruitmentPage rp;
protected PIMPage pp;
protected LoginPage lp;
protected String Usern;
protected String passw;
@BeforeMethod
public void launchBrowser() throws Exception {
	dm= new DriverManager();
	
	String Browser= ConfigReader.getProperty("browserName");
	String Url = ConfigReader.getProperty("url");
	Usern = ConfigReader.getProperty("username");
	passw = ConfigReader.getProperty("password");
	driver = dm.initbrowser(Browser);
	dms= new DriverMethods(driver);
	dms.maximizeBrowser();
	dms.openUrl(Url);
	lp = new LoginPage(driver);
	
	
}
@AfterMethod
public void terminateBrowser() {
	if(dbg!=null) {
	dbg.doLogout();
	}
	dms.closeAllTabs();
}
}
